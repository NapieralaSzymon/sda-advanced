package pl.sda.advanced.oop;

import java.util.List;
import java.util.Objects;

public class Student extends Person {

    private List<Integer> grades;

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        Student student = (Student) object;
        return Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grades);
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + getName() + "'"
                + ", age=" + getAge()
                + ", grades=" + grades
                + "}";
    }

}
