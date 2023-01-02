package WhileLoopExercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favouriteBook = scanner.nextLine();
        int countBooks = 0;
        boolean isFound = false;

        String currentBook = scanner.nextLine();

        while (!currentBook.equals("No More Books")) {

            if (currentBook.equals(favouriteBook)) {
                isFound = true;
                break;
            } else {
                countBooks++;
            }

            currentBook = scanner.nextLine();
        }

        if (isFound) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }

    }
}
