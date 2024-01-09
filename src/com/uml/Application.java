package com.uml;

import java.util.Scanner;

public class Application {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Account account1 = new Account();

        int money = sc.nextInt();
        account1.deposit(money);

        System.out.printf("현재 잔고는 %d원 입니다.\n", account1.getBalance());
    }
}
