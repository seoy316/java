package com.collection.app.student;


import java.util.Arrays;
import java.util.Comparator;

public class StudentMain {
    public static void main(String[] args) {
        Student student[] = new Student[5];
        //순서대로 "이름", 학번, 학점
        student[0] = new Student("Dave", 20240001, 4.2);
        student[1] = new Student("Amie", 20160001, 4.5);
        student[2] = new Student("Emma", 20110001, 3.5);
        student[3] = new Student("Brad", 20130001, 2.8);
        student[4] = new Student("Cara", 20140001, 4.2);

        Arrays.sort(student);
        Arrays.stream(student).forEach(s-> System.out.println(s));

        System.out.println("#2");
        Arrays.sort(student, Student.COMPARATOR);

        Arrays.stream(student).limit(2).forEach(s-> System.out.println(s));
    }
}
