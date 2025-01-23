package Practice1;

import java.util.Scanner;

public class Celsius_Fahrenheit {
    public static void main(String[] args) {
        //Convert Celsius scale to Fahrenheit: C / 5 = (F - 32) / 9
        Scanner scanner = new Scanner(System.in);

        System.out.print("Celsius Temperature: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = ((celsius / 5.0) * 9.0 )+ 32;
        System.out.printf("Fahrenheit Temperature: %.2f", fahrenheit);

        scanner.close();
    }
}
