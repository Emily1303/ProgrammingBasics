package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean isInvalid = false;
        double price = 0;
//        switch (dayOfWeek) {
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//            case "Thursday":
//            case "Friday":
//                if (fruit.equals("banana")) {
//                    price = quantity * 2.50;
//                } else if (fruit.equals("apple")) {
//                    price = quantity * 1.20;
//                } else if (fruit.equals("orange")) {
//                    price = quantity * 0.85;
//                } else if (fruit.equals("grapefruit")) {
//                    price = quantity * 1.45;
//                } else if (fruit.equals("kiwi")) {
//                    price = quantity * 2.70;
//                } else if (fruit.equals("pineapple")) {
//                    price = quantity * 5.50;
//                } else if (fruit.equals("grapes")) {
//                    price = quantity * 3.85;
//                } else {
//                    isInvalid = true;
//                }
//                break;
//            case "Saturday":
//            case "Sunday":
//                if (fruit.equals("banana")) {
//                    price = quantity * 2.70;
//                } else if (fruit.equals("apple")) {
//                    price = quantity * 1.25;
//                } else if (fruit.equals("orange")) {
//                    price = quantity * 0.90;
//                } else if (fruit.equals("grapefruit")) {
//                    price = quantity * 1.60;
//                } else if (fruit.equals("kiwi")) {
//                    price = quantity * 3.00;
//                } else if (fruit.equals("pineapple")) {
//                    price = quantity * 5.60;
//                } else if (fruit.equals("grapes")) {
//                    price = quantity * 4.20;
//                } else {
//                    isInvalid = true;
//                }
//                break;
//            default:
//                isInvalid = true;
//        }

        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") ||
        dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
            if (fruit.equals("banana")) {
                price = quantity * 2.50;
            } else if (fruit.equals("apple")) {
                price = quantity * 1.20;
            } else if (fruit.equals("orange")) {
                price = quantity * 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = quantity * 1.45;
            } else if (fruit.equals("kiwi")) {
                price = quantity * 2.70;
            } else if (fruit.equals("pineapple")) {
                price = quantity * 5.50;
            } else if (fruit.equals("grapes")) {
                price = quantity * 3.85;
            } else {
                isInvalid = true;
            }
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            if (fruit.equals("banana")) {
                price = quantity * 2.70;
            } else if (fruit.equals("apple")) {
                price = quantity * 1.25;
            } else if (fruit.equals("orange")) {
                price = quantity * 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = quantity * 1.60;
            } else if (fruit.equals("kiwi")) {
                price = quantity * 3.00;
            } else if (fruit.equals("pineapple")) {
                price = quantity * 5.60;
            } else if (fruit.equals("grapes")) {
                price = quantity * 4.20;
            } else {
                isInvalid = true;
            }
        } else {
            isInvalid = true;
        }


        if (isInvalid) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", price);
        }
    }
}
