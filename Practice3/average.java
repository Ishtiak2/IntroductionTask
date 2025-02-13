package Practice3;
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Average of the elements: " + (double)sum/n);
        scanner.close();
    }
}
