package com.ddd;

// 주문 항목을 표현하는 클래스 : 주문할 상품, 상품의 가격, 구매 개수, 각 구매 항목의 구매 가격 제공
/*
 *   한 상품(Product)을 얼마(price)에 몇 개(amount) 살지 담고, 구매 가격 계산 로직(calculateAmounts) 구현
 */

public class OrderLine {
    private Product product;
    private int price;
    private int quantity;
    private int amounts;

    public OrderLine(Product product, int price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.amounts = this.calculateAmounts(); // 자동으로 계산해서 생성할 수 있음
    }

    private int calculateAmounts() {
        return this.price * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmounts() {
        return amounts;
    }
}
