package Exercise;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double mackerelPrize = Double.parseDouble(scanner.nextLine());
        double spratPrize = Double.parseDouble(scanner.nextLine());
        double bonito = Double.parseDouble(scanner.nextLine());
        double scad = Double.parseDouble(scanner.nextLine());
        int clam = Integer.parseInt(scanner.nextLine());

        double bonitoPrize = (mackerelPrize + mackerelPrize * 0.60) * bonito;
        double scadPrize = (spratPrize + spratPrize * 0.80) * scad;
        double clamPrize = clam * 7.50;
        double totalPrize = bonitoPrize + scadPrize + clamPrize;
        System.out.printf("%.2f", totalPrize);


    }
}
