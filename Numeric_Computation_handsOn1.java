// Find interest value
    /*
    Q1 . Find interest value
Create a class Account with below attributes:
int id
double balance
double interestRate
Class should have getters, setters and constructor with parameters in above sequence of attributes.
Create a class Solution with main method. Read one integer and two double values using Scanner object and create object of Account class. These values should be mapped to id, balance and interestRate attributes.
Read one more integer value and store it in variable noOfYears.
Write a method calculateInterest which will take account object and no of years as input parameters and return the interest amount
Consider below logic to calculate the interest value:
For specified no of years, first find out the percentage value those no of years based on specified interestRate. E.g. if no of years is 5 and specified interestRate is 4%, then 4% of 5 is 0.2.
This percentage should be added to original interstRate for calculating the final interest value. Hence for above example it will be 4.2 (instead of 4).
Display the interest amount rounded upto three decimal places. Even if the result does not have decimal, it should be displayed with suffix ".000".

Consider below sample input and output:


Input:

1
1000
10
5

Output:
105.000



Output is 55 since the interest rate is 10 and no of years is 5. Hence, the final interest will be 10 + 10 percentage of 5, which is 10.5. Hence final answer is 105.000.
     */
package Hands_on;
import java.util.Scanner;
public class Numeric_Computation_handsOn1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Account account=new Account(sc.nextInt(),sc.nextDouble(),sc.nextDouble());
        int n=sc.nextInt();
        double ans=calc(account,n);
        System.out.printf("%.3f",ans);
    }
    public static double calc(Account account, int n){
        double per= account.interestRate*(double)n/100;

        double x=account.interestRate+per;
        return (account.getBalance()*x)/100;
    }
}
class  Account{
    int id;
    double balance;
    double interestRate;
    public Account(int a,double b,double c){
        this.id=a;
        this.balance=b;
        this.interestRate=c;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getInterestRate(){
        return this.interestRate;
    }

}

