package Exercise;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double door = 1.2 * 2;
        double firstWall = x * x - door;
        double secondWall = x * x;
        double window = 1.5 * 1.5;
        double thirdWall = x * y - window;
        double fourthWall = x * y - window;
        double totalWall = firstWall + secondWall + thirdWall + fourthWall;
        double firstPart = x * y;
        double secondPart = x * h / 2;
        double totalPart = 2 * firstPart + 2 * secondPart;
        double greenDye = totalWall / 3.4;
        double redDye = totalPart / 4.3;

        System.out.printf("%.2f\n"+
                "%.2f", greenDye, redDye);

    }
}
