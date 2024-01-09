package com.oop.advanced.model;

public class Person {

    private Phone phone;

    Person(Phone phone) {
        this.phone = phone;
    }

    public void createMessage() {
        String message = "안녕, 반가워. 오늘 몇시에 만날까?";
        String to = "내 친구";

        // 문자 전송 기능 호출
        this.phone.sendMessage(to, message);

    }
}
