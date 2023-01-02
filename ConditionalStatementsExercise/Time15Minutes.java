package ConditionalStatementsExercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        hour = hour * 60;
        int sumInMinutes = hour + minutes + 15;
        hour = sumInMinutes / 60;
        minutes = sumInMinutes % 60;

        if (hour > 23) {
            hour = 0;
        }

        if (minutes < 10) {
            System.out.printf("%d:0%d", hour, minutes);
        } else {
            System.out.printf("%d:%d", hour, minutes);
        }
    }
}
