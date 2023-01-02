package NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        int number = 0;

        for (int i = number1; i <= number2 ; i++) {
            int sumEvenNumbers = 0;
            int sumOddNumbers = 0;

            int currentNumber = i;

            for (int j = 6; j >= 1 ; j--) {

                number = currentNumber % 10;

                if (j % 2 == 0) {
                    sumEvenNumbers = sumEvenNumbers + number;
                } else {
                    sumOddNumbers = sumOddNumbers + number;
                }

                currentNumber = currentNumber / 10;
            }

            if (sumEvenNumbers == sumOddNumbers) {
                System.out.printf("%d ", i);
            }


        }
    }
}
