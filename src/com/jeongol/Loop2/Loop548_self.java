package com.jeongol.Loop2;

import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Loop548_self {
    public static void main(String[] args) {
        Consumer<Integer> gugudan = (n) -> {
            IntStream.range(1, 6).forEach(i-> System.out.printf("%d * %d = %2d   ", n, i, n*i));
            System.out.println();
        };
        IntStream.range(2, 5).forEach(i->gugudan.accept(i));
    }
}
