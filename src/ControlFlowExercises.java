import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner power = new Scanner(System.in);

        System.out.print("What number would you like to go up to?");
        int userInput = power.nextInt();
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed   ");
        System.out.println("------ | ------- | ------");
        for (long i = 1; i <= userInput; i++) {

            System.out.format("%-8s| %-9s | %-9s%n", i, i*i, i*i*i);
            //System.out.println(i + "       | " + (i * i) + "      | " + (i * i * i));
            if (i == userInput) {
                break;
            }
        } System.out.print("Would you like to continue?");

        }
    }



