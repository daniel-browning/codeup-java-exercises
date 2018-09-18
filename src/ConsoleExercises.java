import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f" + "\n", pi);

        //Enter an integer
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer");
        int userInput = scanner.nextInt();
        System.out.println("User entered: " + userInput + "\n");
        //System.out.format("User entered %d" + "\n");

        //Enter three words
        Scanner wordInput = new Scanner(System.in);

        System.out.print("Enter three words"  + "\n");
        String userInputString1 = wordInput.next();
        String userInputString2 = wordInput.next();
        String userInputString3 = wordInput.next();
        System.out.println(userInputString1);
        System.out.println(userInputString2);
        System.out.println(userInputString3);

        //Enter a sentence
        Scanner sentenceInput = new Scanner(System.in);

        System.out.print("Enter a sentence"  + "\n");
        String userInputSentence = sentenceInput.nextLine();
        System.out.println("User entered: " + userInputSentence + "\n");

        //Area of Codeup classroom
        Scanner areaInput = new Scanner(System.in);

        System.out.print("Enter the length of the Codeup glassroom:" + "\n");
        String userAreaInputLength = areaInput.nextLine();
        //convert string to integer
        int areaInputLength = Integer.parseInt(userAreaInputLength);
        System.out.print("Enter the width of the Codeup glassroom:" + "\n");
        String userAreaInputWidth = areaInput.nextLine();
        //convert string to integer
        int areaInputWidth = Integer.parseInt(userAreaInputWidth);
        //formula to calculate area
        int userAreaInput = areaInputLength * areaInputWidth;

        System.out.println("The area of the Codeup glass classroom is " + userAreaInput + " square feet."+  "\n");

        //Perimeter of Codeup classroom
        Scanner perimeterInput = new Scanner(System.in);

        System.out.print("Enter the length of the Codeup glassroom:" + "\n");
        String userPerimeterInputLength = perimeterInput.nextLine();
        //convert string to integer
        int perimeterInputLength = Integer.parseInt(userPerimeterInputLength);
        System.out.print("Enter the width of the Codeup glassroom:" + "\n");
        String userPerimeterInputWidth = perimeterInput.nextLine();
        //convert string to integer
        int perimeterInputWidth = Integer.parseInt(userPerimeterInputWidth);
        //formula to calculate area
        int userPerimeterInput = (perimeterInputLength * 2) + (perimeterInputWidth * 2);

        System.out.println("The perimeter of the Codeup glass classroom is " + userPerimeterInput + " square feet."+  "\n");

    }
}
