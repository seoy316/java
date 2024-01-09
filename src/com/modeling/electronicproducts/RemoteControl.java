package com.modeling.electronicproducts;

public interface RemoteControl {
    // 1. 상수 필드
    public static final int MAX_VALUE = 30;
    public static final int MIN_VALUE = 0;

    // 2. 추상 메소드
    public void turnon();
    public void turnoff();

}
