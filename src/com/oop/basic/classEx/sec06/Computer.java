package com.oop.basic.classEx.sec06;
//가변길이 매개변수
/*메소드를 호출할 때, 매개변수의 개수에 맞게 제공해야 한다.
만약, 메소드가 가변길이 매개변수를 가지고 있다면 ,매개변수의 개수와 상관없이 매개값을 제공해야 한다.
int sum(int ... values)*/
public class Computer {
    boolean power;

    int sum(int ... values){
        int sum = 0;

        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    public boolean isPower() {
        if (power == true) {
            System.out.println("컴퓨터 전원이 켜져있습니다.");
        }
        else {
            System.out.println("컴퓨터 전원이 꺼져있습니다.");
        }
        return power;
    }

}
