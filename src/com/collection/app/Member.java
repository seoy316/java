package com.collection.app;

public class Member implements Comparable<Member>{

    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o instanceof Member m) {
            return m.name.equals(name) && (m.age == age);
        } else {
            return false;

        }

    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public int compareTo(Member o) {
        if (age < o.age) return -1;
        else if (age== o.age) return 0;
        else return 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
