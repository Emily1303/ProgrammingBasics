package NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int countCombinations = 0;
        boolean isFound = false;

        int firstNumber = 0;
        int secondNumber = 0;
        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end ; j++) {
                firstNumber = i;
                secondNumber = j;
                countCombinations++;
                sum = i + j;

                if (sum == magicNumber) {
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                break;
            }
        }

        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", countCombinations, firstNumber, secondNumber, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", countCombinations, magicNumber);
        }
    }
}
