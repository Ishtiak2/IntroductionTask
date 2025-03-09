package Practice3;
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the series:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the series: ");

        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }

        int greatest = array[0];

        for(int i = 1; i < size; i++){
            if(greatest < array[i]){
                greatest = array[i];
            }
        }

        System.out.println("The greatest number in the series is: "+greatest);

        scanner.close();
    }
}
