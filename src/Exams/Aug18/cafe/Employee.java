package Exams.Aug18.cafe;

public class Employee {
    public String name;
    public int age;
    public String country;

    public Employee(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("Employee: %s, %d from %s", this.name, this.age, this.country);
    }
}
