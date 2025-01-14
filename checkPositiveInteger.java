import java.util.Scanner;

public class checkPositiveInteger {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        if(number == 0) System.out.println("0 is neither positive nor negative.");
        else if(number > 0) System.out.println(number+ " is a positive number.");
        else System.out.println(number+" is not a positive number.");

        scanner.close();
    }
}
