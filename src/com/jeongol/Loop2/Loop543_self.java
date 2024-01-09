package com.jeongol.Loop2;

import java.util.Scanner;
import java.util.function.Consumer;

public class Loop543_self {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Consumer<Integer> print = (input) -> {
            for (int i=1; i<=input; i++) {
                if (i%2==0)
                    System.out.printf("%d ", i);
            }
        };
        int input = sc.nextInt();
        print.accept(input);
    }
}
