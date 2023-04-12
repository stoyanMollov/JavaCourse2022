package _19_examPreparation;

import java.util.Scanner;

public class FencyBarcode_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";

        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();


        }
    }
}
