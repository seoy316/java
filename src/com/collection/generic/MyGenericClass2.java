package com.collection.generic;

public class MyGenericClass2 {
    static <T> void swap (T[] arr, int idx1, int idx2) {
        T tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
}
