package LabAssociativeArraysLambdaAndStreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LifeDemo {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> fruitsMap = new LinkedHashMap<>();

        fruitsMap.put("apple", 2.20);
        fruitsMap.put("banana", 3.80);

        for (Map.Entry<String, Double> entry : fruitsMap.entrySet()) {
            String currentKey = entry.getKey();
            Double currentPrice = entry.getValue();
            System.out.printf("%s - %f%n", currentKey, currentPrice);
        }

    }
}
