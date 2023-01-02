package com.company;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double metres = Double.parseDouble(scanner.nextLine());

        double price = metres * 7.61;
        double discount = price * 0.18;
        double totalPrice = price - discount;

//        System.out.printf("The final price is: %.2f lv.%n", totalPrice);
//        System.out.printf("The discount is: %.2f lv.", discount);
        System.out.println("The final price is: " + totalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
