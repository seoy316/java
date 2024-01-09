package com.collection.app;

import java.util.TreeSet;

public class ComaprableMember {

    public static void main(String[] args) {
        TreeSet<Member> members = new TreeSet<>();

        members.add(new Member("홍진욱", 27));
        members.add(new Member("김설희", 26));
        members.add(new Member("오혁진", 28));
        members.add(new Member("장서윤", 27));

        for (Member m : members) {
            System.out.println(m.getName() + " " + m.getAge());
        }

    }
}
