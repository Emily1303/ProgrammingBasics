package ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int pointsBeginning = Integer.parseInt(scanner.nextLine());

        int sumPoints = 0;
        int won = 0;
        for (int i = 1; i<= n; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    sumPoints = sumPoints + 2000;
                    won = won + 1;
                    break;
                case "F":
                    sumPoints = sumPoints + 1200;
                    break;
                case "SF":
                    sumPoints = sumPoints + 720;
                    break;
            }
        }
        pointsBeginning = pointsBeginning + sumPoints;

        double average = Math.floor(sumPoints * 1.0 / n);
        double wonPercent = won * 1.0 / n * 100;

        System.out.printf("Final points: %d%n", pointsBeginning);
        System.out.printf("Average points: %.0f%n", average);
        System.out.printf("%.2f%%", wonPercent);
    }
}
