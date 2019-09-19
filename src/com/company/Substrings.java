package com.company;

public class Substrings {
    static private int separator=0;// index of a char which is a number(int) and separates strings- at the end of a string
    static private int beginning;
    static private int ending;
    // public static int indexNum;
    //String S="";
    //because it's globally = "" - the result after doing seprate metods is null.. need to manipulate with variables- make them equal to values after methods..
    //or better separate a substring class and ith getters-setters have the correct values assigned..
    static private String subs = "";
    static private String subs1="";

    //Constructor
    Substrings(){

    }
    // to create object substring- with ready beginning
    Substrings(String S){
        //construct substring..
        subBegin(S);

    }


    //check if there is uppercase- method - in substrings
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

                 */
        }
    }
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
}
