package pl.sda.advanced.oop;

import java.util.Objects;

public class Animal {

    public enum Type {

        CHORDATE, ARTHROPOD, MOLLUSCA

    }

    private final String name;

    protected final Type type;

    public Animal(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("Animal eat");
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Animal animal = (Animal) object;
        return Objects.equals(name, animal.name) &&
                type == animal.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

}
