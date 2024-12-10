import java.util.Scanner;

public class Area_Triangle_2 {
    public static void main(String[] args) {
        //The area of a triangle (2) : √(s *(s-a)*(s-b)*(s-c))  where s = (a+b+c) / 2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Arm a: ");
        double a = scanner.nextDouble();

        System.out.print("Arm b: ");
        double b = scanner.nextDouble();

        System.out.print("Arm c: ");
        double c = scanner.nextDouble();

        double s = (a+b+c)/2;
        double area = Math.sqrt( (s *(s-a)*(s-b)*(s-c)) );

        if(a+b > c && b+c>a && c+a>b )
            System.out.printf("Area of the triangle: %.3f", area);
        else
            System.out.print("Invalid triangle\n");

        scanner.close();

    }
}
