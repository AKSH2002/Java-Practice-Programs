package com.company;

interface Colleges{

    void students();
    void teachers();

}

class Computers implements Colleges{

    public void students(){
        System.out.println("This is student method");
    }

    public void teachers(){
        System.out.println("This is teacher method");
    }

}
public class Interface {
    public static void main(String [] args){

        Computers C1 = new Computers();

        C1.teachers();
        C1.students();

    }
}
// 1-8 13-17 19-22