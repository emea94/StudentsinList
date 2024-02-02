package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {

    List<Student> studentList = new ArrayList<>();


    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    public void printAllStudents() {
        studentList.forEach(System.out::println);
    }

    public Student findStudent(int studentID) {
        for (Student student : studentList) {
            if (student.studentID == studentID) {
                return student;
            }
        }
        System.out.println("Student nicht gefunden");
        return null;
    }

}
