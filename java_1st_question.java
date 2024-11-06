import java.util.Scanner;
public class java_1st_question{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
//        System.out.println(str);
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) >= 'a'  && str.charAt(i) <='z'){
                cnt++;
            }

        }
        if(cnt==0){
            System.out.println("No lower case characters present");
        }else{
            System.out.println(cnt);
        }
    }
}