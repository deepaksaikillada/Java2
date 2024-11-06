package com.company;

public class type_casting {
    public static void main(String[] args){
        //type casting means:-
        /*
        type casting refers to changing the type of data from one data type to other
         it is of two types:-
         1. Widening Type Casting:- ** Automatically done by Java
                byte->short->int->long->float->double  (conversion from lower data type to higher data type done automatically)
         2. Explicit Type Casting:- ** done by user end
                double->float->long->int->short->byte   (conversion from lower data type to higher data type done by user end)
         */

        //converting or storing in smaller data types to larger data types or vice versa
        //
        //
        int x=1000000000;
        long y=x;     //widening type conversion or type casting (from converting  int(lower) to long(higher) data type) done automatically
        System.out.println(x);  //prints:- 1000000000
        System.out.println(y);  //prints:- 1000000000
        //
        long a=1_0_000_000_000L;
//        int b=a; ////possible lossy conversion from long to int
        int b=(int)a;       //explicit conversion or explicit type casting (from converting long(higher) to int(lower) data type) done by user end
        System.out.println(a);      //prints:- 10000000000
        System.out.println(b);      //prints:- 1410065408
        //

        int p=2000;
        byte q=(byte)p;
        System.out.println(p);  //prints:-2000
        System.out.println(q);  //prints:- -48              ////lossy conversion beware of it
        //jagratha while converting higher data types to lower data types because lower data types range will be less
        // (higher) data types range will be higher while comparing both
        //like here //byte //ranges:[-128,127]; //size: 8bits   //(int)2000 is not fit into bytes
        //          //int /ranges:[-2147483648,2147483647]; //size: 32bits
    }
}


