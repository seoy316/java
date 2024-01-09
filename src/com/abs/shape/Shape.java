package com.abs.shape;

public abstract class Shape {
    String color;

    abstract double area();

    public Shape(String color) {
        System.out.println("Shape 클래스 생성자 호출");
        this.color = color;
    }

    public String getColor() { return color; }
}
