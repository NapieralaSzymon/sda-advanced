package pl.sda.advanced.abstraction;

public class Plane extends Vehicle implements Flying {

    @Override
    public void go() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }

}
