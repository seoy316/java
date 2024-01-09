package com.jeongol.Loop3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Loop552_self {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int cnt = ((n-i)*2)-1;
            IntStream.range(0, i).forEach(m-> System.out.print(" "));
            IntStream.range(0, cnt).forEach(m-> System.out.print("*"));
            System.out.println();
        }
    }
}
