package com.oop.day2;

public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
