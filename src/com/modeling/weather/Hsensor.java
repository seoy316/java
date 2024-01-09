package com.modeling.weather;


import java.util.Scanner;

// 습도 센서
public class Hsensor implements Sensor {
    Scanner s = new Scanner(System.in);

    @Override
    public int get() {
        return s.nextInt();
    }

}
