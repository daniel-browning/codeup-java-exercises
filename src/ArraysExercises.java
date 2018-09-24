import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1); //or new Person[people.length + 1]
        newPeople[newPeople.length -1] = newPerson;
            return newPeople;
    }

    public static void main(String[] args) {
        //int[] numbers = {1, 2, 3, 4, 5};
        //System.out.println(Arrays.toString(numbers));

        Person[] threePeople = new Person[3];
        threePeople[0] = new Person("Daniel");
        threePeople[1] = new Person("Aaron");
        threePeople[2] = new Person("Ezri");
        for (Person person: threePeople) {
            System.out.println(person.getName());
        }
        Person benjamin = new Person("Ben");
        Person[] fourPeople = addPerson(threePeople, benjamin);
        for (Person person: fourPeople) {
            System.out.println(person.getName());
        }
    }
}

