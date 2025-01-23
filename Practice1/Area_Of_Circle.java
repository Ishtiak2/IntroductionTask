package Practice1;

import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {
        //Find the area of a circle: pi * radius^2

        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius of the circle: ");
        double radius = scanner.nextDouble();

        double pi = 3.1416;
        double area = pi * radius * radius;

        System.out.printf("The area of the circle is: %.3f\n",area);

        scanner.close();

    }
}
