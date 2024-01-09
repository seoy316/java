package com.jeongol.Array1;

public class Array9066_ex {
    public static void main(String[] args) {
        char []alphabet = new char[26];
        char a = 'A';
        for (int i=0; i<alphabet.length; i++) {
            alphabet[i] = a;
            a++;
        }

        for (int i = alphabet.length-1; i >= 0; i--)
            System.out.printf("%c ", alphabet[i]);
    }
}
