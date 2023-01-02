package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

//        if (gender.equals("m") && age >= 16) {
//            System.out.println("Mr.");
//        } else if (gender.equals("m") && age < 16) {
//            System.out.println("Master");
//        } else if (gender.equals("f") && age >= 16) {
//            System.out.println("Ms.");
//        } else if (gender.equals("f") && age < 16) {
//            System.out.println("Miss");
//        }

//        switch (gender) {
//            case "m":
//                if (age >= 16) {
//                    System.out.println("Mr.");
//                } else if (age < 16) {
//                    System.out.println("Master");
//                }
//                break;
//            case "f":
//                if (age >= 16) {
//                    System.out.println("Ms.");
//                } else if (age < 16) {
//                    System.out.println("Miss");
//                }
//                break;
//        }

        if (gender.equals("m")) {
            if (age >= 16) {
                System.out.println("Mr.");
            } else if (age < 16) {
                System.out.println("Master");
            }
        } else if (gender.equals("f")) {
            if (age >= 16) {
                System.out.println("Ms.");
            } else if (age < 16) {
                System.out.println("Miss");
            }
        }
    }
}
