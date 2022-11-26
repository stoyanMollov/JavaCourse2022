package textProcessing;

import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Agd#53Dfg^&4F53
        String text = scanner.nextLine();

        StringBuilder digitDB = new StringBuilder();
        StringBuilder lettersDB = new StringBuilder();
        StringBuilder symbolsDB = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            // проверка за цифри

            if (Character.isDigit(symbol)){
                digitDB.append(symbol);
            } else if (Character.isLetter(symbol)) {
                lettersDB.append(symbol);
            } else {
                symbolsDB.append(symbol);
            }
        }

        System.out.println(digitDB);
        System.out.println(lettersDB);
        System.out.println(symbolsDB);
    }
}
