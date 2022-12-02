package regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[A-Za-z]";
        String string = "Hello Java";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        String res1 = matcher.replaceAll("hi");
        String res2 = matcher.replaceFirst("hi");
    }
}
