package pl.sda.advanced.oop;

import java.util.Arrays;

public class Zoo {

    private Animal[] animals;

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Zoo zoo = (Zoo) object;
        return Arrays.equals(animals, zoo.animals);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(animals);
    }

}
