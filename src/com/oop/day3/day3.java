package com.oop.day3;

class Student {
    private int id;
    private String name;

    public void insertRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println(this.id + " " +this.name);
    }
}

public class day3 {
    public static void main(String []args) {
        Student stObj1 = new Student();
        stObj1.insertRecord(20021004, "홍길순");
        stObj1.printInfo();

        Object s = 1;

        System.out.println(s instanceof Integer);

    }
}
