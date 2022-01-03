package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Мария","История");
        Student s = new Student("Иван");
        t.evaluate(s.getName());
        t.evaluate("Пётр");
    }
}


class Teacher {
    private String name;
    private String object;

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }

     String evaluate(String nameOfStudent) {
        Random rand = new Random();
        String grade = "";
        switch (rand.nextInt(5)) {
            case 5:
                grade = "отлично";
                break;
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
                grade = "родителей в институт";
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем "
                + nameOfStudent + " по предмету " + this.object + " на оценку " + grade);

        return nameOfStudent;

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


