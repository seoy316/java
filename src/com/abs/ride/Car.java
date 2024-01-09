package com.abs.ride;

public class Car extends FourWheeler{

    @Override
    void printPrice() {
        System.out.println("가격 : 50,000,000");
    }

    void printType() {
        System.out.println("이것은 자동차입니다.");
    }

    void printBrand() {
        System.out.println("브랜드 : BMW");
    }
}
