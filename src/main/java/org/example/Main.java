package org.example;

import java.util.ArrayList;
import java.util.List;

/*

    Step 1: Create a Java class "Student" that should have the following properties: First name, Last name, Student ID.

    Step 2: Create a Java List for elements of type "Student" and add multiple students.


    Coding: Convert List to Java Map&Set

    In this task, you will deepen your understanding of Java Map&Set.

    Step 1: Convert your application from the List lecture so that the School Object uses a Hashmap instead of an ArrayList.


    Coding: Pharmacy
    In this task, you will deepen your understanding of Java Map&Set.

    Step 1: Create a class 'Medication' with the methods 'getName', 'getPrice', and 'getAvailability'.
    Step 2: Create a Java class 'Pharmacy' that uses a Java Map to store the Medication name as the key and its information as the value.
    Step 3: Create a method 'int getCount()' in the class Pharmacy. This method should return the number of Medications in the pharmacy.
    Step 4: Create a method 'void save(Medication medication)' in the class Pharmacy. This method should insert the Medication indexed by its name into the pharmacy.
    Step 5: Create a method 'Medication find(String medicationName)' in the class Pharmacy. This method should return the requested Medication with this name. If no Medication with this name is found, the method should return null.
    Step 6: Create a method 'void delete(String medicationName)' in the class Pharmacy. This method should delete the Medication with this name.
    Step 7: Implement a method to print all Medications in the map, including their name, price, and availability.
    If you have already completed this task earlier, feel free to solve some tasks on Codewars.


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
        System.out.println();

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

        // Added courses for Student Karla
        gesuchterStudent = school.findStudent(189787);
        gesuchterStudent.addCourse(new Course("Art", "Herr Strubinski", "A113"));
        gesuchterStudent.addCourse(new Course("Sports", "Lady Luck", "the Gym"));

        System.out.println(school.findStudent(785080));

        System.out.println("removing a Student (twice)");
        // school.removeStudent(school.findStudent(785080));
        school.removeStudent(785080);
        school.printAllStudents();
        // school.removeStudent(school.findStudent(785080));
        school.removeStudent(785080);

        school.printAllStudents();

        System.out.println("\nExample for Student Courses");
        System.out.println("By Id:");
        school.getCoursesForStudent(189787);
        System.out.println("By Student-object:");
        school.getCoursesForStudent(gesuchterStudent);


        System.out.println("\n\n### MAP CHALLENGES ###");
        // Medications

        Medication aspirin = new Medication("Aspirin", "9,99€", 20);
        Medication chamomilla = new Medication("Chamomilla", "7,99€", 200);
        Medication ibuprofen = new Medication("Ibuprofen", "9,99€", 15);
        Medication naproxen = new Medication("Naproxen", "14,99€", 20);
        Medication acetaminophen = new Medication("Acetaminophen", "4,99€", 10);
        Medication celebrex = new Medication("Celebrex", "45,99€", 3);


        // PHARMACYs
        Pharmacy rosenApotheke = new Pharmacy();
        rosenApotheke.saveMedication(aspirin);
        rosenApotheke.saveMedication(ibuprofen);
        rosenApotheke.saveMedication(chamomilla);
        rosenApotheke.saveMedication(naproxen);
        rosenApotheke.saveMedication(acetaminophen);
        rosenApotheke.saveMedication(celebrex);


        System.out.println(rosenApotheke.getMedicationCount());
        System.out.println("\nBeispiele Namensausgabe über findMedication (Aspirin vs Arsepirin)");
        System.out.println(rosenApotheke.findMedication("Aspirin"));
        System.out.println(rosenApotheke.findMedication("Arsepirin"));

        System.out.println();
        rosenApotheke.printFullMedicationInventory();
        System.out.println();

        System.out.println("Rückruf Aktion: Chamomilla wird entfernt," +
                "\nweil Homöopathie wirkt nicht über den Placebo-Effekt hinaus\n");
        rosenApotheke.deleteMedication("Chamomilla");

        rosenApotheke.printFullMedicationInventory();
    }
}