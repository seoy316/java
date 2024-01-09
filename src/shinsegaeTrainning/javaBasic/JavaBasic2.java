package shinsegaeTrainning.javaBasic;

public class JavaBasic2 {
    public static void main(String[] args) {
        int total = 0;
        for (int i=0; i<101; i++) {
            if (i%3==0)
                total += i;
        }
        System.out.printf("3의 배수 총합 : %d", total);
    }
}
