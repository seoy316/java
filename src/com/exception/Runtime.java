package com.exception;

public class Runtime {
    public static void main(String[] args) {

        int[] arr = new int[5];

        for (int i=0; i<6; i++) {

            try {
                arr[i] = i;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println(e);
            }

        }

    }
}
