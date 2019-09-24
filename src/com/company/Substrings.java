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
    Substrings(){   }
    // to create object substring- with ready beginning and ending + checking if it's valid or not
    Substrings(String S){
        //construct substring..
        //setBeginning();
        subBegin(S);// taking original string
        //test
        System.out.println("This is message from substrings class inside the constructor.");
       //setEnding
        subEnd(getSubs());//taking the fresh substring to find its end

        //check the ready subs for uppercase
       if (uppercase(getSubs1())){
           System.out.println("This is a Valid substring: "+ getSubs1());
           // and save to a list of valid subs to compare them later


       } else   {
           //for this separator already shouldn't be=0, but go through method ending and find the end of the previous substring:
           System.out.println("This is a NOT Valid substring: "+ getSubs1());
           setBeginning(getSeparator());

       }

    }

    public static int getBeginning() {
        return beginning;
    }

    public static void setBeginning(int beginning) {
        Substrings.beginning = beginning;
    }

    public static String getSubs() {
        return subs;
    }

    public static void setSubs(String subs) {
        Substrings.subs = subs;
    }

    public static void setSeparator(int separator) {
        Substrings.separator = separator;
    }

    public static int getSeparator() {
        return separator;
    }

    public static String getSubs1() {
        return subs1;
    }

    public static void setSubs1(String subs1) {
        Substrings.subs1 = subs1;
    }

    public static int getEnding() {
        return ending;
    }

    public static void setEnding(int ending) {
        Substrings.ending = ending;
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
                setBeginning(i);
                subs = Str.substring(getBeginning());
                setSubs(Str.substring(getBeginning()));
                System.out.println("There's NON number char at index " + getBeginning() + ".Test2. " + getBeginning() + " is equal to " + i);
                System.out.println("The substring will start from char: " + getSubs().charAt((getBeginning())));
                break;//because found the first NON number char
            }
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
                setEnding(j);
                //here substring should start ith var beginning - getBeginning,
                // NOT 0 - otherwise it goes only through the first substring
                // - always setting separator to 0 too
                separator = ending + 1;
                setSeparator(getEnding() + 1);
                subs1 = Str.substring(getBeginning(), getEnding());
                setSubs1(Str.substring(getBeginning(), getEnding()));
                // after changing from 0 to vars - still only the 1st substring is displayed..
                //need to change something between beginning and separator in the method above....

                break;

            } catch (NumberFormatException e) {
                number = false;
                System.out.println("There's NON number char at index " + j);

            }
        }

    }
}
