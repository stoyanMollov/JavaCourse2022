package exerciseTextProcessing;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encryptedText  = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            char encryptesSymbol = (char)(symbol + 3);
            encryptedText.append(encryptesSymbol);
        }
        System.out.println(encryptedText);
    }
}
