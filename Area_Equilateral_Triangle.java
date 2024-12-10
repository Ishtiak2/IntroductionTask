import java.util.Scanner;

public class Area_Equilateral_Triangle {
    public static void main(String[] args) {
        //Area of a equilateral triangle: (√3 / 4) * arm^2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Arms of the triangle: ");
        double arm = scanner.nextDouble();

        double area =  ( Math.sqrt(3) / 4) * arm * arm;
        System.out.printf("Area of the triangle: %.2f" , area);

        scanner.close();

    }
}
