package ro.java.ctrln.method.references;

import ro.java.ctrln.lambda.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BittnetMethodReferences {

    public static void main(String[] args) {


        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        // Referire metoda statica
        integers.forEach(BittnetMethodReferences::print);
        System.out.println();

        // Expresie lambda
        integers.forEach(integer -> BittnetMethodReferences.print(integer));
        System.out.println();

        BittnetComparator bittnetComparator = new BittnetComparator();

        // Referinta metoda dintr-un obiect particular
        Collections.sort(integers, bittnetComparator::compare);

        //Expresie lambda
        Collections.sort(integers, (a,b) -> bittnetComparator.compare(a,b));

        // Referinta pe o metoda a unui obiect de un anume tip
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 23));
        students.add(new Student("Emily", 25));
        students.add(new Student("Eliza", 21));
        students.add(new Student("Ben", 38));

        students.sort(Comparator.comparing(Student::toString));
        System.out.println("Studentii sortati");
        System.out.println(students);

        // REFERINTA METODEI
            students.forEach(Student::printSomething);

        // EXPRESIE LAMBDA
        students.forEach(student -> student.printSomething());
    }

    public static void print(Integer integer) {
        System.out.println(integer  + " ");
    }

    private static class BittnetComparator {
        public int compare(Integer a, Integer b) {
            return a.compareTo(b);
        }
    }
}
