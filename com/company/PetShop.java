package com.company;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodForDogs = Integer.parseInt(scanner.nextLine());
        int foodForCats = Integer.parseInt(scanner.nextLine());

        double packetsForDogs = foodForDogs * 2.50;
        double packetsForCats = foodForCats * 4;
        double sum = packetsForCats + packetsForDogs;
//        System.out.println(sum + " lv.");
        System.out.printf("%.2f lv.", sum);
    }
}
