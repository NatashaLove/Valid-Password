package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static int separator=0;// index of a char which is a number(int) and separates strings- at the end of a string
   public static int beginning;
   public static int ending;
  // public static int indexNum;
    //String S="";
 //because it's globally = "" - the result after doing separate methods is null.. need to manipulate with variables- make them equal to values after methods..
 //or better separate a substring class and ith getters-setters have the correct values assigned..
   public static String subs = "";
   public static String subs1="";

    public static void main(String[] args) {
        // write your code here

        ArrayList <String> substrs = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password.");

        String S = input.nextLine();
        // boolean uppercase=false;
        // uppercase(S);

        if (!uppercase(S)) {
            System.out.println("Invalid Password. Password should contain Uppercase letter. Please try again.");
        }

        //if string contains Uppercase (meets one condition) - look for a number in the string:
        else if (uppercase(S)) {
            //here create ne obj substring with parameter (S) and for loop - method -inside the constructor-to find the beginning of substring
            Substrings substrings=new Substrings(S);
            if (uppercase(Substrings.getSubs1())) {
                System.out.println("Printing in MAIN: " + Substrings.getSubs1());//working!!!
                String s1 = Substrings.getSubs1();
                //  if (uppercase(substrings.toString()))
                substrs.add(s1); // adding subs to list
            }else {
                System.out.println("BAD substring.. proceeding to next..");
            }

// next use the obj substring with methods from its class - ending etc..



            //make this for-loop - a method for finding the beginning of substring
           // Substrings.subBegin(S);
            /*
            for (int i = 0; i < S.length(); i++) {
                boolean number;
                //checking if chars are numbers
                try {
                    Integer.parseInt(String.valueOf(S.charAt(i)));
                    number = true;
                    System.out.println("There're numbers only in main string.Test1");
                    //index of number in the string password
                   //indexNum=i;
                } catch (NumberFormatException e) {
                    number = false;
                    System.out.println("There's NON number char.Test1");

                    beginning = i;
                    subs = S.substring(beginning);
                    System.out.println("There's NON number char at index " + beginning+ ".Test2. "+ beginning+ " is equal to "+i);

                    break;//because found the first NON number char
                }
                /*
                if (!number) {
                    //the first non num - char - beginning of the substring
                    subs = S.substring(i);
                    beginning = i;
                    System.out.println("There's NON number char at index " + beginning+ ".Test2. "+ beginning+ " is equal to "+i);
                }


            }
        */
//TRY TO MAKE METHOD FOM THIS FOR OTHER SUBS- starting with separator(instead of 0) - for all following substrings in between ints-to find the ending of substring
//checking substring for more numbers char
/*
            subs=substrings.toString();

            //Prints address... of the obj in memory.. not the string...
            //need to change smth..- wrong result

            System.out.println("This is subs after converting substrings.ToString: "+subs);
            System.out.println("This is substring itself: "+substrings);
/*
            for (int j = 0; j < subs.length(); j++) {
                boolean number;
                try {
                    Integer.parseInt(String.valueOf(subs.charAt(j)));
                    number = true;
                    System.out.println("There's a number in SUBs.Test3");
                    System.out.println("There's a number char at index " + j);
                    //ending is a number!
                    //next subs can loop starting after ending! - (ending+1)-from separator
                    ending = j;
                   subs1 = subs.substring(0, ending);
                   separator=ending+1;
                    break;

                } catch (NumberFormatException e) {
                    number = false;
                    System.out.println("There's NON number char at index " + j);

                }
            }
                /*
                if (number) {
                    ending = j - 1;
                    break;
                }

                 */
                /*
int	indexOf(String str)
Returns the index within this string of the first occurrence of the specified substring.
int indexOf(String str, int fromIndex)
Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.

  //!!MAKE METHOD OF IT FOR ALL OTHER SUBS!
            //checking subs for uppercase:

            System.out.println("This is the substring from the beginning to the end: "+ subs1);
            if (Substrings.uppercase(subs1)){
                System.out.println("Password is: " + subs1);
            }else {
                //if it's not
                System.out.println("not uppercase..bad string..");
                subs1=""; // so the bad string doesn't get compared
                //should repeat (for the rest of the string - the same loop)

            }


            /*
            for (int a = beginning; a < ending; a++) {
                if (Character.isUpperCase(subs.charAt(a))) {
                    subs = S.substring(beginning, ending);
                    System.out.println("Password is: " + subs);
                    break;
                } else {
                    System.out.println("Something is wrong in the above code...");
                    break;
                }
            }

             */
            //all code to check subs - before this bracket(inside else if)
        }
    }


                /*
                if (!number){
                    beginning=i;
                    System.out.println("Password will start with "+S.charAt(i));
                    subs=S.substring(i);
                }

                 */

//leave the uppercase method here - because it checks all the entered pass initially to see if valid or not..
    //check if there is uppercase- method
   public static boolean uppercase (String St){
       boolean uCase = false;
       for (int i = 0; i < St.length(); i++) {

            if (Character.isUpperCase(St.charAt(i)))
            // if (Character.isUpperCase(S(i)){}
            {
                uCase = true;
                break;//if at least 1 uppercase - good, enough.
                //System.out.println("Invalid Password. Please try again.");
            }
        }
       final boolean uCase1 = uCase;
       return uCase1;
   }

    //PROBABLY BETTER TO CREATE A SEPARATE SUBSTRING CLASS -AND HAVE A CONSTRUCTOR THERE + ALL THE METHODS TO BUILD AND TEST SUBSTRINGS

/*
    //make this for-loop - a method for finding the beginning of substring
    public static void subBegin(String Str) {
       for (int i = 0; i < Str.length(); i++) {
           boolean number;
           //checking if chars are numbers
           try {
               Integer.parseInt(String.valueOf(Str.charAt(i)));
               number = true;
               System.out.println("There're numbers only in main string.Test1");
               //index of number in the string password
               //indexNum=i;
           } catch (NumberFormatException e) {
               number = false;
               System.out.println("There's NON number char.Test1");

               beginning = i;
               subs = Str.substring(beginning);
               System.out.println("There's NON number char at index " + beginning + ".Test2. " + beginning + " is equal to " + i);
                break;//because found the first NON number char
           }
                /*
                if (!number) {
                    //the first non num - char - beginning of the substring
                    subs = S.substring(i);
                    beginning = i;
                    System.out.println("There's NON number char at index " + beginning+ ".Test2. "+ beginning+ " is equal to "+i);
                }


       }
    }
    /*
    //TRY TO MAKE METHOD FOM THIS FOR OTHER SUBS- starting with separator(instead of 0) - for all following substrings in between ints-to find the ending of substring
//checking substring for more numbers char
    public static void subEnd(String Str) {
        for (int j = 0; j < Str.length(); j++) {
            boolean number;
            try {
                Integer.parseInt(String.valueOf(Str.charAt(j)));
                number = true;
                System.out.println("There's a number in SUBs.Test3");
                System.out.println("There's a number char at index " + j);
                //ending is a number!
                //next subs can loop starting after ending! - (ending+1)-from separator
                ending = j;
                subs1 = Str.substring(0, ending);
                separator = ending + 1;
                break;

            } catch (NumberFormatException e) {
                number = false;
                System.out.println("There's NON number char at index " + j);

            }
        }
    }

     */

}
