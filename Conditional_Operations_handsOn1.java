//Compare 2D points for distance from origin
//Write a program to check distance of 2D points from origin and print the point with highest distance.
    /*
    Q2. Compare 2D points for distance from origin
Write a program to check distance of 2D points from origin and print the point with highest distance.

Create class Point with attributes as below:

double x
double y
In Solution class, define main method to read values for three point objects.
Next, create below method in Solution class which will take three point objects as input parameters and return the point with highest distance from origin

public static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3)


Consider sample input as below to read values for six point objects

2
2
3
3
-4
-4


Output:
-4.0
-4.0
     */

package Hands_on;
import java.util.Scanner;
import java.lang.Math;
public class Conditional_Operations_handsOn1{
    public static void main(String[] args){
//        double x1,x2,x3,y1,y2,y3;
        Scanner sc=new Scanner(System.in);

        Point1 p1=new Point1(sc.nextDouble(),sc.nextDouble());
        Point1 p2=new Point1(sc.nextDouble(),sc.nextDouble());
        Point1 p3=new Point1(sc.nextDouble(),sc.nextDouble());
        Point1 ans=pointWithHighestOriginDistance(p1,p2,p3);
        System.out.printf("%.1f\n",ans.x);
//        System.out.println();
        System.out.println(ans.y);
    }
    public static Point1 pointWithHighestOriginDistance(Point1 p1,Point1 p2,Point1 p3){
//        double dist1=Math.sqrt(p1.getX()*p1.x+p1.getY()*p1.y);
        double dis1=p1.distfromOrigin();
//        double dist2=Math.sqrt(p2.x*p2.x+p2.y*p2.y);
        double dis2=p2.distfromOrigin();
//        double dist3=Math.sqrt(p3.x*p3.x+p3.y*p3.y);
        double dis3=p3.distfromOrigin();
//        double dist=Math.max(dist1,Math.max(dist2,dist3));
//        if(dist1==dist){
//            return p1;
//        }else if(dist2==dist){
//            return p2;
//        }else{
//            return p3;
//        }
        return dis1>dis2?(dis1>dis3?p1:p3):(dis2>dis3?p2:p3);
//        return dist1>dist2?(dist1>dist3?p1:p3):(dist2>dist3?p2:p3);
    }
}
class Point1{
    double x;
    double y;
    Point1(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double distfromOrigin(){
        return Math.sqrt(x*x+y*y);
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

