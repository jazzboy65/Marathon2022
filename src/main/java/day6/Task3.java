package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Мария","История");
        Student s = new Student("Иван");
        t.evaluate(s);
    }
}


class Teacher {
    private final String name;
    private final String object;

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }

     public void evaluate(Student student) {
        String grade;
        Random rand = new Random();
        int random = rand.nextInt((4) +2);
        switch (random) {
            case 4:
                grade = "хорошо";
                break;
            case 3:
                grade = "удовлетворительно";
                break;
            case 2:
                grade = "неудовлетворительно";
                break;
            default:
                grade = "отлично";
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем "
                + student + " по предмету " + this.object + " на оценку " + grade);
    }
}
class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getName() {
        return studentName;
    }

    public void setName(String studentName) {
        this.studentName = studentName;
    }
}


