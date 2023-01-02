package ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int m1 = 0;
        int m2 = 0;
        int k1 = 0;
        int k2 = 0;
        int e1 = 0;
        int sum = 0;
        for (int i = 1; i <= groups; i++) {
            int peopleInAGroup = Integer.parseInt(scanner.nextLine());

            if (peopleInAGroup <= 5) {
                m1 = m1 + peopleInAGroup;
            } else if (peopleInAGroup <= 12) {
                m2 = m2 + peopleInAGroup;
            } else if (peopleInAGroup <= 25) {
                k1 = k1 + peopleInAGroup;
            } else if (peopleInAGroup <= 40) {
                k2 = k2 + peopleInAGroup;
            } else {
                e1 = e1 + peopleInAGroup;
            }

            sum = m1 + m2 + k1 + k2 + e1;
        }

        double m1Percent = m1 * 1.0 / sum * 100;
        double m2Percent = m2 * 1.0 / sum * 100;
        double k1Percent = k1 * 1.0 / sum * 100;
        double k2Percent = k2 * 1.0 / sum * 100;
        double e1Percent = e1 * 1.0 / sum * 100;

        System.out.printf("%.2f%%%n", m1Percent);
        System.out.printf("%.2f%%%n", m2Percent);
        System.out.printf("%.2f%%%n", k1Percent);
        System.out.printf("%.2f%%%n", k2Percent);
        System.out.printf("%.2f%%", e1Percent);
    }
}
