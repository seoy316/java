package shinsegaeTrainning.interfacetest;

public abstract class Animal {
    protected int speed;
    protected double distance;

    public Animal(int speed) {
        this.speed = speed;
    }

    // 호출 시 distance에 누적
    public abstract void run(int hours);

    public double getDistance() {
        return distance;
    }
}
