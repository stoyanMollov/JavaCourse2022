package _25_ExerciseAssociativeArrays;

import java.util.*;

public class CompanyUser_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();
        String command = scanner.nextLine();

        while (!command.contains("End")){
            //{company name -> employe ID}
            if (command.contains(" -> ")){
                String companyName = command.split(" -> ")[0];
                String employeeID = command.split(" -> ")[1];

                if (!companyEmployees.containsKey(companyName)){
                    companyEmployees.put(companyName, new ArrayList<>());
                }
                if (!companyEmployees.get(companyName).contains(employeeID)){
                    companyEmployees.get(companyName).add(employeeID);
                }

            }
            command = scanner.nextLine();
        }

        companyEmployees.entrySet().stream().forEach(company -> {
            System.out.println(company.getKey());
            company.getValue().forEach(employee -> System.out.println("-- "+employee));
        });
    }
}
