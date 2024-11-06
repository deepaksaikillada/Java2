    //1. find docs with odd pages and print by sorting with help of id
/*
Find Docs with Odd Pages
Create class Document with below attributes
id - int
title - String
folderName - String
pages - int
Write getters, setters and parameterized constructor as required.
Create class Solution with main method.
Implement static method - docsWithOddPages in Solution class.
This method will take array of Document objects and return another array with Document objects which has odd number of pages.
This method should be called from main method and display values of returned objects as shared in the sample (in ascending order of id attribute).
Before calling this method, use Scanner object to read values for four Document objects referring attributes in the above sequence.
Next call the method and display the result.
Consider below sample input and output:

Input:
1
resume
personal
50
2
question1
exams
55
3
question2
exams
45
4
India
misc
40


Output (each line has values separated by single space):
2 question1 exams 55
3 question2 exams 45
 */
package Hands_on;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Vector;
import java.util.Collections;
public class Java_Arrays_handsOn1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Document[] doc=new Document[4];
        for(int i=0;i<4;i++){
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();
            sc.nextLine();
            doc[i]=new Document(a,b,c,d);
        }
        Document[] ans=docsWithOddPages(doc);
        for(Document it:ans){
            System.out.println(it.id+" "+it.title+" "+it.folderName+" "+it.pages);
        }
    }
    public static Document[] docsWithOddPages(Document[] doc){
        int n=doc.length;
//        Document[] ans=new Document[0];
        Vector<Document>ans=new Vector<>();
        for(int i=0;i<n;i++){
            if(doc[i].pages%2!=0){
                ans.add(doc[i]);
//                ans=Arrays.copyOf(ans,ans.length+1);
//                ans[ans.length-1]=doc[i];
            }
        }
        Collections.sort(ans,(a,b)->Integer.compare(a.id,b.id));
//        Arrays.sort(ans,(a,b)->a.id-b.id);
//        Arrays.sort(ans,(a,b)->Integer.compare(a.id,b.id));


        return ans.toArray(new Document[0]);
//        return ans;
    }
}
class Document{
    int id;
    String title;
    String folderName;
    int pages;
    Document(int a,String b,String c,int d){
        this.id=a;
        this.title=b;
        this.folderName=c;
        this.pages=d;
    }
}