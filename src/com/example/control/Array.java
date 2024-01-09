package com.example.control;

public class Array {
    public static void main(String[] args) {
        //주소값을 비교 동등비교 연산자 (==, !=)
        //참조(reference)는 내것이 아님 소유의 개념이 아님, 공용도서관의 책이라고 생각하면 됨

        //배열 변수 array1 선언
        int[] array1;
        //배열 변수 array2 선언
        int[] array2;
        //배열 변수 array3 선언
        int[] array3;

        //배열 { 1, 2, 3 }을 생성하고 array1 변수에 대입
        array1 = new int[]{1,2,3}; //힙의 영역에 객체를 생성하겠다 라는 뜻이 new, array1 정수형 배열을 생성하고 초기화 한꺼번에 하는거
        //배열 { 1, 2, 3 }을 생성하고 array2 변수에 대입
        array2 = new int[3];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;

        //배열 변수 array2 값을 배열 변수 array3에 대입
        array3 = array2;
        System.out.println(array3.hashCode() == array2.hashCode());
        if (array3.hashCode() == array2.hashCode()){
            System.out.println("주소값이 같음");
        }
        else {
            System.out.println("주소값이 다름");
        }

        if (array1.hashCode() == array2.hashCode()){
            System.out.println("주소값이 같음");
        }
        else {
            System.out.println("주소값이 다름");
        }

        if (array1 == array2){
            System.out.println("주소값이 같음");
        }
        else {
            System.out.println("주소값이 다름");
        }
        // array1과 array2 변수가 같은 배열을 참조하는지 검사

        if (array1 == array2)
            System.out.println("같은 배열 참조");
        else
            System.out.println("다른 배열 참조");

        // array2와 array3 변수가 같은 배열을 참조하는지 검사
        if (array2 == array3)
            System.out.println("같은 배열 참조");
        else
            System.out.println("다른 배열 참조");
    }
}