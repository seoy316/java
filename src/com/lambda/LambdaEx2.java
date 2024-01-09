package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@FunctionalInterface
interface MathOperation{
    int calculate(int a, int b);
}

interface ArrayOperation {
    int calculateOddSum(int[] numbers); // 정수 배열을 받아 모든 홀수의 합을 반환하는 람다식, 결과 출력 작성
}

interface StringOperation {
    int getLength(String str);
}

interface FindMax {
    int getMax(List<Integer> numbers);

}


public class LambdaEx2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int []numbers = {1,2,3,4,5,6,7,8,9,10};

        // 문자열의 길이를 반환하는 람다식 작성
        StringOperation stringOperation = (string -> string.length());
        System.out.println(stringOperation.getLength("abcdef"));

        ArrayOperation arrayOperation = (arrNumber ->
                Arrays.stream(arrNumber).filter(num -> num % 2 == 1).sum());
        arrayOperation.calculateOddSum(numbers);


        FindMax max = (nums) -> {
            int maxNumber = Integer.MIN_VALUE;
            for (int number : nums) {
                if (number > maxNumber) {
                    maxNumber = number;
                }
            }
            return maxNumber;
        };


        List<Integer> numberList = new ArrayList<>();
        for (int i=0; i<5; i++) {
            int n = sc.nextInt();
            numberList.add(n);
        }

        int maxValue = max.getMax(numberList);
        System.out.println(maxValue);
        // 람다식에 데이터를 전달한 후 반환 처리 구문 작성

        // 결과 작성
    }

}
