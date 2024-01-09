package com.collection.generic;

import java.util.Arrays;

public class MyGenericClass3 {
    public static void main(String[] args) {
        Integer arr[] = {1 ,2, 1, 1, 3, 1, 4};
        System.out.println(countOccurrences(arr, 1));

        String arr2[] = {"장", "서", "윤", "장", "김", "서", "장"};
        System.out.println(countOccurrences(arr2, "장"));
    }
    static <T> long countOccurrences (T[] arr, T element) {
        return Arrays.stream(arr).filter(a-> a == element).count();
    }
}
