
package com.company;
import java.util.Scanner;
public class Practic {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a weight in pounds");
        int weight = scan.nextInt();
        System.out.println("Enter a height in inches");
        int height = scan.nextInt();

        System.out.println("BMI = "+ (weight*.45359237f)/((height*.0254f)*(height*.0254f)));
    }
}
