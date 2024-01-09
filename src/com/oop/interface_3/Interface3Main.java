package com.oop.interface_3;

public class Interface3Main {
    public static void main(String []args) {
        // 구현 객체 생성
        B b = new B();
        C c = new C();
//        B bc = new C();

        D d = new D();
        E e = new E();

        // 인터페이스 변수 선언
        A a;

        // 변수에 구현 객체 대임
        a = b;
        a = c;
        a = d;
        a = e;
    }
}
