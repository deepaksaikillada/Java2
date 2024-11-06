import java.util.Scanner;
public class _3{
    public static void main(String[] args){
        //maximum of 3 numbers
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();

        int maxi=Integer.MIN_VALUE;

        //
        System.out.println("Maximum of 3 numbers: "+Math.max(x,Math.max(y,z)));
    }
}