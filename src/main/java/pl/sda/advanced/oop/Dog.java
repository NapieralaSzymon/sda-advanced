package pl.sda.advanced.oop;

public final class Dog extends Animal {

    public Dog(String name) {
        super(name, Animal.Type.CHORDATE);
    }

    public void run() {
        System.out.println("Running " + getName());
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    public void eat(String meal) {
        System.out.println("Dog eat " + meal);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", type=" + type +
                '}';
    }

}
