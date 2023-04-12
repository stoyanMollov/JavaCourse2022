package _28_exerciseTextProcessing;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме входните данни

        String text = scanner.nextLine();

        String[] textArr = text.split(", ");

        for (String username : textArr) {
            if (isValidUsername(username)){
                System.out.println(username);
            }
        }
    }
    public static boolean isValidUsername(String userName){
        if (userName.length() < 3 || userName.length() > 16 ){
            return false;
        }

        for (char symbols: userName.toCharArray()) {
            if (!Character.isLetterOrDigit(symbols) && symbols != '-' && symbols != '_'){
                return false;
            }
        }
        return true;
    }
}
