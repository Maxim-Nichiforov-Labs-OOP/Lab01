package com.company;

import java.util.ArrayList;

public class University {
    private ArrayList<Student> students = null;
    private String name;
    private int foundationYear;

    public University(String name, int foundationYear) {
        students = new ArrayList<Student>();
        this.name = name;
        this.foundationYear = foundationYear;
    }

    public void addStudent(String name, int age, float mark) {
        if (students == null)
            return;

        Student newStudent = new Student(name, age, mark);
        students.add(newStudent);
    }

    public float average() {
        if (students == null)
            return 0;

        if (students.size() == 0)
            return 0;

        float sum = 0;

        for (int i = 0; i < students.size(); ++i) {
            sum += students.get(i).getMark();
        }

        return sum / students.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }
}
