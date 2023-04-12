package _06_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class TriangleNumber_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
