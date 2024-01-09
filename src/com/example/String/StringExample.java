package com.example.String;

public class StringExample {
    public static void main(String[] args) {
        String subject = "자바 네트워크 프로그래밍";
        char charValue = subject.charAt(4);

        System.out.println(charValue);
        StringBuilder sb = new StringBuilder();

        for (int i=3; i<7; i++) {
            System.out.print(subject.charAt(i));

            sb.append(subject.charAt(i));

        }
        System.out.println(sb);
        String []name = subject.split(" ");
        System.out.println(name[1]);
    }
}
