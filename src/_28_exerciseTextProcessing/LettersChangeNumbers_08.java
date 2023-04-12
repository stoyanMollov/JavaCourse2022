package _28_exerciseTextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // A12b s17G
        String[] codes = input.split("\\s+");

        double totalSum = 0; // сума от всички кодове

        for (String code : codes){
            //kod: {буква}{число}{буква}
            // модифицирам си кода спямо буквите
            double modifierNumber = getModierNumber(code);
            totalSum += modifierNumber;
        }

        System.out.printf("%.2f", totalSum);
    }

    private static double getModierNumber(String code) {
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter,' ').replace(secondLetter,' '));

        // проверка да ли първата ми биква е главна или малка

        if (Character.isUpperCase(firstLetter)){
            int positionUpperLetter = (int)firstLetter - 64;
            number /= positionUpperLetter;
        }else {
            int positionLowerLetter = (int) firstLetter - 96;
            number *= positionLowerLetter;
        }

        //2. проверка за secondLetter -> главна или малка
        if (Character.isUpperCase(secondLetter)){
            int positionUpperLetter = (int)secondLetter - 64;
            number -= positionUpperLetter;
        }else {
            int positionLowerLetter = (int) secondLetter - 96;
            number += positionLowerLetter;
        }

        // връщам модифицираното числ спрямо промените буквите
        return number;
    }
}
