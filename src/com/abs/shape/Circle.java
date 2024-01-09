package com.abs.shape;

public class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.color = color;
        this.radius = radius;
        System.out.println("Circle 클래스 생성자 호출");
    }

    @Override
    double area() {
        return radius * radius * 3.14;
    }

    @Override
    public String toString() {
        return "원 색상은 " + this.getColor() + " 그리고 면적은 : " + area();
    }
}
