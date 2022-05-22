package com.company;
class circl{
    double pi;
    int r;

    void area()
    {
        System.out.println(pi * r * r);
    }

}
public class circleArea {
     public static void main(String[] args){
         circl cl = new circl();
         cl.pi = 3.14;
         cl.r = 2;
         cl.area();

     }
}
