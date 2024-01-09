package com.jeongol.Loop2;

public class Loop547_self {
    public static void main(String[] args) {
        for (int i =1; i<6; i++) {
            for (int j=i+1; j < i+1+5; j++)
                System.out.printf("%d ", j);
            System.out.println();
        }
    }
}
