package FirstStepsInCodingExercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pensPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double litersPrice = liters * 1.20;
        double price = pensPrice + markersPrice + litersPrice;
        double percent = price * discount / 100;
        double totalPrice = price - percent;

        System.out.println(totalPrice);
    }
}
