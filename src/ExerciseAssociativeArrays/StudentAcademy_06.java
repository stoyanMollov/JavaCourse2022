package ExerciseAssociativeArrays;

import java.awt.image.ImageProducer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // key: името на студента -> value: списък с оценки
        Map<String, List<Double>> studentGrade = new LinkedHashMap<>();

        int countStudents = Integer.parseInt(scanner.nextLine());

        for (int student = 1; student <= countStudents; student++) {
            String name = scanner.nextLine(); // името на съответния студент.
            double grade = Integer.parseInt(scanner.nextLine()); // оценката на студента
            // 1. да не е записан
            // 2. да е записан
        }
    }
}
