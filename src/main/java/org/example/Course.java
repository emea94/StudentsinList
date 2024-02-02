package org.example;

/*
Expand the Java-List project with a class called "Course" that has the following properties: course name, instructor, room.

Add a method to the Student class to add courses to the student (courses in which the student is participating).

Implement a method within the School class to retrieve all courses of a specific student (based on a student ID).
*/

public class Course {
    String courseName;
    String instructor;
    String room;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Course(String courseName, String instructor, String room) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
