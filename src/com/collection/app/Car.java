package com.collection.app;

public class Car implements Comparable<Car> {

    private String car;
    private int price;

    public Car(String car, int price) {
        this.car = car;
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        int comparePrice = o.getPrice();
//        return this.price - comparePrice; // 양수 오름차순 정렬
        return comparePrice - this.price; // 음수 내림차순 정렬
    }


    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
