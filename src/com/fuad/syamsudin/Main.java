package com.fuad.syamsudin;

import java.util.function.Consumer;

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

    }
}
