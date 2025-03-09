package Practice3;
import java.util.Scanner;

public class ReverseSeries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of the series: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the series: ");
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("The reversed series is: ");

        for(int i = size - 1; i >= 0; i--){
            System.out.print(array[i] +" ");
        }

        scanner.close();
    }
}
