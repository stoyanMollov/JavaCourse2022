package _10_arrayLab;

import java.util.Scanner;

public class PrintingNumbersInReversOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[length];

        for (int number = 0; number <= numbers.length - 1; number++) {
            numbers[number] = Integer.parseInt(scanner.nextLine());
        }

        // принтиране на масива в обратен ред:

        for (int number = numbers.length - 1; number >= 0; number--) {
            System.out.printf(numbers[number] + " ");
        }
    }
}
