package com.company;

public class constant_variables {
    public static void main(String[] args){
        double pi=3.14159265359;
        System.out.println(pi); //prints :- 3.14159265359
        pi=3;
        System.out.println(pi); //prints :- 3.0
        //here the value is change while it declaring again and again the values is changes accordingly

        final double PI=3.14159265359; //here we are using final keyword to fix the variable, so it is constant variable
        //either we can initialise while declaring the variable (or) we can initialise after declaration but only once
        //(so we cannot initialise many times, we get error if we do )
        System.out.println(PI);
//        PI=3;
        //if we initialise again and again this variable we get error because of constant variable keyword final
        System.out.println(PI);    //prints error:- java: cannot assign a value to final variable PI




        int x=100;
        System.out.println(x);
        x=20;
        System.out.println(x);
        final int X=100;
        System.out.println(X);
//        X=10;
        System.out.println(X);
    }
}