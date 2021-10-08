package DefiningClassesT6.Exercise.CompanyRoster02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEmployees = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departmentAndEmployees = new HashMap<>();

        while (numberOfEmployees-- > 0) {
            String[] command = scanner.nextLine().split("\\s+");
            String name = command[0];
            double salary = Double.parseDouble(command[1]);
            String position = command[2];
            String department = command[3];
            Employee employee = null;
            if (command.length == 4) {
                employee = new Employee(name, salary, position, department);
            } else if (command.length == 6) {
                String email = command[4];
                int age = Integer.parseInt(command[5]);
                employee = new Employee(name, salary, position, department, email, age);
            } else if (command.length == 5) {
                try {
                    int age = Integer.parseInt(command[4]);
                    employee = new Employee(name, salary, position, department, age);
                } catch (NumberFormatException e) {
                    String email = command[4];
                    employee = new Employee(name, salary, position, department, email);
                }


            }
            departmentAndEmployees.putIfAbsent(department, new Department(department));
            departmentAndEmployees.get(department).getListOfEmployees().add(employee);
        }

        Department highestPaidDepartment = departmentAndEmployees.entrySet()
                .stream()
                .max(Comparator.comparing(key -> key.getValue().calculateAverageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + highestPaidDepartment.getName());

        highestPaidDepartment.getListOfEmployees()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);

        System.out.println();
    }
}
