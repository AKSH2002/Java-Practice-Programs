package com.company;
interface Cars{

    void Brand();

}

interface Bikes{

    void Model ();
}

class Vehicles implements Cars,Bikes{

    public void Brand(){

        System.out.println("This is the method form the cars");

    }

    public void Model(){

        System.out.println("This is th method form the bikes");
    }
}

public class Multi_Interface {
    public static void main(String [] args){

     Vehicles V1 = new Vehicles();

     V1.Brand();
     V1.Model();
    }
}