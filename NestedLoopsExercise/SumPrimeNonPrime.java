package NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int primeNumbers = 0;
        int notPrimeNumbers = 0;

        while (!word.equals("stop")) {
            int number = Integer.parseInt(word);

            if (number < 0) {
                System.out.println("Number is negative.");
                word = scanner.nextLine();
                continue;
            }

            int count = 0;
            for (int i = 1; i <= number ; i++) {
                if (number % i == 0) {
                   count++;
                }
            }

            if (count == 2) {
                primeNumbers = primeNumbers + number;
            } else {
                notPrimeNumbers = notPrimeNumbers + number;
            }

            word = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d", notPrimeNumbers);
    }
}
