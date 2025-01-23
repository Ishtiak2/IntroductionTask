package Practice1;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the score: ");
        int score = scanner.nextInt();

        String grade = "";

        if(score < 0 || score > 100)
        {
            grade = "Invalid score!";
        }

        else {
            switch (score / 10) {
                case 10:
                case 9:
                    grade = "A+";
                    break;
                case 8:
                    grade = "A";
                    break;
                case 7:
                    grade = "A-";
                    break;
                case 6:
                    grade = "B";
                    break;
                case 5: case 4:
                    grade = "C+";
                    break;
                default:
                    grade = "F";
                    break;
            }
        }

        System.out.println("The GPA is: " +grade);
        scanner.close();

    }
}
