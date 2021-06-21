package ro.java.ctrln.method.references;

import ro.java.ctrln.lambda.model.Student;

public class BittnetConstructorReference {

    public static void main(String[] args) {

        StudentFactory studentFactory = Student::new;
        Student student = studentFactory.getStudent("John", 23);
        System.out.println(student);
    }
}
