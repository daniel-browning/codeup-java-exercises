package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student snoopy = new Student("Snoopy");
        snoopy.addGrade(43);
        students.put("joecool33", snoopy);

        Student mickey = new Student("Mickey");
        mickey.addGrade(33);
        students.put("minnie4life", mickey);

        Student wanda = new Student("Wanda Maximoff");
        wanda.addGrade(100);
        students.put("ScarletWitchChaos", wanda);

        Student xena = new Student("Xena");
        xena.addGrade(98);
        students.put("roundkillingthing", xena);

        students.get("joecool33").addGrade(43);

        System.out.println(students);
    }
}
