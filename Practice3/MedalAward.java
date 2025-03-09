package Practice3;
import java.util.Scanner;

public class MedalAward {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's letter grader: ");
        double letterGrade = scanner.nextDouble();

        System.out.println("Has the student completed the semester? (true for Yes, false for No): ");
        boolean semesterCompleted = scanner.nextBoolean();

        if(semesterCompleted == true){
            if(letterGrade >= 3.5){
                System.out.println("Congratulations! The student receives a medal.");
            }

            else{
                System.out.println("The student has completed the semester but does not qualify for a medal.");
            }
        }

        else{
            System.out.println("The student has not completed the semester, so no medal is awarded.");
        }

        scanner.close();
    }

}
