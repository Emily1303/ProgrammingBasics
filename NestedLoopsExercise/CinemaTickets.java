package NestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();

        int countStudent = 0;
        int countStandard = 0;
        int countKid = 0;
        int countAllSeatsMovie = 0;

        double percentStudents = 0;
        double percentStandard = 0;
        double percentKid = 0;
        double percentAllSeats = 0;

        while (!movie.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());

            int countCurrentTickets = 0;
            String typeSeat = scanner.nextLine();

            while (!typeSeat.equals("End")) {

                countCurrentTickets++;
                countAllSeatsMovie++;

                switch (typeSeat) {
                    case "student":
                        countStudent++;
                        break;
                    case "standard":
                        countStandard++;
                        break;
                    case "kid":
                        countKid++;
                        break;
                }

                percentStudents = countStudent * 1.0 / countAllSeatsMovie * 100;
                percentStandard = countStandard * 1.0 / countAllSeatsMovie * 100;
                percentKid = countKid * 1.0 / seats * 100;

                percentAllSeats = countAllSeatsMovie * 1.0 / countAllSeatsMovie * 100;

                if (countCurrentTickets >= seats) {
                    break;

                }

                typeSeat = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie, percentAllSeats);

            movie = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", countAllSeatsMovie);
        System.out.printf("%.2f%% student tickets.%n", percentStudents);
        System.out.printf("%.2f%% standard tickets.%n", percentStandard);
        System.out.printf("%.2f%% kids tickets.%n", percentKid);
    }
}
