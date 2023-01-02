package Exercise;

import java.util.Scanner;

public class WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());

        if (degrees >= 26.0 && degrees <= 35.0) {
            System.out.printf("Hot");
        } else if (degrees >= 20.1 && degrees <= 25.9) {
            System.out.printf("Warm");
        } else if (degrees >= 15.0 && degrees <= 20.0) {
            System.out.printf("Mild");
        } else if (degrees >= 12.0 && degrees <= 14.9) {
            System.out.printf("Cool");
        } else if (degrees >= 5.0 && degrees <= 11.9) {
            System.out.printf("Cold");
        } else {
            System.out.printf("unknown");
        }
    }
}
