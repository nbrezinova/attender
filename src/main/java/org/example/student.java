package org.example;

import java.util.*;

public class student {
    private long id;
    private String name;
    private Gender gender;
    private int yearOfStudy;
    private Set<student> subject;

    public student(long id, String name, Gender gender, int yearOfStudy, Set<student> subject) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.yearOfStudy = yearOfStudy;
        this.subject = subject;
    }

    public void addStudent(student student) {
        subject.add(student);
    }

    public static void main(String[] args) {
        Set<student> math;
        math = new HashSet<>();
        Gender w = null;
        Gender m = null;
        student st1 = new student(123, "hcyf", w, 2024, math);
        st1.addStudent(st1);
        student st2 = new student(1234, "vjv", m, 2024, math);
        st2.addStudent(st2);
    }

}


