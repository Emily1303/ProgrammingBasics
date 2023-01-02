package WhileLoop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int classes = 0;
        double sum = 0;
        double averageGrade = 0;
        int badGrades = 0;
        boolean isExpelled = false;
        while (classes < 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4.00) {
                badGrades = badGrades + 1;
                if (badGrades > 1) {
                    isExpelled = true;
                    break;
                }
                classes = classes + 1;
                continue;
            }

            classes = classes + 1;
            sum = sum + grade;
        }

        averageGrade = sum / classes;

        if (isExpelled) {
            System.out.printf("%s has been excluded at %d grade", name, classes);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }

    }
}
