package ro.java.ctrln.lambda;

import ro.java.ctrln.lambda.model.Student;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Random;

public class Statistics {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 23));
        students.add(new Student("Emily", 25));
        students.add(new Student("Eliza", 21));
        students.add(new Student("Ben", 38));

        IntSummaryStatistics statistics = students.stream().mapToInt(student -> student.getAge()).summaryStatistics();

        System.out.println("Media varstelor: " + statistics.getAverage());
        System.out.println("Suma varstelor: " + statistics.getSum());
        System.out.println("Cea mai mica varsta: " + statistics.getMin());
        System.out.println("Cea mai mare varsta: " + statistics.getMax());
        System.out.println("Numarul total de studenti: " + statistics.getCount());

        Random random = new Random();
        random.ints().limit(10).forEach(number -> System.out.println(number));
        random.doubles().limit(10).sorted().forEach(number -> System.out.println(number));
    }
}
