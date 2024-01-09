package com.oop.day1;

public class Person {
    private final String name;
    private final int age;
    private final String address;
    private final String tel;

    public static class Builder {
        private final String name;
        private int age;
        private String address;
        private String tel;

        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder tel(String val) {
            tel = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    private Person(Builder builder) {
        name = builder.name;
        age = builder.age;
        address = builder.address;
        tel = builder.tel;
    }

    public void printInformation() {
        System.out.printf("%s의 나이는 %d살이고 주소는 %s이며, 전화번호는 %s이다.",
                this.name, this.age, this.address, this.tel);
    }

}
