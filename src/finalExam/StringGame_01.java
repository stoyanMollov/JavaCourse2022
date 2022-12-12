package finalExam;

import java.util.Scanner;

public class StringGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String commands = scanner.nextLine();
        StringBuilder newStringSB = new StringBuilder();

        while (!commands.equals("Done")){

            String[] arrayCommands = commands.split(" ");
            String commandLine = arrayCommands[0];

            switch (commandLine){
                case "Change":
                        String symbolFind = arrayCommands[1];
                        String symbolChange = arrayCommands[2];
                         newStringSB.append(input.replace(symbolFind,symbolChange));
                        System.out.println(newStringSB);
                    break;
                case "Includes":
                        String substring = arrayCommands[1];
                        boolean result = newStringSB.toString().contains(substring);
                        if (result){
                            System.out.println("True");
                        }else{
                            System.out.println("False");
                        }
                    break;
                case "End":
                        String endString = arrayCommands[1];
                        boolean resultEnd = newStringSB.toString().endsWith(endString);
                        if (resultEnd){
                            System.out.println("True");
                        }else {
                            System.out.println("False");
                        }
                    break;
                case "Uppercase":
                    System.out.println(newStringSB.append(newStringSB.toString().toUpperCase()));
                    break;
                case "FindIndex":
                        String toFindTheChar = arrayCommands[1];
                        int resultIndex = newStringSB.indexOf(toFindTheChar);
                        char resultChar = newStringSB.charAt();
                        System.out.println(resultChar);
                    break;
                case "Cut":
                        int startIndex = Integer.parseInt(arrayCommands[1]);
                        int endIndex = Integer.parseInt(arrayCommands[2]);

                        String resultSB = newStringSB.substring(startIndex,endIndex);
                        System.out.println(resultSB);
                    break;
            }
            commands = scanner.nextLine();
        }
    }
}
