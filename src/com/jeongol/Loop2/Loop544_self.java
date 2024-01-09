package com.jeongol.Loop2;

import java.util.Scanner;
import java.util.function.Function;

public class Loop544_self {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Function<Integer, Integer> totalPrint = (input) -> {
            int total = 0;
            for (int i=input; i<=100; i++)
                total+=i;
            return total;
        };
        int input = sc.nextInt();
        System.out.print(totalPrint.apply(input));
    }
}
