    ////Write a program to read 5 numbers and print factorials of each.
    //    //(Final answers should be non decimal numbers).
    //    //print factorial of numbers;

    /*
    Factorials of input numbers
Write a program to read 5 numbers and print factorials of each.

(Final answers should be non decimal numbers).



Example:

Input:

2
3
4
6
5

Output:

2
6
24
720
120

     */
package Hands_on;

import java.math.BigInteger;
import java.util.Scanner;
public class Java_Iterations_handsOn2 {
    public static void main(String[] args){
        //1st solution using BigInteger;
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        for(int i=0;i<5;i++){
            num[i]=sc.nextInt();

        }
        for(int i=0;i<5;i++){
            System.out.println(fact(num[i]));
        }
        //2nd solution using string
//        Scanner scn=new Scanner(System.in);
//        int []num=new int[5];
//        for(int i=0;i<5;i++)
//        {
//            num[i]=scn.nextInt();
//            String res=factorial(num[i]);
//            System.out.println(res);
//        }
    }
    public static String factorial(int n)
    {
        BigInteger fact=new BigInteger("1");
        for(int i=1;i<=n;i++){
            fact=fact.multiply(new BigInteger(i+""));
        }
        return fact.toString();
    }
    public static BigInteger fact(int num){

        BigInteger ans=BigInteger.ONE;
        for(int i=1;i<=num;i++){
            ans=ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
/*
Factorials grow extremely fast. For instance:
13
!
13! (factorial of 13) = 6,227,020,800, which fits within a long.
20
!
20! = 2,432,902,008,176,640,000, which is still within the range of long.
21
!
21! = 51,090,942,171,709,440,000, which exceeds the maximum value for a long.
 */

        //fact_long valid and stores upto 20! =
    public static long fact_long(int num){
        if(num<=1){
            return 1;
        }
        long ans=1;
        for(int i=1;i<=num;i++){
            ans*=i;
        }
        return ans;
    }
    //fact_int holds/valids/stores upto 12!
    public static int fact_int(int num) {
        if (num <= 1) {
            return 1;
        }
        int ans = 1;
        for (int i = 1; i <= num; i++) {
            ans *= i;
        }
        return ans;
    }
}
