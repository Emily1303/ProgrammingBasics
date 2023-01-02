package WhileLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int max = Integer.MIN_VALUE;
        while (!word.equals("Stop")) {
            int number = Integer.parseInt(word);

            if (number > max) {
                max = number;
            }

            word = scanner.nextLine();
        }

        System.out.println(max);
    }
}
