package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        int countBadGrades = 0;
        double sum = 0;
        int countGrades = 0;
        boolean isBadGrade = false;
        String lastProblem = "";

        String problem = scanner.nextLine();
        while (!problem.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());

            lastProblem = problem;

            countGrades++;
            sum = sum + grade;

             if (grade <= 4) {
                 countBadGrades++;
             }

             if (badGrades == countBadGrades) {
                 isBadGrade = true;
                 break;
             }

             problem = scanner.nextLine();
             grade++;
        }

        double average = sum / countGrades;

        if (isBadGrade) {
            System.out.printf("You need a break, %d poor grades.", countBadGrades);
        } else {
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", countGrades);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
