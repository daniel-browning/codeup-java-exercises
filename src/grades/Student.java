package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    //constructor
    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
        }

    public double getGradeAverage() {
        double gradesTotal = 0;
        for (int grade:this.grades)gradesTotal += grade;
        return gradesTotal / this.grades.size();
    }

    public static void main(String[] args) {

        Student jeff = new Student("Jeff");
        jeff.addGrade(93);
        jeff.addGrade(83);
        jeff.addGrade(100);
        System.out.println(jeff.getName());
        System.out.println(jeff.getGradeAverage());

        Student snoopy = new Student("Snoopy");
        snoopy.addGrade(53);
        snoopy.addGrade(43);
        snoopy.addGrade(103);
        System.out.println(snoopy.getName());
        System.out.println(snoopy.getGradeAverage());

    }
}
