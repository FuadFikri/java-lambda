package com.fuad.syamsudin;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("i am here");

        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action(String name) {
                return "Hi "+ name;
            }
        };

        SimpleAction simpleAction = name -> " Hello " + name;
        SimpleAction simpleAction2 = (name) -> " Hello " + name;


        Consumer<String> consumer1 = s -> System.out.println("Hi "+ s);
        Consumer<String> consumer2 = s -> System.out.println("Hi "+ s.toUpperCase());

        consumer1.andThen(consumer2).accept("isna");


        String myString = "Halo halo halo";


        Integer length = functionLength.apply(myString);
        System.out.println(length);


        Predicate<String> predicate = s -> s.contentEquals("Fikri");

        boolean containFikri = predicate.test(myString);
        System.out.println(containFikri);


    }

     static Function<String, Integer> functionLength = s -> s.length();
}
