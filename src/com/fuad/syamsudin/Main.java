package com.fuad.syamsudin;

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

    }
}
