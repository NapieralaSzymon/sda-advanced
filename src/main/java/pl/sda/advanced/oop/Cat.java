package pl.sda.advanced.oop;

public final class Cat extends Animal {

    public Cat(String name) {
        super(name, Type.CHORDATE);
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", type=" + type +
                '}';
    }

}
