package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (projection) {
            case "Premiere":
                price = rows * columns * 12.00;
                break;
            case "Normal":
                price = rows * columns * 7.50;
                break;
            case "Discount":
                price = rows * columns * 5.00;
                break;
        }

        System.out.printf("%.2f leva", price);
    }
}
