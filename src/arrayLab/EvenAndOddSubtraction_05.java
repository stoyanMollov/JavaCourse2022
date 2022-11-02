package arrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // reading array on single line with space between them, and then parsing to int
        int[] numbers = Arrays.stream(scanner
                        .nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e))
                        .toArray();
    }
}
