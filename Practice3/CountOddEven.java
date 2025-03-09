package Practice3;
import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements in the array: ");

        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }

        int oddCount = 0, evenCount = 0;

        for(int i = 0; i < size; i++){
            if(array[i] % 2 == 0){
                evenCount++;
            }

            else{
                oddCount++;
            }
        }

        System.out.println("Total Even Numbers: "+evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);

        scanner.close();
    }
}
