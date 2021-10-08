package DefiningClassesT6.Exercise.CompanyRoster02;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> listOfEmployees;
    private String name;
    public Department(String name){
        this.name = name;
        listOfEmployees = new ArrayList<>();
    }

    public List<Employee> getListOfEmployees() {
        return listOfEmployees;
    }
    public double calculateAverageSalary(){
        return this.listOfEmployees
                .stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.00);
    }

    public String getName() {
        return name;
    }


}
