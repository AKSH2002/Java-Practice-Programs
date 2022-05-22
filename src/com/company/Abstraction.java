package com.company;

//import java.sql.SQLOutput;

abstract class Car{
    Car() {
        System.out.println("Car is built.");
    }
    abstract void drive();
    void gearChange(){
        System.out.println("Gearchanged!!");
    }
}

class Tesla extends Car{
    void drive(){
        System.out.println("Deive safely");
    }
}

public class Abstraction {
    public static void main(String[] args){
        Car obj = new Tesla();
        obj.drive();
        obj.gearChange();
    }
}
