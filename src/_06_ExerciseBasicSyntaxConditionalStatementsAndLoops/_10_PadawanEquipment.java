package _06_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double theAmountOfMoney = scanner.nextDouble();
        int countOfStudent = scanner.nextInt();
        double priceOfLightSabers = scanner.nextDouble();
        double priceOfRobes = scanner.nextDouble();
        double priceOfBelts = scanner.nextDouble();
        int freeStudents = 0;
        double freeBeltPrice = 0;


        double morePercent = Math.ceil(countOfStudent + (countOfStudent * 10)/100.0);
        double totalPriceLightSaber = priceOfLightSabers * morePercent;

        double totalPriceRobes = countOfStudent * priceOfRobes;
        double totalPriceBelts = countOfStudent * priceOfBelts;
        double totalSum = totalPriceBelts + totalPriceRobes + totalPriceLightSaber;

        if (countOfStudent >= 6){
            freeStudents = countOfStudent / 6;
            freeBeltPrice = freeStudents * priceOfBelts;
        }

        if (totalSum <= theAmountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",totalSum - freeBeltPrice );
        }else {
            double difference = totalSum - theAmountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.",difference - freeBeltPrice);
        }
    }
}
