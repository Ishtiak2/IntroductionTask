package Practice3;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        if(n <= 0){
            System.out.println("Please enter a positive number. ");
        }
        else{
            System.out.println("Fibonacci Series: ");
            int first = 0, second = 1;

            if(n==1){
                System.out.println(first);
            }
            else{
                System.out.print(first + ", "+second);

                for(int i = 3; i <= n; i++){
                    int next = first + second;

                    System.out.print(", "+ next);
                    first = second;
                    second = next;
                }

                System.out.println();
            }
        }
        scanner.close();
    }
}
