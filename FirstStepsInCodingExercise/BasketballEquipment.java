package FirstStepsInCodingExercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = Integer.parseInt(scanner.nextLine());

        double boots = money - (money * 40.0 / 100);
        double equipment = boots - (boots * 20 / 100);
        double ball = equipment / 4;
        double accessories = ball / 5;
        double price = money + boots + equipment + ball + accessories;

        System.out.println(price);

    }
}
