package pl.sda.advanced.oop;

import java.util.List;
import java.util.Objects;

public class Professor extends Person {

    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
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
        Professor student = (Professor) object;
        return Objects.equals(students, student.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), students);
    }

    @Override
    public String toString() {
        return "Professor{"
                + "name='" + getName() + "'"
                + ", age=" + getAge()
                + ", students=" + students
                + "}";
    }

}
