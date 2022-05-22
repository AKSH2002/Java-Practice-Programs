package com.company;
import java.util.Scanner;

import static java.lang.System.*;

public class Alphabet_Switch {
    public static void main(String[] args) {


            Scanner cha = new Scanner(in);
            char c = cha.next().charAt(0);

            switch (c)
            {
                case 'a', 'e' , 'i' , 'o' , 'u' -> out.println("Alphabet");

                default -> out.println("Consonant");


            }


    }
}
