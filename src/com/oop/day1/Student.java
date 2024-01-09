package com.oop.day1;

public class Student {
    public String name;
    public String major;

    Student() {}
    Student(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String eat(String food) {
        return "food";
    }
}
