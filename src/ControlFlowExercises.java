import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean confirm = true;
        while (confirm) {
            System.out.print("Please enter numerical grade");
            int grade = scanner.nextInt();
            char letterGrade = '*';
            if (grade >= 0 && grade <= 100) {
                if (grade >= 88) letterGrade = 'A';
                else if (grade >= 80) letterGrade = 'B';
                else if (grade >= 67) letterGrade = 'C';
                else if (grade >= 60) letterGrade = 'D';
                else letterGrade = 'F';
            }
            System.out.println(letterGrade);

            System.out.println("Do you want to continue?");
            String answer = scanner.next();
            if (!answer.toLowerCase().contains("y"));
            confirm  = false;
        }
        System.out.println("Thank you for using our grading system!");
    }
}



