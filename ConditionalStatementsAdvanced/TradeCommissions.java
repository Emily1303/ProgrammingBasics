package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sailedThings = Double.parseDouble(scanner.nextLine());

        boolean isInvalid = false;
        double commission = 0;
//        switch (town) {
//            case "Sofia":
//                if (sailedThings >= 0 && sailedThings <= 500) {
//                    commission = sailedThings * 0.05;
//                } else if (sailedThings > 500 && sailedThings <= 1000) {
//                    commission = sailedThings * 0.07;
//                } else if (sailedThings > 1000 && sailedThings <= 10000) {
//                    commission = sailedThings * 0.08;
//                } else if (sailedThings > 10000) {
//                    commission = sailedThings * 0.12;
//                } else {
//                    isInvalid = true;
//                }
//                break;
//            case "Varna":
//                if (sailedThings >= 0 && sailedThings <= 500) {
//                    commission = sailedThings * 0.045;
//                } else if (sailedThings > 500 && sailedThings <= 1000) {
//                    commission = sailedThings * 0.075;
//                } else if (sailedThings > 1000 && sailedThings <= 10000) {
//                    commission = sailedThings * 0.10;
//                } else if (sailedThings > 10000) {
//                    commission = sailedThings * 0.13;
//                } else {
//                    isInvalid = true;
//                }
//                break;
//            case "Plovdiv":
//                if (sailedThings >= 0 && sailedThings <= 500) {
//                    commission = sailedThings * 0.055;
//                } else if (sailedThings > 500 && sailedThings <= 1000) {
//                    commission = sailedThings * 0.08;
//                } else if (sailedThings > 1000 && sailedThings <= 10000) {
//                    commission = sailedThings * 0.12;
//                } else if (sailedThings > 10000) {
//                    commission = sailedThings * 0.145;
//                } else {
//                    isInvalid = true;
//                }
//                break;
//            default:
//                isInvalid = true;
//        }

        if (town.equals("Sofia")) {
            if (sailedThings >= 0 && sailedThings <= 500) {
                commission = sailedThings * 0.05;
            } else if (sailedThings > 500 && sailedThings <= 1000) {
                commission = sailedThings * 0.07;
            } else if (sailedThings > 1000 && sailedThings <= 10000) {
                commission = sailedThings * 0.08;
            } else if (sailedThings > 10000) {
                commission = sailedThings * 0.12;
            } else {
                isInvalid = true;
            }
        } else if (town.equals("Varna")) {
            if (sailedThings >= 0 && sailedThings <= 500) {
                commission = sailedThings * 0.045;
            } else if (sailedThings > 500 && sailedThings <= 1000) {
                commission = sailedThings * 0.075;
            } else if (sailedThings > 1000 && sailedThings <= 10000) {
                commission = sailedThings * 0.10;
            } else if (sailedThings > 10000) {
                commission = sailedThings * 0.13;
            } else {
                isInvalid = true;
            }
        } else if (town.equals("Plovdiv")) {
            if (sailedThings >= 0 && sailedThings <= 500) {
                commission = sailedThings * 0.055;
            } else if (sailedThings > 500 && sailedThings <= 1000) {
                commission = sailedThings * 0.08;
            } else if (sailedThings > 1000 && sailedThings <= 10000) {
                commission = sailedThings * 0.12;
            } else if (sailedThings > 10000) {
                commission = sailedThings * 0.145;
            } else {
                isInvalid = true;
            }
        } else {
            isInvalid = true;
        }

        if (isInvalid) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", commission);
        }
    }
}
