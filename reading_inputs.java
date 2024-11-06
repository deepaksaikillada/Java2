package com.company;
//there are various ways to read inputs in java
//but simplest/easiest way to read inputs is by using SCANNER Class

import java.util.Scanner;   //what it will do? it will imports the scanner class into the current program/code

public class reading_inputs{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in); //here system.in means we should take the standard input from the user end input;

        int x= sc.nextInt();  //here we are taking input as let's say :- x=200;
        x=100;              //here we're making again x=100;
        System.out.println(x);  //so finally we get out put and prints:- 100 (only not 200)

        int y=sc.nextInt();     //let's say or take input as y=200;
        System.out.println(y);  //prints:- 200'
        System.out.println(y*y); //we can perform any operations ; prints:- 40000

//        byte b=sc.nextByte();
//        System.out.println(b);
//
//        short s=sc.nextShort();
//        System.out.println(s);
//
//        long l=sc.nextLong();
//        System.out.println(l);
//
//        //
//
//        String str=sc.next();
    }
}