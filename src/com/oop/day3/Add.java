package com.oop.day3;

public class Add {
    private int intA;
    private int intB;
    private Double doubleA;
    private Double doubleB;

    Add() {}

    Add(int a, int b) {
        this.intA = a;
        this.intB = b;
        adder(a, b);
    }

    Add(int a, Double b) {
        this.intA = a;
        this.doubleB = b;
        adder(a, b);
    }

    Add(Double a, int b) {
        this.doubleA = a;
        this.intB = b;
        adder(a, b);
    }

    Add(Double a, Double b) {
        this.doubleA = a;
        this.doubleB = b;
        adder(a, b);
    }


    public void adder(int a, int b) {
        System.out.println(a + " " + b);
    }
    public void adder(int a, Double b) {
        System.out.println(a + " " + b);
    }
    public void adder(Double a, int b) {
        System.out.println(a + " " + b);
    }
    public void adder(Double a, Double b) {
        System.out.println(a + " " + b);
    }

}
