package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        int price = 0;
//        switch (dayOfWeek) {
//            case "Monday":
//            case "Tuesday":
//            case "Friday":
//                price = 12;
//                break;
//            case "Wednesday":
//            case "Thursday":
//                price = 14;
//                break;
//            case "Saturday":
//            case "Sunday":
//                price = 16;
//                break;
//        }

        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Friday")) {
            price = 12;
        } else if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")) {
            price = 14;
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            price = 16;
        }

        System.out.println(price);
    }
}
