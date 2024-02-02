package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Karl", "Käfer", 785080));
        studentList.add(new Student("Karla", "Kolumna", 189787));
        studentList.add(new Student("Benjamin", "Blümchen", 789529));


        studentList.forEach(System.out::println);
    }
}