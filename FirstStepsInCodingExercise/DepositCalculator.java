package FirstStepsInCodingExercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

//        double sum = deposit + months * ((deposit * percent / 100) / 12);
//
//        System.out.println(sum);

        double percent1 = (deposit * percent / 100) / 12;
        double sum = deposit + months * percent1;

        System.out.println(sum);
    }
}
