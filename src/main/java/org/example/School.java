package org.example;

import java.util.HashMap;
import java.util.Map;

public class School {

    //List<Student> studentList = new ArrayList<>();
    Map<Integer, Student> studentMap = new HashMap<>();


    public void addStudent(Student student) {
        studentMap.put(student.studentID, student);
    }

    public void removeStudent(Student student) {
        studentMap.remove(student.studentID);
    }

    public void printAllStudents() {
        studentMap.values().forEach(System.out::println);
    }


    public void getCoursesForStudent(Student student){
        student.printAllCourses();
    }
    public void getCoursesForStudent(int studentID){
        System.out.printf("Courses for %s \n", findStudent(studentID));
        findStudent(studentID).printAllCourses();
    }

    public Student findStudent(int studentID) {
        return studentMap.get(studentID);
    }

}
