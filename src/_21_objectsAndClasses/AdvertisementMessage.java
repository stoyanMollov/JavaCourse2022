package _21_objectsAndClasses;


import java.util.*;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. " +
                "I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int numberMessages = Integer.parseInt(scanner.nextLine());

        Random randy = new Random();
        for (int i = 0; i < numberMessages ; i++) {

            System.out.println(phrases[randy.nextInt(phrases.length)] + " " + events[randy.nextInt(events.length)] + " "
                    + authors[randy.nextInt(authors.length)]+ " - " + cities[randy.nextInt(cities.length)]);
        }
    }
}