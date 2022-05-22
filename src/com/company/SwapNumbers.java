package com.company;

public class SwapNumbers {
    public static void main(String[] args){
        float firstring;
        float first = 1.20f , second = 2.45f ;
        float temp = first;
        System.out.println("--Before Swap--");
        System.out.println("First number: = " + first + "\nSecond number: = " + second);

        first = first + second;
        second = first - second;
        first = first - second;

     /*   first = second;
        second = temp;
        temp = first; */

        System.out.println("--After Swap--");
        System.out.println("First number: = " + first + "\nSecond number: = " + second);

    }
}
