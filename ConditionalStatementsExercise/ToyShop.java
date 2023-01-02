package ConditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        double raisePrize = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double puzzlePrize = puzzle * 2.60;
        double dollsPrize = dolls * 3.0;
        double bearsPrize = bears * 4.10;
        double minionsPrize = minions * 8.20;
        double trucksPrize = trucks * 2.0;
        double sum = puzzlePrize + dollsPrize + bearsPrize + minionsPrize + trucksPrize;
        int toys = puzzle + dolls + bears + minions + trucks;

        double totalPrize = 0;
        double discount = 0;
        if (toys >= 50) {
            discount = sum * 0.25;
            totalPrize = sum - discount;
        } else {
            discount = 0;
            totalPrize = sum;
        }

        totalPrize = totalPrize - totalPrize * 0.10;
        double diff = Math.abs(totalPrize - raisePrize);
        if (totalPrize >= raisePrize) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }



    }
}
