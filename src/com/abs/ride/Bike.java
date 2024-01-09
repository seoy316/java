package com.abs.ride;

public class Bike extends TwoWheeler {

    @Override
    void printPrice() {
        System.out.println("가격 : 150,000");
    }

    @Override
    void printType() {
        System.out.println("이것은 자전거입니다.");
    }


    void printBrand() {
        System.out.println("브랜드 : 삼천리");
    }
}
