package NestedLoops;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        double sum = 0;
        boolean isGoing = false;
        while (!word.equals("End")) {
            double neededMoney = Double.parseDouble(scanner.nextLine());

            while (sum < neededMoney) {
                double money = Double.parseDouble(scanner.nextLine());
                sum = sum + money;
            }

            if (sum >= neededMoney) {
                isGoing = true;
                sum = 0;
                System.out.printf("Going to %s!%n", word);
            }

            word = scanner.nextLine();
        }
    }
}
