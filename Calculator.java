import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        char ch = scanner.next().charAt(0);
        int b = scanner.nextInt();

        if(ch == '+') {
            System.out.println("Result: " + (a+b));
        }

        else if(ch == '-')
            System.out.println("Result: " + (a-b));

        else if(ch == '*')
            System.out.println("Result: " + (a*b));
        else if(ch == '/') {
            if(b != 0)
                System.out.println("Result: " + (a / b));
            else
                System.out.println("Error: Division by zero is not allowed.");
        }

        else
            System.out.println("Invalid operator.");

        scanner.close();

    }
}
