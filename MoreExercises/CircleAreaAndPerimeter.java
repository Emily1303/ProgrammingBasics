package Exercise;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double calculatedArea = r * r * Math.PI;
        double calculatedParameter = 2 * Math.PI * r;

        System.out.printf("%.2f\n" +
                "%.2f", calculatedArea, calculatedParameter);
    }
}
