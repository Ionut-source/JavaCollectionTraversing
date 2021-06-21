package ro.java.ctrln.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class TraversingAgregateOperations {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        integers. forEach(integer -> System.out.println(integer));
        integers.forEach(System.out::println);

        integers.stream().forEach(integer-> System.out.println(integer));
        integers.stream().forEach(System.out::println);

        integers.stream().filter(e->e%2==0).forEach(integer-> System.out.println(integer));
        integers.stream().filter(e->e%2==0).forEach(System.out::println);
    }
}
