/*
 Shirt Discount, Price

Class Solution has predefined main method to read values and display the results.


main method reads the value for five objects of class Shirt.

It also calls methods - getDiscountPrice and getShirtWithMoreThanSpecificPrice defined in same Solution class.


Code inside main method should not be altered else your solution might be scored as zero.



You may copy the code from main method in eclipse to verify your implementation.



Guidelines to implement the code:



Create class Shirt with attributes:

int tag
String brand
double price
char gender



Create constructor which takes parameters in above sequence. Create getters and setters for these attributes.



Next, in Solution class, define two static methods as below:



public static double getDiscountPrice(Shirt s):



This method will return the discounted price based on gender for the Shirt object which is passed as input parameter.

If gender is 'm' then discount is 10%. For 'f' it is 20% and for 'u' it is 30%.



public static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] shirts,double price):



This method will take array of Shirt objects and price value.

The method will return array of Shirt objects with more than specified price in ascending order of price.



Main method already has Scanner code to read values, create objects and test above methods.


Main method reads values for five Shirt objects, followed by price.

Price will be input for method getShirtWithMoreThanSpecificPrice.


You can consider below sample input and output to verify your implementation before submitting in Hackerrank.

Sample input:

1
arrow
500
m
2
bare
600
f
3
arrow
400
m
4
bare
300
m
5
arrow
1000
u
500



Sample output:

450.0
480.0
360.0
270.0
700.0
2 600.0 bare
5 1000.0 arrow

 */

package Hands_on;
import java.util.*;
public class Java_Arrays_handsOn3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Shirt[] shirt=new Shirt[n];
        for(int i=0;i<n;i++) {
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            double c=sc.nextDouble();
            sc.nextLine();
            char d=sc.nextLine().charAt(0);
            shirt[i]=new Shirt(a,b,c,d);
        }
        double price=sc.nextDouble();
        for(Shirt discount:shirt) {
            System.out.println(getDiscountPrice(discount));
        }
//		double discount=getDiscountPrice(shirt);
        Shirt[] ans=getShirtWithMoreThanSpecificPrice(shirt,price);
        for(Shirt s:ans) {
            System.out.println(s);
        }
    }
    public static double getDiscountPrice(Shirt shirt) {
        double ans=0;
//		for(int i=0;i<4;i++) {
        if(shirt.getGender()=='m') {
            ans=(1-0.1)*(shirt.getPrice());
        }else if(shirt.getGender()=='f') {
            ans=(1-0.2)*(shirt.getPrice());
        }else if(shirt.getGender()=='u') {
            ans=(1-0.3)*(shirt.getPrice());
        }
//		}
        return ans;
    }
    public static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] shirt,double price) {
        int cnt=0;
        List<Shirt>ans=new ArrayList<>();
        for(int i=0;i<shirt.length;i++) {
            if(shirt[i].getPrice()>price) {
                ans.add(shirt[i]);
            }
        }
        ans.sort((a,b)->Double.compare(a.getPrice(), b.getPrice()));
//		Shirt[] ans=new Shirt[cnt];

        return ans.toArray(new Shirt[0]);
    }
}
class Shirt{
    int tag;
    String brand;
    double price;
    char gender;
    Shirt(int tag,String brand,double price,char gender){
        this.tag=tag;
        this.brand=brand;
        this.price=price;
        this.gender=gender;
    }
    public void setTag(int tag) {
        this.tag=tag;
    }
    public int getTag() {
        return this.tag;
    }

    public void setBrand(String brand) {
        this.brand=brand;
    }
    public String getBrand() {
        return this.brand;
    }

    public void setPrice(double price) {
        this.price=price;
    }
    public double getPrice() {
        return this.price;
    }

    public void setGender(char gender) {
        this.gender=gender;
    }
    public char getGender() {
        return this.gender;
    }
    @Override
    public String toString() {
        return tag+" "+price+" "+brand;
    }
}