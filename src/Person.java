public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    //getters ask questions
    public String getName() {
        return name;
    }

    //setters are commands
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
   public void sayHello() {
       System.out.println("Hello from " + name + "!");
    }

    public static void main(String[] args) {

        Person p1 = new Person("Daniel");
        Person p2 = new Person ("Aaron");
        System.out.println(p2.getName());
        System.out.println(p1.getName());

        p1.sayHello();

    }
}
