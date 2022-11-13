package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> resourcesMap = new LinkedHashMap<>();
        String resources = " ";
        while (!resources.equals("stop")){
            resources = scanner.nextLine();

            if (!resources.equals("stop")){
                int quantity = Integer.parseInt(scanner.nextLine());

                if (!resourcesMap.containsKey(resources)){
                    resourcesMap.put(resources,quantity);
                }else {
                    int value = resourcesMap.get(resources);
                    resourcesMap.put(resources, value += quantity);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key +" " + "->" + " " + value);
        }
    }
}
