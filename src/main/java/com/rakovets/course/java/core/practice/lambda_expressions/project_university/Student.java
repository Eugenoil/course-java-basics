package com.rakovets.course.java.core.practice.lambda_expressions.project_university;

public class Student {
    private final String name;
    private final String surname;
    private final String specialty;
    private final int course;

    public Student(String name, String surname, String specialty, int course) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return  "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialty='" + specialty + '\'' +
                ", course=" + course +
                '}';
    }
}
