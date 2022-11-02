package arrayLab;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dayOfWeek = new String[] {"Monday", "Tuesday", "Wednesday",
                                           "Thursday", "Friday", "Saturday",
                                           "Sunday"};

        int number = Integer.parseInt(scanner.nextLine());

        if (number <= 7 && number > 0){
            System.out.println(dayOfWeek[number - 1]);
        }else {
            System.out.println("Invalid day!");
        }

    }
}
