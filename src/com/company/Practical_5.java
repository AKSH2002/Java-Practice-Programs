package com.company;

// Write java Program for single level and Multilevel inheritance.

// Code:-
class Animal{
    void method(){
        System.out.println("I am an Animal");
    }
}
class Dog extends Animal{
    void method(){
        System.out.println("I am a dog");
    }
}
class labrador extends Dog{
    void method(){
        System.out.println("My breed is labrador");
    }
}
public class Practical_5{
    public static void main(String[] args) {
        labrador l1 = new labrador();
        l1.method();
    }
}

