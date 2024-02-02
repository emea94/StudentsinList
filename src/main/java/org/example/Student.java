package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String firstName;
    String lastName;
    int studentID;

    List<Course> courseList  = new ArrayList<>();


    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void addCourse(Course course){
        courseList.add(course);
    }

    public void printAllCourses(){
        courseList.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + '\'' +
                "(studentID=" + studentID +
                ')';
    }
}
