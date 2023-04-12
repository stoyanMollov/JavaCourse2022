package _25_ExerciseAssociativeArrays;

import java.util.*;
import java.util.List;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine(); // валидна команда или Lumpawaroo
        // записи: група (side) -> списък с user-u
        Map<String, List<String>> map = new LinkedHashMap<>();
        while (!command.equals("Lumpawaroo")){
            // command = "{force_side} | {force_user}"
            // command = "{force_user} -> {force_side}"

            //проверка коя команда е въведена
            if (command.contains(" | ")){
                //{force_side} | {force_user}
                String group = command.split("\\s+\\|\\s+")[0];
                String userName = command.split("\\s+\\|\\s+")[1];
                //1.да ли имаме такава група
                if (!map.containsKey(group)){
                    // група -> празен списък
                    map.put(group,new ArrayList<>());
                }
                //2. имаме такав група -> добавяме към групата user, ако го няма в никоя група
                boolean isExistUser = false; // user го има в дадена група
                for (List<String> listUsers: map.values()) {
                    if(listUsers.contains(userName)){
                        isExistUser = true;
                        break;
                    }
                }
                if(!isExistUser){
                    map.get(group).add(userName);
                }
            }else if(command.contains(" -> ")) {
                //{force_user} -> {force_side}
                String user = command.split("\\s+->\\s+")[0];
                String group =command.split("\\s+->\\s+")[1];

                // 1, ако дадения user го има в дадена група -> премахваме го
                //запис: група (key) -> списък с users (value)
                map.entrySet().forEach(entry -> entry.getValue().remove(user));

                // 2. проверяваме да ли имаме такава група.

                if (map.containsKey(group)){
                    map.get(group).add(user);
                }else {
                    // ако нямаме такава група в която искаме да отиде -> създава ме тази грипа
                    map.put(group, new ArrayList<>());
                    map.get(group).add(user);
                }
                System.out.printf("%s joins the %s side!%n",user,group);
            }

            command = scanner.nextLine();
        }
        //запис: група->списък user-u
        //1.филтрираме записите -> списъка с хора не е празен.
        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0) // оставяме записите, които ни отговарят на условиет
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(),entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.println("! " + user));
                });
    }
}
