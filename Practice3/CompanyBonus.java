package Practice3;
import java.util.Scanner;

public class CompanyBonus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Sales Percentage Achieved: ");
        int sales = scanner.nextInt();
        System.out.println("Enter Attendance Rate(in %): ");
        int attendance = scanner.nextInt();

        int bonus;

        if(sales >= 95 && attendance == 100){
            bonus = 60;
        }
        else if(sales >= 95 && attendance >= 90){
            bonus = 40;
        }
        else if(sales >= 80 && attendance >= 90){
            bonus = 20;
        }
        else
            bonus = 5;

        System.out.println("The officer's bonus is: "+bonus+"%");

        scanner.close();
    }
}
