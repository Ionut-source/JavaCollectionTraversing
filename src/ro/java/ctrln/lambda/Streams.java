package ro.java.ctrln.lambda;

import ro.java.ctrln.lambda.model.Student;

import java.util.ArrayList;

public class Streams {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 23));
        students.add(new Student("Emily", 25));
        students.add(new Student("Eliza", 21));
        students.add(new Student("Ben", 38));

        students.stream().filter(student -> student.getAge() > 21).forEach(student -> System.out.println(student));

        students
                .stream()
                .filter(student -> student.getAge() < 40 )
                .map(student -> student.getName())
                .forEach(name -> System.out.println(name));
    }
}
