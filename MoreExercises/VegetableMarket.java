package Exercise;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegPrize = Double.parseDouble(scanner.nextLine());
        double fruitPrize = Double.parseDouble(scanner.nextLine());
        int vegetable = Integer.parseInt(scanner.nextLine());
        int fruit = Integer.parseInt(scanner.nextLine());

        double totalVeg = vegPrize * vegetable;
        double totalFruit = fruit * fruitPrize;
        double sum = totalFruit + totalVeg;
        double euro = sum / 1.94;
        System.out.printf("%.2f", euro);

    }
}
