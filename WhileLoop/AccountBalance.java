package WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        double sum = 0;
        boolean isInvalid = false;
        while (!word.equals("NoMoreMoney")) {
            double money = Double.parseDouble(word);
            if (money < 0) {
                isInvalid = true;
                break;
            }

            System.out.printf("Increase: %.2f%n", money);

            sum = sum + money;
            word = scanner.nextLine();

        }

        if (isInvalid) {
            System.out.println("Invalid operation!");
            System.out.printf("Total: %.2f", sum);
        } else {
            System.out.printf("Total: %.2f", sum);
        }

    }
}
