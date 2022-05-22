package com.company;
import java.util.Scanner;
public class largest_of_three {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        int first = a.nextInt();
        int second = a.nextInt();
        int third = a.nextInt();
//        System.out.println(first + "\n" + second  + "\n" + third);

        if (first > second && first > third)
        {
            System.out.println(first + " First is Greater");
        }
        else if (second > first && second > third)
        {
            System.out.println(second + " Second is Greater");
        }
        else
        {
            System.out.println(third + " Third is Greater");
        }
    }
}
