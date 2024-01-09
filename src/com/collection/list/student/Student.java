package com.collection.list.student;

import java.util.List;

public class Student {
    private String stuno;
    private String name;
    private Subject subjects;

    public Student(String stuno, String name) {
        this.stuno = stuno;
        this.name = name;
    }

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject subjects) {
        this.subjects = subjects;
    }
}
