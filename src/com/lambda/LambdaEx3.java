package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


interface Product {
    int calculate(List<Integer> numbers);

}

public class LambdaEx3 {
    public static void main(String[] args) {
        // 정수형 리스트를 numbers를 생성하세요. 리스트의 순서는 1,2,3,4,5 입니다.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // numbers의 값을 foreach를 이용하여 순서대로 출력하는 람다식을 작성하세요.
        numbers.forEach((number) -> System.out.println(number));

        Product product = products -> products.stream().reduce(1, (a, b) -> a * b);
        List<Integer> list = List.of(2, 3, 4);
        System.out.println(product.calculate(list));

/*        List<String> names = Arrays.asList("John", "jane", " Adam", "Eve");
        Collectors.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        Collections.sort(names.(a,b)->a.compareTo(b));*/


        // 문자열 리스트 names를 대문자로 변환한느 람다식을 작성
        List<String> names = Arrays.asList("John", "jane", " Adam", "Eve");
        List<String> uuperCaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(uuperCaseNames);

        // 매개변수와 반환값이 없는 람다식도 간으

        // filter
        // 2-1
        List<Integer> oddNumber = numbers.stream()
                                        .filter(number -> number % 2 == 1)
                                        .collect(Collectors.toList());
        // 2-2
        List<Integer> evenNumber = numbers.stream()
                                        .filter(number -> number % 2 == 0)
                                        .collect(Collectors.toList());

        System.out.println(oddNumber);
        System.out.println(evenNumber);

    }

}
