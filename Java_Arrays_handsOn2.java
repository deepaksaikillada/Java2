//2/ sort books by price
/*
Sort Books by Price

Create class Book with below attributes:

id - int
title - String
author - String
price - double

Write getters, setters and parameterized constructor.

Create class Solution with main method.

Implement static method - sortBooksByPrice in Solution class.
This method will take a parameter as array of Book objects.
It will return array of books which is sorted in ascending order of book price. Assume that no two books will have same price.

This method should be called from main method and display values of returned objects as shared in the sample.

Before calling this method, use Scanner object to read values for four Book objects referring attributes in the above sequence.

Next call the method and display the result.

Consider below sample input and output:

Input:
1
hello
writer1
50
2
cup
writer2
55
3
Planet
writer3
45
4
India
writer4
40
 */
package Hands_on;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Java_Arrays_handsOn2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Book[] book=new Book[4];
        for(int i=0;i<4;i++){
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble();
            sc.nextLine();
            book[i]=new Book(a,b,c,d);
        }
        Book[] arr=sortBooksByPrice(book);
        for(Book it:arr){
            System.out.println(it.id+" "+it.title+" "+it.author+" "+it.price);
        }
    }
    public static Book[] sortBooksByPrice(Book[] book){
        Arrays.sort(book,(a,b)->Double.compare(a.price,b.price));
        return book;

//        int n=book.length;
//        List<Book>ans=new ArrayList<>();
//        for(int i=0;i<n;i++){
//            ans.add(book[i]);
//        }
//        ans.sort((a,b)->Double.compare(a.price,b.price));
//        return ans.toArray(new Book[0]);
    }
}
class Book{
    int id;
    String title;
    String author;
    double price;
    Book(int id,String title,String author,double price){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }
}
/*
public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Books[] books=new Books[n];
        for(int i=0;i<n;i++) {
            int id=sc.nextInt();
            sc.nextLine();
            String title=sc.nextLine();
            String author=sc.nextLine();
            double price=sc.nextDouble();
            sc.nextLine();
            books[i]=new Books(id,title,author,price);
        }
        Books[] ans=sortBooksByPrice(books);
        for(Books book:ans) {
            System.out.println(book);
        }
    }
    public static Books[] sortBooksByPrice(Books[] books) {
//		Books[] fin=new Books[4];
//		Arrays.sort(books,(a,b)->a.getPrice()-b.getPrice()); //Type mismatch: cannot convert from double to int
        Arrays.sort(books,(a,b)->Double.compare(a.getPrice(), b.getPrice()));
        return books;
    }

class Books{
    int id;
    String title;
    String author;
    double price;
    Books(int id,String title, String author, double price){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void setId(int id) {
        this.id=id;
    }
    public int getId() {
        return this.id;
    }

    public void setTitle(String title) {
        this.title=title;
    }
    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author=author;
    }
    public String getAuthor() {
        return this.author;
    }

    public void setPrice(double price) {
        this.price=price;
    }
    public double getPrice() {
        return this.price;
    }
    @Override
    public String toString() {
        return id+" "+title+" "+author+" "+price;
    }
}
 */