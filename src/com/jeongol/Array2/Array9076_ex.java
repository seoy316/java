package com.jeongol.Array2;

public class Array9076_ex {
    public static void main(String[] args) {
        int []fibo = new int[41];
        fibo[1] = 1;
        fibo[2] = 1;

        for (int i=3; i<41; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for (int i=10; i<41; i+=10)
            System.out.printf("피보나치 수열 %d항 : %d\n", i, fibo[i]);
    }
}
