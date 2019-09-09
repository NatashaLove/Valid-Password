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

        String S=input.nextLine();

        boolean uppercase=false;

        for (int i=0; i<S.length();i++){
            if (Character.isUpperCase(S.charAt(i)))
           // if (Character.isUpperCase(S(i)){}
            {
                uppercase=true;
                break;//if at least 1 uppercase - good, enough.
                //System.out.println("Invalid Password. Please try again.");
            }
        }
        if (!uppercase)
        {System.out.println("Invalid Password. Please try again.");}
        else
        {
            for (int i=0; i<S.length();i++) {

                boolean number;
                try{
                    Integer.parseInt(String.valueOf(S.charAt(i)));
                    number=true;
                } catch (NumberFormatException e){
                    number=false;
                    System.out.println("Password will start with "+S.charAt(i));
                    subs=S.substring(i);
                    beginning=i;
                    break;//because found the first
                }
                /*
                if (!number){
                    beginning=i;
                    System.out.println("Password will start with "+S.charAt(i));
                    subs=S.substring(i);
                }

                 */

            }

        }
    }
}
