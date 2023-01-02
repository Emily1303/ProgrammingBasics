package ConditionalStatementsExercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoPrize = videoCards * 250;
        double cpuPrize = videoPrize * 0.35 * cpu;
        double ramPrize = videoPrize * 0.10 * ram;
        double sum = videoPrize + cpuPrize + ramPrize;

        double totalPrize = 0;
        if (videoCards > cpu) {
            totalPrize = sum - sum * 0.15;
        } else {
            totalPrize = sum;
        }
        double diff = Math.abs(totalPrize - budget);

        if (budget >= totalPrize) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }

    }
}
