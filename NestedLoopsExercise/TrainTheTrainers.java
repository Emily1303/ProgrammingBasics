package NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String word = scanner.nextLine();

        double averagePerPresentation = 0;
        double sumOfAllGrades = 0;
        int count = 0;
        double currentGrade = 0;
        while (!word.equals("Finish")) {

            double sum = 0;
            for (int i = 1; i <= n ; i++) {
                double grade = Double.parseDouble(scanner.nextLine());

                currentGrade = grade;
                sum = sum + grade;

                count++;

                sumOfAllGrades = sumOfAllGrades + currentGrade;
                averagePerPresentation = sum / n;
            }


            System.out.printf("%s - %.2f.%n", word, averagePerPresentation);

            word = scanner.nextLine();
        }

        double finalGrade = sumOfAllGrades / count;
        System.out.printf("Student's final assessment is %.2f.", finalGrade);

    }
}
