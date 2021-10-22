package Exams.Aug18.cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {
    public String name;
    public int capacity;
    public List<Employee> employees;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (employees.size() < capacity) {
            employees.add(employee);
        }
    }

    public boolean removeEmployee(String name) {
        return employees.removeIf(employee -> employee.name.equals(name));
    }

    public Employee getOldestEmployee() {
        List<Employee> sorted = employees.stream().sorted((x, y) -> Integer.compare(y.age, x.age)).collect(Collectors.toList());
        return sorted.get(0);
    }

    public Employee getEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.name.equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public int getCount() {
        return employees.size();
    }

    public String report() {
        StringBuilder out = new StringBuilder();
        out.append(String.format("Employees working at Cafe %s:%n", this.name));
        employees.stream().forEach(x -> out.append(x).append("\n"));
        return out.toString().trim();
    }
}
