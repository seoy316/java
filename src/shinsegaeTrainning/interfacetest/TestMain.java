package shinsegaeTrainning.interfacetest;

public class TestMain {
    public static void main(String []args) {

        Dog dog = new Dog(8);
        Chicken chicken = new Chicken(3);
        Cheatable cheatableChicken = new Chicken(5);

        if (cheatableChicken instanceof Cheatable)
            cheatableChicken.fly();

        for (int i=1; i<=3; i++) {
            System.out.println(i + "시간 후");
            dog.run(i);
            chicken.run(i);
            ((Chicken) cheatableChicken).run(i);

            System.out.println("개의 이동 거리=" + dog.getDistance());
            System.out.println("닭의 이동 거리=" + chicken.getDistance());
            System.out.println("날으는 닭의 이동거리=" + ((Chicken) cheatableChicken).getDistance());
        }
    }
}
