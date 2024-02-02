package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {

    List<Student> studentList = new ArrayList<>();


    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void printAllStudents() {
        studentList.forEach(System.out::println);
    }

}
