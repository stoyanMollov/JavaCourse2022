package textProcessing;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bandWordsArr = scanner.nextLine().split(", ");
        String text= scanner.nextLine();

        for (String band: bandWordsArr) {
            text = text.replace(band,repeatString("*",band.length()));
        }
        System.out.println(text);
    }
    public static String repeatString(String str, int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result += str;
        }
        return  result;
    }
}
