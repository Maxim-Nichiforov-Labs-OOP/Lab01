package com.company;

public class Student {

    private String name;
    private float mark;
    private int age;

    public Student(String name, int age, float mark) {
        this.name = name;
        this.mark = mark;
        this.age = age;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
