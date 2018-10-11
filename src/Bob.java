import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.print("Hi. I'm Bob. What do you want?");
       // do {
            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) System.out.println("Sure.");
            else if (userInput.endsWith("!")) System.out.println("Whoa, chill out!");
            else if (userInput.isEmpty()) System.out.println("Fine. Be that way!");
            else if (userInput.toLowerCase().contains("bye"))
                //havingANiceConversation = false;
            System.out.println("Bob left the room");
            else System.out.println("Whatever");
       // } while (havingANiceConversation);
    }
}
