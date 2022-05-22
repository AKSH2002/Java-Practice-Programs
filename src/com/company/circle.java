package com.company;
import java.math.MathContext;
public class circle {
    public static void main(String[] args){

     cir cl = new cir();
        System.out.println(cl.getArea());
    }
}

class cir{
        double radius = 2;
        double getArea()
        {
            return radius * radius * Math.PI;
        }
}