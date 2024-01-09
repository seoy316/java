package com.modeling.weather;

import java.util.Scanner;

// 온도 센서
public class Tsensor implements Sensor{
    // 온도 입력 받음
    Scanner s = new Scanner(System.in);

    @Override
    public int get() {
        return s.nextInt();
    }

}
