package com.company;

public class TryCatch1 {
    public static void main (String [] args){
        try{
            int data=5/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("This is finally");
        }
    }
}
