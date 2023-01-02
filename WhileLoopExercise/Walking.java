package WhileLoopExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumSteps = 0;
        boolean isTired = false;

        while (sumSteps < 10000) {
            String word = scanner.nextLine();

            if (word.equals("Going home")) {
                int steps = Integer.parseInt(scanner.nextLine());
                sumSteps = sumSteps + steps;
                isTired = true;
                break;
            } else {
                int steps = Integer.parseInt(word);
                sumSteps = sumSteps + steps;
            }
        }

        int diff = Math.abs(sumSteps - 10000);

        if (isTired && sumSteps < 10000) {
            System.out.printf("%d more steps to reach goal.", diff);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        }
    }
}
