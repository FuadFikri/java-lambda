package com.fuad.syamsudin;

import java.util.function.Supplier;

public class LazyApp {

    public static void main(String[] args) {
//        eager
//        testScore(90,"fikri");
//        testScore(50,getName());

//        lazy parameter
        testScore(30, () -> getName());
    }

//    tanpa lambda
//    by default di java, parameter itu eager
    public static  void testScore(int score, String name){
        if (score > 80){
            System.out.println(" selamat " + name + ", Anda lulus");
        }else {
            System.out.println("coba lagi tahun depan");
        }
    }

    public static  void testScore(int score, Supplier<String> name){
        if (score > 80){
            System.out.println(" selamat " + name.get() + ", Anda lulus");
        }else {
            System.out.println("coba lagi tahun depan");
        }
    }

    public static  String getName(){
        System.out.println("getName() dipanggil");
        return "Fikri";
    }

}
