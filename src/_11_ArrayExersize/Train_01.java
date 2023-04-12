package _11_ArrayExersize;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String n = scan.nextLine();
        int[] wagons = new int[n.length()];

        for (int wagon = 0; wagon < wagons.length; wagon++) {
            int countPeople = Integer.parseInt(scan.nextLine());
            wagons[wagon] = countPeople;
        }
        int sum = 0;
        for (int number:wagons) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
