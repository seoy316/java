package com.oop.day3;

public class AddObject {

    public void adder(Integer number1, Integer number2) {
        if ((number1 instanceof Integer) && (number2 instanceof Integer)) {
            int result = number1.intValue() + number2.intValue();
            System.out.println(result);

        }

    }

}
