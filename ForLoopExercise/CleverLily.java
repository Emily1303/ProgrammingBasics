package ForLoopExercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double money = 0;
        double sum = 0;
        int toysNumber = 0;
        double moneyBrother = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money = money + 10;
                sum = sum + money;
                moneyBrother = moneyBrother + 1;
            } else {
                toysNumber = toysNumber + 1;
            }
        }

        double toys = toysNumber * toyPrice;
        sum = sum + toys - moneyBrother;

        double diff = Math.abs(sum - washingMachine);
        if (sum >= washingMachine) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
