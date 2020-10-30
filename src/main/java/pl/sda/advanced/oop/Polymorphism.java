package pl.sda.advanced.oop;

public class Polymorphism {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal[] animals = new Animal[2];
        animals[0] = new Animal("Zwierzę", Animal.Type.CHORDATE);
        animals[1] = new Dog("Pies");
        zoo.setAnimals(animals);
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

}
