package shinsegaeTrainning.interfacetest;

public class Chicken extends Animal implements Cheatable{

    public Chicken(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        // hours 만큼 이동
        distance = speed * (double) hours;
    }

    @Override
    public void fly() {
        speed = speed * 2;
    }
}
