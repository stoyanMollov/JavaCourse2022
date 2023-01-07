package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = scanner.nextInt();
        double price = 0;
        double currentPrice = 0;
        double totalPrice = 0;

        for (int i = 0; i < orders; i++) {
            price = 0;
            double pricePerCapsules = scanner.nextDouble();
            int days = scanner.nextInt();
            int capsulesCount = scanner.nextInt();

            price += (days * capsulesCount * pricePerCapsules);
            currentPrice = price;
            totalPrice += currentPrice;
            System.out.printf("The price for the coffee is: $%.2f%n",price );
        }
        System.out.printf("Total: $%.2f%n", totalPrice);
    }
}
