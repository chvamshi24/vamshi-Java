package AbstractClass;

public class Camera extends Machine {

    @Override
    public void start() {
        System.out.println("starting Camera");
    }

    @Override
    public void doStuff() {
        System.out.println("do Stuff in car");
    }

    @Override
    public void shutdown() {
        System.out.println("shutingdown camera");

    }
}
