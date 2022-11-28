package exerciseTextProcessing;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //abv>1>1>2>2asdasd
        StringBuilder textBuilder = new StringBuilder(input);

        int totalStrength = 0;
        for (int positon = 0; positon < textBuilder.length(); positon++) {
            char currentSymbol = textBuilder.charAt(positon);

            if (currentSymbol == '>'){
                int strength = Integer.parseInt(textBuilder.charAt(positon + 1) + "");
                totalStrength += strength;
            } else if (currentSymbol != '>' && totalStrength > 0) {
                textBuilder.deleteCharAt(positon);
                totalStrength--;
                positon--;
            }
        }
        System.out.println(textBuilder);

    }
}
