package com.collection.generic;


import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {

        Box box = new Box();

        System.out.println(box.isEmpty());

        box.addItem("String");
        box.addItem("Integer");
        box.addItem("Double");
        box.addItem("String");

        System.out.println(box.isEmpty());
        System.out.println(box.getInItem("String"));
    }

    public <T> void printArray(T[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }
}
