package contacts;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.File;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contacts {

    public static void main(String[] args) {

        Path contactsExercise = Paths.get("/Users/danielbrowning/IdeaProjects/codeup-java-exercises/contactsExercise");
        Path contactsApp = Paths.get("/Users/danielbrowning/IdeaProjects/codeup-java-exercises/contactsExercise", "contacts.txt");
        List<String> contacts;
        try {
            if (Files.notExists(contactsExercise))
                Files.createDirectory(contactsExercise);
            if (Files.exists(contactsApp)) {
                contacts = Files.readAllLines(contactsApp);
                for (String contact : contacts) System.out.println(contact);
                List<String> contactsList = new ArrayList<>();
                contactsList.add("Test");
                Files.write(contactsApp, contactsList, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(contactsExercise.toAbsolutePath());

        System.out.println("Select from the following options:\n" +
                "1 - View contacts\n" +
                "2 - Add a new contact\n" +
                "3 - Search a contact by name\n" +
                "4 - Delete an existing contact\n" +
                "5 - Exit");
        System.out.println("Enter an option:");
    }
}
