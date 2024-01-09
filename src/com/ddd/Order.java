package com.ddd;

import java.util.List;

import static com.ddd.OrderState.DELIVERING;

// 주문 '출고상태 변경하기', '배송지 정보 변경하기', '주문 취소하기', ''
public class Order {

    private List<OrderLine> orderLines;
    private Money totalAmounts;
    private ShippingInfo shippingInfo;
    private OrderState state;

    public Order(List<OrderLine> orderLines, ShippingInfo shippingInfo) {
        setOrderLines(orderLines);
        setShippingInfo(shippingInfo);
    }

    // 어그레이티브?
    private void setOrderLines(List<OrderLine> orderLines) {
        verifyAtLestOneorMoreOrderLines(orderLines);
        this.orderLines = orderLines;
        calculateTotalAmounts();
    }

    private void setShippingInfo(ShippingInfo newShippingInfo) {
        if (newShippingInfo == null)
            throw new IllegalArgumentException();

        this.shippingInfo = newShippingInfo;
    }

    private void verifyAtLestOneorMoreOrderLines(List<OrderLine> orderLines) {
        if (orderLines == null || orderLines.isEmpty()) {
            throw new IllegalArgumentException("no OrderLine");
        }
    }

    private void calculateTotalAmounts() {
        int sum = orderLines.stream().mapToInt(x->x.getAmounts()).sum();
        this.totalAmounts = new Money(sum);

    }

    private void verifyNotYetShipped() {
        if (state != OrderState.PAYMENT_WAITING && state != OrderState.PREPARING)
            throw new IllegalArgumentException("aleady shipped");
    }

    public void changeShipped(ShippingInfo newShippingInfo) {
        verifyNotYetShipped();
        setShippingInfo(newShippingInfo);
    }

    // 배송지 변경
    public void changeShippingInfo(ShippingInfo newShipping) {
        verifyNotYetShipped();
        setShippingInfo(newShipping);
    }

    // 주문 취소
    public void cancel() {
        verifyNotYetShipped();
        this.state = OrderState.CANCELD;
    }

    // 결제 완료
    public void completePayment() {
        this.state = OrderState.PREPARING;

    }

}

//요구사항을 프로그램으로 만들기 위해 시스템 구조나 행위를 도식화 한것???