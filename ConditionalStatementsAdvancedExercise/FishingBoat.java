package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishmen = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
                price = 4200;
                break;
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }

        if (fishmen <= 6) {
            price = price - price * 0.10;
        } else if (fishmen <= 11) {
            price = price - price * 0.15;
        } else {
            price = price - price * 0.25;
        }

        if (season.equals("Autumn")) {
            price = price;
        } else if (fishmen % 2 == 0) {
            price = price - price * 0.05;
        }

        double diff = Math.abs(budget - price);

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
