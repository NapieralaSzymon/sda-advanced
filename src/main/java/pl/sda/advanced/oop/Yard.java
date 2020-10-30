package pl.sda.advanced.oop;

public class Yard {

    private final Animal[] animals;

    public Yard(Animal[] animals) {
        this.animals = animals;
    }

    public static void main(String[] args) {
        Yard yard = new Yard(new Animal[]{new Dog("Reksio"), new Cat("Mruczysław")});
        yard.feedAnimals();
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

}
