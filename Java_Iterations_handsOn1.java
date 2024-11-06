//. Write main method in Solution class.
//The method will read a String value and print the minimum valued character (as per alphabet and ASCII sequence).
//Consider below sample input and output:

    /*
    Write main method in Solution class.

The method will read a String value and print the minimum valued character (as per alphabet and ASCII sequence).



Consider below sample input and output:



Input:

HellO

Output:

H



Important: Answer is not 'e' since 'H' has lower ASCII value then 'e'

     */
package Hands_on;
import java.util.Scanner;
public class Java_Iterations_handsOn1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        int mini=Integer.MAX_VALUE;
//        int mini=str.charAt(0);
//        char mini=str.charAt(0);
//        char mini=Character.MAX_VALUE;
        for(int i=0;i<n;i++){
//            char chh=str.charAt(i)
//            if(chh<mini){
//                mini=chh
//            }
            int x=(int)str.charAt(i);
            if(x<mini){
                mini=x;
            }
        }
//        char ch=(char)mini;
//        System.out.println(chh);
        System.out.println((char)mini);
    }
}
