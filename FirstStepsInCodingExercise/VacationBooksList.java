package FirstStepsInCodingExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesFor1Hour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hours = pages / pagesFor1Hour;
        int hoursForADay = hours / days;

        System.out.println(hoursForADay);
    }
}
