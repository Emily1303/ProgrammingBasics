package WhileLoop;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();
        String pass = scanner.nextLine();

        while (!password.equals(pass)) {

            pass = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", name);

    }
}
