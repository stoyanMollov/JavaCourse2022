package moreExerciseTextProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class TreaserHunt_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder charSB = new StringBuilder();
        int countText = 0;
        int[] keys = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String text = scanner.nextLine();

        char[] textCharArray = text.toCharArray();
        int textCharArrayLength =  textCharArray.length;
        while (!text.equals("find")) {

            while(textCharArrayLength > 0){

                for (int i = 0; i < keys.length; i++) {
                    charSB.append((char) (textCharArray[countText] - keys[i]));
                    textCharArrayLength--;
                    countText++;
                }
            }

            text = scanner.nextLine();
            
        }
        System.out.println(charSB);
    }
}


