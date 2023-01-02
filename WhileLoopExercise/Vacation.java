package WhileLoopExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacation = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int countDays = 0;
        int countSpendingMoney = 0;

        boolean isSpend = false;
        while (money < vacation) {
            String action = scanner.nextLine();
            double newMoney = Double.parseDouble(scanner.nextLine());

            countDays++;

            switch (action) {
                case "save":
                    countSpendingMoney = 0;
                    money = money + newMoney;
                    break;
                case "spend":
                    countSpendingMoney++;
                    money = money - newMoney;
                    if (money < 0) {
                        money = 0;
                    }
                    break;
            }

            if (countSpendingMoney == 5) {
                isSpend = true;
                break;
            }

        }

        if (isSpend) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", countDays);
        } else {
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }
}
