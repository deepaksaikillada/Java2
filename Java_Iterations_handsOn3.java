    //find second largest prime number

    /*
    write a program to read 'n' numbers and display the second largest prime number
    The first number entered will be considered as n. Next, the program should read 'n' numbers (no-decimal values)

    consider below example as input:-
    6
    1
    3
    17
    33
    44
    43
    output will be:-
    17
     */
package Hands_on;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;
import java.util.Collections;
import java.util.Vector;
import java.math.BigInteger;
import java.util.TreeSet;
public class Java_Iterations_handsOn3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeSet<BigInteger>primeSet=new TreeSet<>();
        for(int i=0;i<n;i++){
            BigInteger num=sc.nextBigInteger();
            if(num.isProbablePrime(20)){ //here is high certainty level i.e, =20; which is best to identify primes/composite , if we use low certainty level i.e,=1 then
                /*
                You are using isProbablePrime(1), which is a very low certainty level and may incorrectly identify some composite numbers as prime. A higher certainty level (e.g., 20) would reduce the risk of incorrect results. This is critical in ensuring that only prime numbers are considered.
                 */
                primeSet.add(num);
            }
        }
        if(primeSet.size()<2){
            return;
        }
        primeSet.pollLast();
        System.out.println(primeSet.pollLast());


//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
////        Stack<Integer>primes=new Stack<>();
//        Vector<Integer>primes=new Vector<>();
//        for(int i=0;i<n;i++){
//            if(isPrime(arr[i])){
////                primes.push(arr[i]);
//
//                primes.add(arr[i]);
//            }
//
//        }
//        Collections.sort(primes,Collections.reverseOrder());
//        System.out.println(primes.get(1));


//        System.out.println(primes.remove(1));
//        System.out.println(primes.peek());
//        primes.firstElement();
//        primes.lastElement();
//        primes.push();
//        primes.pop();
//        primes.
//        System.out.println(primes.lastElement());
//        primes.pop();
////
//        System.out.println(primes.pop());
    }
//    public static boolean isPrime(int num){
//        if(num<=1){
//            return false;
//        }
//        for(int i=2;i*i<=num;i++){
//            if(num%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
}
