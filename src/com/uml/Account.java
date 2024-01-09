package com.uml;

// 계좌
public class Account {
    // 잔고
    private int balance;

    // 입금
    public void deposit(int money) {
        System.out.println("입금할 금액을 입력하세요.");
        this.balance += money;

        System.out.printf("%d원이 입금되었습니다.\n", money);
    }

    public int getBalance() {
        return balance;
    }
}
