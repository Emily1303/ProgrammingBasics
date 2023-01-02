package WhileLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int min = Integer.MAX_VALUE;
        while (!word.equals("Stop")) {
            int number = Integer.parseInt(word);

            if (number < min) {
                min = number;
            }

            word = scanner.nextLine();
        }

        System.out.println(min);
    }
}
