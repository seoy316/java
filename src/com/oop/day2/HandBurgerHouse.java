package com.oop.day2;

public class HandBurgerHouse {
    public static void main(String[] args) {
        // 모든 재료
        Hamburger hamburger = new Hamburger.Builder(2, 2).bacon(1).tomato(1).cheese(1).build();
        hamburger.printHamburger();

        // 치즈랑 토마토
        Hamburger hamburger1 = new Hamburger.Builder(2, 2).cheese(2).tomato(2).build();
        hamburger1.printHamburger();

        // 치즈
        Hamburger hamburger2 = new Hamburger.Builder(2, 2).cheese(1).build();
        hamburger2.printHamburger();

    }
}
