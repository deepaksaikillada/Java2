//types of exceptional handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class exceptional_handling {
    public static void main(String[] args) {

        //1. Arithmetic Exception
        try {
            int a = 5;
            int b = 0;
            System.out.println(a / b); //error occurs because we can't divide with zero;
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

        //2. Null Pointer Exception
        try{
            String str=null;
            System.out.println(str.charAt(0));
//            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception..");
        }

        //3. String Index Out Of Bounds Exception
        try{
            String str="Hi hello deepak";
            System.out.println(str.charAt(9));
            System.out.println(str.charAt(24));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String Index Out Of Bounds Exception..");
        }

        //4. File Not Found Exception
        try{
            File file1=new File("D:\\MYfirstCode\\src\\_1.java");
            FileReader fr1=new FileReader(file1);
            File file11=new File("D:/MYfirstCode/src/_1.java");
            FileReader fr11=new FileReader(file11);
            File file2=new File("D:/MYfirstCode/src/LinkedIn_TCS/helloWorld.java");
            FileReader fr2=new FileReader(file2);
            File file3=new File("E://file.txt");
            FileReader fr3=new FileReader(file3);
        }catch (FileNotFoundException e){
            System.out.println("File Not Exist..");
        }

        //5.Number Format Exception
        try{

            int num2=Integer.parseInt("-1234");
            long num3=Long.parseLong("2147483648"); //out of integer bound
 //    Also, the Integer.parseInt(s) function can only handle integers within the range of -2,147,483,648 to 2,147,483,647.
            System.out.println(num2+" "+ num3);
            int num=Integer.parseInt("Akki");
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("Invalid number..");
        }

        //6. Array Index Out Of Bounds Exception
        try{
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
    }
}


