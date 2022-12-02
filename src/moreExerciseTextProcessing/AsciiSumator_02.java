package moreExerciseTextProcessing;

import java.util.Scanner;

public class AsciiSumator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        String someRandomText = scanner.nextLine();

        int start = Math.min(firstSymbol,secondSymbol);
        int end = Math.max(firstSymbol,secondSymbol);

        int sum = 0;
        for (int i = 0; i < someRandomText.length(); i++){
            int currentSymbol = (int)someRandomText.charAt(i);

            if(currentSymbol > start && currentSymbol < end){
                sum += currentSymbol;
            }
        }
        System.out.println(sum);


    }
}
