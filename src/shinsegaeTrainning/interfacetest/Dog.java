package shinsegaeTrainning.interfacetest;

public class Dog extends Animal{
    public Dog(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        // hours의 1/2만 이동
        distance = speed * ((double) hours * 1/2);
    }
}
