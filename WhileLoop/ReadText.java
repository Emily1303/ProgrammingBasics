package WhileLoop;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

//        while (!word.equals("Stop")) {
//
//            System.out.println(word);
//            word = scanner.nextLine();
//        }

        while (true) {
            if (word.equals("Stop")) {
                break;
            }

            System.out.println(word);
            word = scanner.nextLine();
        }

    }
}
