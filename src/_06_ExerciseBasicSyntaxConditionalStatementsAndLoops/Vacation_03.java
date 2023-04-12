package _06_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double totalPrice = 0;
        double reducePercent = 0;

        if (group.equals("Students")){
            switch (dayOfWeek) {
                case "Friday":
                    totalPrice = peopleCount * 8.45;
                    break;
                case "Saturday":
                    totalPrice = peopleCount * 9.80;
                    break;
                case "Sunday":
                    totalPrice = peopleCount * 10.46;
                    break;
            }
            if (peopleCount >= 30){
                reducePercent = (totalPrice * 15) / 100;
                totalPrice -= reducePercent;
            }
        } else if (group.equals("Business")) {
            if (peopleCount >= 100){
                peopleCount -= 10;
            }
            switch (dayOfWeek){
                case "Friday":
                    totalPrice = peopleCount * 10.90;
                    break;
                case "Saturday":
                    totalPrice = peopleCount * 15.60;
                    break;
                case "Sunday":
                    totalPrice = peopleCount * 16;
                    break;
            }
        } else if (group.equals("Regular")) {
            switch (dayOfWeek){
                case "Friday":
                    totalPrice = peopleCount * 15;
                    break;
                case "Saturday":
                    totalPrice = peopleCount * 20;
                    break;
                case "Sunday":
                    totalPrice = peopleCount * 22.50;
                    break;
            }

            if (peopleCount >= 10 && peopleCount <=20){
                totalPrice -= (totalPrice * 5) / 100;
            }
        }
        System.out.printf("Total price: %.2f%n", totalPrice);
    }
}
