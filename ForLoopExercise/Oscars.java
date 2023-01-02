package ForLoopExercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String nameOfJudge = scanner.nextLine();
            double pointsFromJudge = Double.parseDouble(scanner.nextLine());

            int len = nameOfJudge.length();
            double points = len * pointsFromJudge / 2;

            pointsFromAcademy = pointsFromAcademy + points;

            if (pointsFromAcademy >= 1250.5) {
                break;
            }
        }

        double diff = Math.abs(1250.5 - pointsFromAcademy);

        if (pointsFromAcademy >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, pointsFromAcademy);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, diff);
        }
    }
}
