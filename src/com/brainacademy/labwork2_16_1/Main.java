package com.brainacademy.labwork2_16_1;

public class Main {

    public static void foo(Animal a) {
        System.out.println("Animal");
    }

    public static void foo(Dog d) {
        System.out.println("Dog");
    }

    public static void main(String[] strings) {

        System.out.println("******************************************");
        System.out.println("Labwork 2.16.1");
        System.out.println("-------------------------------------------");
        foo(new Animal());
        foo(new Dog());
        Animal a = new Dog();
        foo(a);
        System.out.println("******************************************");
    }
}
