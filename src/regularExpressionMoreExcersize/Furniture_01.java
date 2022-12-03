package regularExpressionMoreExcersize;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        List<String> furnitureNames = new ArrayList<>();
        Double totalSum = 0.0;

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        while(!text.equals("Purchase")){
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()){
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitureNames.add(furniture);

                double currentFurniturePrice = price * quantity; // колко е платено за текущата мебел
                totalSum += currentFurniturePrice;
            }
            text = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureNames.forEach(System.out::println);

        System.out.printf("Total money spend: %.2f",totalSum);

    }
}
