package com.jeongol.Loop2;

import java.util.Scanner;
import java.util.function.Consumer;

public class Loop541_self {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Consumer<String> print = (input) -> {
            for (int i=0; i<20; i++)
                System.out.print(input);
        };
        String input = sc.nextLine();
        print.accept(input);
    }
}
