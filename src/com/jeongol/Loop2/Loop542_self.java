package com.jeongol.Loop2;

import java.util.stream.IntStream;

public class Loop542_self {
    public static void main(String[] args) {
        // for (int i=10; i<=20; i++)
        // 	System.out.printf("%d ", i);

        IntStream.range(10, 21).forEach(i -> System.out.printf("%d ", i));
    }
}
