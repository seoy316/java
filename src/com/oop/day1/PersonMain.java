package com.oop.day1;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person.Builder("신세계")
                                            .age(20)
                                            .address("서울시 강남구")
                                            .tel("010-1234-5678")
                                            .build();
        person.printInformation();
    }
}
