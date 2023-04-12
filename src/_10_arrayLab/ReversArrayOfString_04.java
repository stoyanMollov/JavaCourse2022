package _10_arrayLab;

import java.util.Scanner;

public class ReversArrayOfString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String[] strArray = str.split(" ");

        for (int i = strArray.length - 1; i >= 0 ; i--) {
            System.out.printf(strArray[i] + " ");
        }
    }
}
