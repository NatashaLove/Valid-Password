package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        int beginning = 0;
        int ending = 0;
        //String S="";
        String subs = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password.");

        String S = input.nextLine();
        // boolean uppercase=false;
        // uppercase(S);

        if (!uppercase(S)) {
            System.out.println("Invalid Password. Please try again.");
        }

        //if string contains Uppercase (meets one condition) - look for a number in the string:
        else if (uppercase(S)) {
            for (int i = 0; i < S.length(); i++) {
                boolean number;
                //checking if chars are numbers
                try {
                    Integer.parseInt(String.valueOf(S.charAt(i)));
                    number = true;
                    System.out.println("There're numbers only.Test1");
                    //index of number in the string password
                    // final int indexNum=i;
                } catch (NumberFormatException e) {
                    number = false;
                    System.out.println("There's NON number char.Test1");
                    subs = S.substring(i);
                    beginning = i;
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

                 */
            }

//checking substring for more numbers char
            for (int j = 0; j < subs.length(); j++) {
                boolean number;
                try {
                    Integer.parseInt(String.valueOf(subs.charAt(j)));
                    number = true;
                } catch (NumberFormatException e) {
                    number = false;
                }
                if (number) {
                    ending = j - 1;
                    break;
                }
            }
            //too many for loops (inside) - need to separate
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
        }
    }


                /*
                if (!number){
                    beginning=i;
                    System.out.println("Password will start with "+S.charAt(i));
                    subs=S.substring(i);
                }

                 */





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
}
