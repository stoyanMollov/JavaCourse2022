package examPreparation;

import java.util.Locale;
import java.util.Scanner;

public class ActivatinonKey_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Reading Activation key from the console.
        String activationKey = scanner.nextLine();

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Generate")){
            String[] tokens = inputLine.split(">>>");
            String command = tokens[0];
            String subStringTokens = "";
            int startIndex = 0;
            int endIndex = 0;
            switch (command){
                case "Contains":
                    subStringTokens = tokens[1];

                    if (activationKey.contains(subStringTokens)){
                        System.out.printf("%s contains %s%n", activationKey,subStringTokens);
                    }else{
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String uppertOrLowear = tokens[1];
                    startIndex = Integer.parseInt(tokens[2]);
                    endIndex = Integer.parseInt(tokens[3]);
                    subStringTokens = activationKey.substring(startIndex,endIndex);

                    if (uppertOrLowear.equals("Upper")){
                        activationKey = activationKey.replace(subStringTokens,subStringTokens.toUpperCase());
                    }else {
                        activationKey =  activationKey.replace(subStringTokens,subStringTokens.toLowerCase());
                    }

                    System.out.println(activationKey);

                    break;
                case "Slice":
                    startIndex = Integer.parseInt(tokens[1]);
                    endIndex = Integer.parseInt(tokens[2]);

                    subStringTokens = activationKey.substring(startIndex,endIndex);
                    activationKey = activationKey.replace(subStringTokens,"");
                    System.out.println(activationKey);
                    break;
            }
            inputLine = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n",activationKey);
    }
}
