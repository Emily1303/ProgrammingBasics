package FirstStepsInCodingExercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int dye = Integer.parseInt(scanner.nextLine());
        int dye1 = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double dyePrice = (dye + (dye * 10.0 / 100)) * 14.50;
        double dye1Price = dye1 * 5.0;
        double price = nylonPrice + dyePrice + dye1Price + 0.40;
        double money = price * 30 / 100;
        double totalPrice = price + money * hours;

        System.out.println(totalPrice);

    }
}
