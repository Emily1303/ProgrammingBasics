package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scanner.nextLine());
        int minOfExam = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minOfArrival = Integer.parseInt(scanner.nextLine());

        int minExam = hourOfExam * 60 + minOfExam;
        int minArrival = hourOfArrival * 60 + minOfArrival;
        int diff = Math.abs(minExam - minArrival);

        int hour = diff / 60;
        int minutes = diff % 60;
        if (minExam == minArrival || (minExam > minArrival && diff <= 30)) {
            System.out.println("On time");
            if (diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", minutes);
            }
        } else if (minArrival > minExam) {
            System.out.println("Late");
            if (diff < 60) {
                System.out.printf("%d minutes after the start", minutes);
            } else {
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }
        } else {
            System.out.println("Early");
            if (diff < 60) {
                System.out.printf("%d minutes before the start", minutes);
            } else {
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }

        }
    }
}
