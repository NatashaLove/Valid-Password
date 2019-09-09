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
                    // break;//because found the first
                }
                if (!number) {
                    subs = S.substring(i);
                    beginning=i;
                    for (int j = 0; j < subs.length(); j++) {

                        try{
                            Integer.parseInt(String.valueOf(subs.charAt(j)));
                            number=true;
                        } catch (NumberFormatException e){
                            number=false;
                        }
                        if (number){

                            ending=j-1;
                        }

                            for (int a=0;a<=ending;a++) {
                                if (Character.isUpperCase(subs.charAt(a))) {
                                    subs=S.substring(beginning, ending);

                                    System.out.println("Password will start with " + subs.charAt(0));

                                }
                                else    {
                                    System.out.println("Something is wrong in the above code...");
                                    break;
                                }
                            }

                    }
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
