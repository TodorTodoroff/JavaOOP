package Exams.April14.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    public int capacity;
    public List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();

    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentCount() {
        return this.students.size();
    }

    public String registerStudent(Student student) {
        if (capacity > students.size() && !students.contains(student)) {
            students.add(student);
            return String.format("Added student %s %s", student.getFirstName(), student.getLastName());
        }
        if (students.contains(student)) {
            return "Student is already in the university";
        }
        return "No seats in the university";
    }

    public String dismissStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            return String.format("Removed student %s %s", student.getFirstName(), student.getLastName());
        }
        return "Student not found";
    }

    public Student getStudent(String firstName, String lastName) {
        for (Student student : students) {
            if (student.firstName.equals(firstName) && student.lastName.equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    public String getStatistics() {
        StringBuilder out = new StringBuilder();
        students.forEach(x -> out.append(String.format("==Student: First Name = %s, Last Name = %s, Best Subject = %s%n"
                , x.getFirstName(), x.getLastName(), x.getBestSubject())));
        return out.toString().trim();
    }
}
