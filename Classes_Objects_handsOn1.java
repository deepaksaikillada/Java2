/*
3
4
6
8
output:- 5.000
 */
/*
2
3
4
5
output:- 2.828
 */

package Hands_on;
import java.util.Scanner;
import java.lang.Math;
public class Classes_Objects_handsOn1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Point p1=new Point(sc.nextInt(),sc.nextInt());
        Point p2=new Point(sc.nextInt(),sc.nextInt());
        double ans=findDistance(p1,p2);
        System.out.printf("%.3f",ans);
    }
    public static double findDistance(Point p1,Point p2){
        double dist=Math.sqrt((p2.getX()-p1.getX())*(p2.x-p1.x)+(p2.getY()-p1.getY())*(p2.y-p1.y));
        double dist2=Math.hypot(p2.x-p1.x,p2.y-p1.y);
//        return dist;
        return dist2;
    }
}
class Point{
    int x;
    int y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}