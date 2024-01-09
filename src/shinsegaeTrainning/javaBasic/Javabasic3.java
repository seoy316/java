package shinsegaeTrainning.javaBasic;

public class Javabasic3 {
    public static void main(String[] args) {
        // 못풀었어요
        int total = -1;
        while (total != 5) {
            int a = (int) (Math.random() * 6) + 1;
            int b = (int) (Math.random() * 6) + 1;
            System.out.println(a + " " + b);
            total = a+b;
        }
        System.out.println("주사위의 합이 5 입니다.");
    }
}
