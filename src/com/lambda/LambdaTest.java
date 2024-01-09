package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;


public class LambdaTest {
    public static void main(String[] args) {
        // 1.
        List<String> list = Arrays.asList("apple", "banana", "pear", "orange");
        list.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("===== 정렬 후 리스트=====\n" + list);

        // 2.
        Function<String, String> toUpperCase = (str) -> str.toUpperCase();
        System.out.println("===== 대문자 변환 =====\n" + toUpperCase.apply("hello woRld"));

        // 3.
        Predicate<String> empty = String::isEmpty;
        System.out.println(empty.test("헬로우"));
        System.out.println(empty.test(""));

        // 4.
        BiFunction<String, String, String> comcat = (str1, str2) -> str1.concat(str2);
        String result = comcat.apply("hello", "world");
        System.out.println("===== 문자열 합치기 =====\n" + result);

        // 5.
        Function<Integer, Integer> square = (num) -> num * num;
        int squareResult = square.apply(5);
        System.out.println("===== 제곱값 =====\n"+ squareResult);
    }
}
