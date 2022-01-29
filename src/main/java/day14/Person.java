package day14;

public class Person {
    private final String name;
    private final int year;

    public Person(String name, int age) {
        this.name = name;
        this.year = age;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
