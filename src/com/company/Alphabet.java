package com.company;
import javax.swing.*;
import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args){
        Scanner chr = new Scanner(System.in);
        char c = chr.next().charAt(0);
//        int chara = chr.nextInt();


        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            System.out.println(c + " is Alphabet");
        }
        else
        {
            System.out.println(c + " is Consonant");
        }
    }
}

