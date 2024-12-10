import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        //Area of a triangle : 0.5 * base * height
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Height of the triangle: ");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);

        scanner.close();

    }
}
