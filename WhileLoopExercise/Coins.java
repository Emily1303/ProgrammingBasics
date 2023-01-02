package WhileLoopExercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double changeInCoins = change * 100;
        int countCoins = 0;

        while (changeInCoins >= 1) {

            if (changeInCoins >= 200) {
                changeInCoins = changeInCoins - 200;
                countCoins = countCoins + 1;
            } else if (changeInCoins >= 100) {
                changeInCoins = changeInCoins - 100;
                countCoins = countCoins + 1;
            } else if (changeInCoins >= 50) {
                changeInCoins = changeInCoins - 50;
                countCoins = countCoins + 1;
            } else if (changeInCoins >= 20) {
                changeInCoins = changeInCoins - 20;
                countCoins = countCoins + 1;
            } else if (changeInCoins >= 10) {
                changeInCoins = changeInCoins - 10;
                countCoins = countCoins + 1;
            } else if (changeInCoins >= 5) {
                changeInCoins = changeInCoins - 5;
                countCoins = countCoins + 1;
            } else if (changeInCoins >= 2) {
                changeInCoins = changeInCoins - 2;
                countCoins = countCoins + 1;
            } else if (changeInCoins >= 1) {
                changeInCoins = changeInCoins - 1;
                countCoins = countCoins + 1;
            } else {
                break;
            }

        }

        System.out.println(countCoins);
    }
}
