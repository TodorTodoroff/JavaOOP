package EncapsulationT2.Lab.salaryIncrease;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if (age < 30) {
            bonus = bonus / 2;
        }
            this.salary = this.salary * ( 1.00 + bonus / 100);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0###");
        return String.format("%s %s gets %s leva", firstName, lastName, decimalFormat.format(salary));
    }
}