package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (flowers) {
            case "Roses":
                price = numberOfFlowers * 5.00;
                break;
            case "Dahlias":
                price = numberOfFlowers * 3.80;
                break;
            case "Tulips":
                price = numberOfFlowers * 2.80;
                break;
            case "Narcissus":
                price = numberOfFlowers * 3.00;
                break;
            case "Gladiolus":
                price = numberOfFlowers * 2.50;
                break;
        }

        if (flowers.equals("Roses") && numberOfFlowers > 80) {
            price = price - price * 0.10;
        } else if (flowers.equals("Dahlias") && numberOfFlowers > 90) {
            price = price - price * 0.15;
        } else if (flowers.equals("Tulips") && numberOfFlowers > 80) {
            price = price - price * 0.15;
        } else if (flowers.equals("Narcissus") && numberOfFlowers < 120) {
            price = price + price * 0.15;
        } else if (flowers.equals("Gladiolus") && numberOfFlowers < 80) {
            price = price + price * 0.20;
        }

        double diff = Math.abs(budget - price);
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }

    }
}
