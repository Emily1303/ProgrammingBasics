package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double secondsForAMeter = Double.parseDouble(scanner.nextLine());

        double moreSeconds = Math.floor(metres / 15);
        double finalSeconds = secondsForAMeter * metres + moreSeconds * 12.5;
        double diff = Math.abs(record - finalSeconds);

        if (finalSeconds < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalSeconds);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }

    }
}
