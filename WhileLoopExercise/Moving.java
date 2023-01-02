package WhileLoopExercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int totalCubicMetres = width * length * height;
        boolean isNotEnough = false;

        String word = scanner.nextLine();
        while (!word.equals("Done")) {
            int packets = Integer.parseInt(word);

            totalCubicMetres = totalCubicMetres - packets;

            if (totalCubicMetres < 0) {
                isNotEnough = true;
                break;
            }

            word = scanner.nextLine();
        }

        int diff = Math.abs(totalCubicMetres);

        if (isNotEnough) {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        } else {
            System.out.printf("%d Cubic meters left.", diff);
        }
    }
}
