package com.oop.basic.classEx.sec03.exam01;

public class Car {
	//필드 선언 (모델, 엔진 on/off, speed)
    private String model;
    private boolean engine;
    private int speed;

    public Car() {}

    public Car(String model, boolean engine, int speed) {
        this.model = model;
        this.engine = engine;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



}