package org.example;

import java.util.ArrayList;
import java.util.List;

/*

    Step 1: Create a Java class "Student" that should have the following properties: First name, Last name, Student ID.

    Step 2: Create a Java List for elements of type "Student" and add multiple students.

 */

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Karl", "Käfer", 785080));
        studentList.add(new Student("Karla", "Kolumna", 189787));
        studentList.add(new Student("Benjamin", "Blümchen", 789529));
        studentList.add(new Student("Ben", "Blümchen", 789528));

        System.out.println("Hardcoded Liste für Studenten");
        studentList.forEach(System.out::println);

        // Schule instanzieren und Schüler übertragen
        School school = new School();
        school.addStudent(studentList.get(0));
        school.addStudent(studentList.get(1));
        school.addStudent(studentList.get(2));

        System.out.println("Schulliste für Studenten");
        school.printAllStudents();

        System.out.println("\nBeispiel Student nicht gefunden");
        Student gesuchterStudent = school.findStudent(789528);
        System.out.println(gesuchterStudent);

        System.out.println();

        gesuchterStudent = school.findStudent(189787);
        gesuchterStudent.addCourse(new Course("Art", "Herr Strubinski", "A113"));
        gesuchterStudent.addCourse(new Course("Sports", "Lady Luck", "the Gym"));

        System.out.println(school.findStudent(785080));

        school.removeStudent(school.findStudent(785080));
        school.printAllStudents();

        school.removeStudent(school.findStudent(785080));

        school.getCoursesForStudent(189787);
    }
}