package com.abs.shape;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        System.out.println("Rectangle 클래스 생성자 호출");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "사각형의 색상은 " + this.getColor() + " 그리고 면적은 : " + area();
    }
}
