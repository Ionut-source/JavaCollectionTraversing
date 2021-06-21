package ro.java.ctrln.method.references;

import ro.java.ctrln.lambda.model.Student;

@FunctionalInterface
public interface StudentFactory {
    Student getStudent(String name, int age);
    //Student getStudent(String name); // trebuie sa avem o sg metoda abstracta in contractul interfetei
    //atunci cand adnotam interfata cu @FunctionalInterface
}
