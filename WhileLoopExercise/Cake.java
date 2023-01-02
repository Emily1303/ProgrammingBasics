package WhileLoopExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cakeCm = width * length;
        boolean isNotEnough = false;

        String word = scanner.nextLine();
        while (!word.equals("STOP")) {
            int cakePiece = Integer.parseInt(word);

            cakeCm = cakeCm - cakePiece;

            if (cakeCm < 0) {
                isNotEnough = true;
                break;
            }

            word = scanner.nextLine();
        }

        int diff = Math.abs(cakeCm);

        if (isNotEnough) {
            System.out.printf("No more cake left! You need %d pieces more.", diff);
        } else {
            System.out.printf("%d pieces are left.", diff);
        }
    }
}
