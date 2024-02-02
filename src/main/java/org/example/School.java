package org.example;

import java.sql.SQLOutput;
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


    public void getCoursesForStudent(Student student){
        student.printAllCourses();
    }
    public void getCoursesForStudent(int studentID){
        System.out.printf("Courses for %s \n", findStudent(studentID));
        findStudent(studentID).printAllCourses();
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
