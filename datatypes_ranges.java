package com.company;

public class datatypes_ranges {
    public static void main ( String[] args){
        //char data type
        char ch='=';
        System.out.println(ch);
        //boolean data type
        boolean bool =false;
        System.out.println(bool);
        //byte //ranges:[-128,127]; //size: 8bits
        byte B=2;
        System.out.println(B);
        //short     /ranges:[-32768,32767]; //size: 16bits
        short a=10;
        System.out.println(a);
        //int       /ranges:[-2147483648,2147483647]; //size: 32bits
        int b=20;
        System.out.println(b);
        //long      /ranges:[-9223372036854775808,9223372036854775807]; //size: 64bits
        long c=3_000_000_000L; // by default if we are giving continuous digits then it will be considered
        // as a int variable not as a long variable, if we want to declare a long variable
        // while using continuous digits we should include at last L for indicating long variable
        // but not as an int variable
        System.out.println(c);

        //
        //by default in java decimal values taking double
        //such that we have to provide at last which type of variable it is if you're using float otherwise
        //it will take default double variable

        //float
//      float f=3.1423; // it will gets error because it is being interpreted by default as double variable

        float f=3.1423F;  //here we're using at last F to declare it is floating variable not a double one
                    //to make difference
                    //if you not use it gets some error like this while running:= /*26:17
                    //java: incompatible types: possible lossy conversion from double to float
        // Required type:
        //float
        //Provided:
        //double*/
        System.out.println(f);


        //double
        double d=3.14;
        System.out.println(d);
    }
}