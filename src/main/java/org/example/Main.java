package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Karl", "Käfer", 785080));
        studentList.add(new Student("Karla", "Kolumna", 189787));
        studentList.add(new Student("Benjamin", "Blümchen", 789529));
        studentList.add(new Student("Ben", "Blümchen", 789528));


        //studentList.forEach(System.out::println);

        School school = new School();
        school.addStudent(studentList.get(0));
        school.addStudent(studentList.get(1));
        school.addStudent(studentList.get(2));

        //school.printAllStudents();
        Student gesuchterStudent = school.findStudent(789528);
        System.out.println(gesuchterStudent);

        //System.out.println(school.findStudent(785080));

        school.removeStudent(school.findStudent(785080));
        school.printAllStudents();

        school.removeStudent(school.findStudent(785080));

    }
}