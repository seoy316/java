package com.modeling.weather;

import java.util.Scanner;

// 강수량 센서
public class Rsensor implements Sensor{

    Scanner s = new Scanner(System.in);

    @Override
    public int get() {
        return s.nextInt();
    }

}
