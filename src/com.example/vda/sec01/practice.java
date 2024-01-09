package com.example.vda.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class practice {

    static final double PI = 3.14;

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

/*        System.out.printf("상품 가격을 입력해주세요.\n");
        int productPrice = in.nextInt();
        System.out.printf("상품의 가격:%d원\n", productPrice);
        System.out.printf("상품의 가격:%6d원\n", productPrice);
        System.out.printf("상품의 가격:%-6d원\n", productPrice);
        System.out.printf("상품의 가격:%06d원\n", productPrice);

        System.out.printf("반지름 입력: \ns");
        int r= in.nextInt();
        System.out.printf("반지름이 %d인 원의 넓이:\t %.2f\n", r, r*r*PI);
        System.out.printf("%10d|%-10s|%10s", 1, "홍길동", "도적");*/

        // 1.
/*        int a, b;
        System.out.print("a의 값 입력: ");
        a = in.nextInt();
        System.out.print("b의 값 입력: ");
        b = in.nextInt();

        System.out.printf("a + b = %d\n", a+b);

        // 2.

        while (true) {
            System.out.println("원하는 문자열을 입력하세요.");
            String str = in.nextLine();
            if (str.equals("q"))
                break;
            System.out.println(str);
        }

        System.out.println("종료");*/

        /*
            실습3 .  학생의 이름을 입력받고 , 해당 학생의  국어, 영어, 수학, 과학 4과목의 점수를 입력받아   총합과 평균을 구한 후
            출력 :  000 학생의 국어: 점수, 영어: 점수 , 수학: 점수, 과학 : 점수  출력
            000학생의 총점은 00, 평균은 00.0 입니다.
        */

        System.out.print("이름을 입력하세요: ");
        String name = in.nextLine();

        int []score = new int[4];
        String []subject = {"국어", "수학", "영어", "과학"};

        for (int idx = 0; idx < subject.length; idx++) {
            System.out.printf("%s 점수: ", subject[idx]);
            score[idx] = in.nextInt();
        }

        int total = Arrays.stream(score).sum();
        double avg = Arrays.stream(score).sum()/score.length;

        System.out.printf("%s 학생의 점수\n", name);
        for (int idx=0; idx < subject.length; idx++) {
            System.out.printf("%s 과목 : %d 점\n", subject[idx], score[idx]);
        }
        System.out.printf("%s 학생의 총점은 %d, 평균은 %.2f 입니다.", name, total, avg);
    }


}
