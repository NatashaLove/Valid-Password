package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int beginning=0;
        int ending=0;
        //String S="";
        String subs="";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your password.");
        //String passw;
        String S=input.nextLine();

        boolean number=false;
        boolean uppercase=false;

        for (int i=0; i<S.length();i++){
            if (Character.isUpperCase(S.charAt(i)))
           // if (Character.isUpperCase(S(i)){}
            {
                uppercase=true;
                //continue;
                //System.out.println("Invalid Password. Please try again.");
            }
        }
        if (!uppercase)
        {System.out.println("Invalid Password. Please try again.");}
    }
}
