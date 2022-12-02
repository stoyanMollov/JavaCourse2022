package moreExerciseTextProcessing;

import java.util.Scanner;

public class ExtractPearsonInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            StringBuilder text = new StringBuilder(scanner.nextLine());

            int startIndexName = (text.indexOf("@")) + 1;
            int endIndexName = text.indexOf("|");

            String name = text.substring(startIndexName,endIndexName);

            int startIndexAge = (text.indexOf("#")) + 1;
            int endIndexAge = text.indexOf("*");

            String age = text.substring(startIndexAge ,endIndexAge);

            System.out.printf("%s is %s years old.%n", name,age);
        }
    }
}
