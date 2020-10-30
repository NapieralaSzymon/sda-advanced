package pl.sda.advanced;

import pl.sda.advanced.oop.Person;
import pl.sda.advanced.oop.Professor;
import pl.sda.advanced.oop.Student;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class Main {

    public static void main(String[] args) {
        // OOP
        Person person = new Person();
        person.setName("Adam Budyń");
        person.setAge(18);
        System.out.println(person);
        Student student = new Student();
        student.setName("Cezary Drwal");
        student.setAge(20);
        student.setGrades(asList(2, 3, 4, 5));
        System.out.println(student);
        Professor professor = new Professor();
        professor.setName("Edward Frędzel");
        professor.setAge(40);
        professor.setStudents(singletonList(student));
        System.out.println(professor);
    }

}
