package _25_ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> productsPrice = new LinkedHashMap<>(); // продукт -> ед. цена
        Map<String, Integer> productQuantity = new LinkedHashMap<>();// продукт -> бройь

        while(!input.equals("buy")){
            String product = input.split(" ")[0];
            double pricePerProduct = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            productsPrice.put(product, pricePerProduct);

            if(!productQuantity.containsKey(product)){
                productQuantity.put(product, quantity);
            }else{
                productQuantity.put(product,productQuantity.get(product) + quantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productsPrice.entrySet()) {
            String productName = entry.getKey();
            double finalPrice = entry.getValue() * productQuantity.get(entry.getKey());
            System.out.printf("%s -> %.2f%n", productName, finalPrice);
        }

        //productsPrice.forEach((k,v) -> System.out.printf("%s -> %.2f%n",k,v));
    }
}
