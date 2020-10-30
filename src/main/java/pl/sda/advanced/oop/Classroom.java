package pl.sda.advanced.oop;

import java.util.Arrays;
import java.util.Objects;

public class Classroom {

    private Professor professor;
    private Student[] students;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Classroom classroom = (Classroom) object;
        return Objects.equals(professor, classroom.professor) &&
                Arrays.equals(students, classroom.students);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(professor);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }

}
