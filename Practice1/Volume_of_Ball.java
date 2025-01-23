package Practice1;

import java.util.Scanner;

public class Volume_of_Ball {
    public static void main(String[] args) {
        //The volume of a ball: 4/3 * pi * radius^3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius of the ball: ");
        double radius = scanner.nextDouble();

        double pi = 3.1416;
        double volume = (4.0/3.0) * pi * radius * radius * radius;

        System.out.printf("The volume of the ball is: %.3f\n",volume);

        scanner.close();

    }
}
