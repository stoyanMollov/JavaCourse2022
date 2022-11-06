package ExerciseAssociativeArrays;

import java.awt.image.ImageProducer;
import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // key: името на студента -> value: списък с оценки
        Map<String, List<Double>> studentGrade = new LinkedHashMap<>();

        int countStudents = Integer.parseInt(scanner.nextLine());

        for (int student = 1; student <= countStudents; student++) {
            String name = scanner.nextLine(); // името на съответния студент.
            double grade = Double.parseDouble(scanner.nextLine()); // оценката на студента
            // 1. да не е записан
            if(!studentGrade.containsKey(name)){
                studentGrade.put(name, new ArrayList<>());
            }

            // 2. да е записан

            studentGrade.get(name).add(grade);
        }
        // име на студента -> списък с оценки (studentsGrade)
        // записи: име на студента(key) -> ср. оценка (value)
        Map<String,Double> averageGradeStudent = new LinkedHashMap<>();

        for (Map.Entry<String,List<Double>> entry:studentGrade.entrySet()) {
            String studentName = entry.getKey(); // името на студента
            List<Double> listGrades = entry.getValue(); // списъка с оценките за всеки студент.
            double averageGrade = getAverageGrade(listGrades);
            if (averageGrade >= 4.50){
                averageGradeStudent.put(studentName, averageGrade);
            }
        }
        // отпечатваме: averageGradeStudent
        averageGradeStudent.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));


    }

    private static double getAverageGrade(List<Double> listGrades) {
        // {4.60, 3.50, 5.98, 4.70, 2.50}
        // средно аритметично = сбора от оценките / брой

        double sumGrades = 0;

        for (double grade:listGrades) {
            sumGrades += grade; // сбора от оценките
        }
        return sumGrades / listGrades.size();
    }
}
