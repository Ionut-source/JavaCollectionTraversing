package ro.java.ctrln.lambda;

import ro.java.ctrln.lambda.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpresions {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 23));
        students.add(new Student("Emily", 25));
        students.add(new Student("Eliza", 21));
        students.add(new Student("Ben", 38));
        System.out.println("Ordine initiala");
        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student studentOne, Student studentTwo) {
                return Integer.compare(studentOne.getAge(), studentTwo.getAge());
            }
        });

        System.out.println("Ordinea dupa sortare");
        System.out.println(students);

        Collections.shuffle(students);
        System.out.println("Ordine aleatoare cu shuffle");
        System.out.println(students);

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student studentOne, Student studentTwo) {
                return Integer.compare(studentOne.getAge(), studentTwo.getAge());
            }
        });
        System.out.println("Rearanjare dupa shuffle");
        System.out.println(students);

        Collections.shuffle(students);
        System.out.println("Ordine aleatoare cu shuffle inainte de comparator ca expresie lambda");
        System.out.println(students);

        students.sort((s1,s2) -> {
            return Integer.compare(s1.getAge(), s2.getAge());
        });
        System.out.println("Rearanjare dupa Comparator - varianta extinsa ");
        System.out.println(students);

        students.sort((s1,s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        System.out.println("Rearanjare dupa Comparator - varianta extinsa simplificata");
        System.out.println(students);
    }
}
