package ExerciseAssociativeArrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+","");

        // символ -> бр. срещания

        Map<Character,Integer> symbolsCount = new LinkedHashMap<>();
                // HashMap -> няма значение какъв ще бъде редът на записите.
        //LinkHashMap -> Записите се подреждат според реда на добавяне.
        //TreeMap -> записите се сортират спямо техния ключ.

        for (char symbol:text.toCharArray()) {

            /*if (symbol == ' '){
                continue; // пропуска всичко и преминава към следващия символ.
            }*/
            if (!symbolsCount.containsKey(symbol)){
                symbolsCount.put(symbol, 1);
            }
            else {
                int currentCount = symbolsCount.get(symbol);
                symbolsCount.put(symbol, currentCount + 1);
            }
        }

        // отпечатване
        // Символ -> бр. Срещания
        symbolsCount.entrySet().forEach(entry ->
                                System.out
                                .println(entry.getKey() + " -> " + entry.getValue()));
    }
}
