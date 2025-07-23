package AbstractClass;

public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("Car Starting");
    }

    @Override
    public void doStuff() {
        System.out.println("do stuff in car");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown car");
    }
}
