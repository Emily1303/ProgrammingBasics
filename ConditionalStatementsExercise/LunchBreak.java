package ConditionalStatementsExercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String series = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunch = breakTime / 8.0;
        double rest = breakTime / 4.0;
        double timeForEpisode = breakTime - lunch - rest;

        double diff = Math.abs(timeForEpisode - episode);
        if (timeForEpisode >= episode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, Math.ceil(diff));
        }

    }
}
