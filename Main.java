package LinkedIn_TCS.Variables_and_datatypes;

import java.awt.*;          //importing awt library for color class
import java.util.Scanner;   //importing util library for scanner class for getting input from user;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Deepak");
        System.out.println();

        Car myCar=new Car(25.5,"1BC32E",Color.BLUE,true);

//Data type(Car) Variable(my car) = new Constructor with properties(Car(input avg mpg,input licence,input color,input tailing lights))

        Car sallyCar=new Car(13.9,"3D20BN",Color.BLACK,false);

        System.out.println("myCar's Licence Plate: "+myCar.licencePlate);
        System.out.println("myCar's Color: "+myCar.paintColor);
        System.out.println("myCar's Average Mass Per Gallon: "+myCar.avgMassPerGallon);
        System.out.println("Are myCar's Tailing Lights Working ? : "+myCar.areTailingLightsWorking);

        System.out.println();

        System.out.println("sallyCar's Licence Plate: "+sallyCar.licencePlate);
        System.out.println("sallyCar's Color: "+sallyCar.paintColor);
        System.out.println("sallyCar's Average Mass Per Gallon: "+sallyCar.avgMassPerGallon);
        System.out.println("Are sallyCar's Tailing Lights Working ? : "+sallyCar.areTailingLightsWorking);

        System.out.println();
        //we are creating our own method/function for changing the paint color
        //there is inbuilt method println

        System.out.println(myCar.paintColor);
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor);
        System.out.println(myCar.paintColor.toString());

        System.out.println();
        //

        //
        //Strings
        //String :- 1. A string is continuation of list of characters;
        //          2. strings are immutable (means if once created we can't change the content of the string after created);
        //          3. A single character is called Char;
        String userInput="entertainment";
        String upperCased=userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(upperCased);
        char secondCharacter=userInput.charAt(1);
        System.out.println(secondCharacter);
        System.out.println(userInput.charAt(0));
        System.out.println("Contains Enter: "+userInput.contains("Enter"));
        //contains(inbuilt method) means if the userInput contains this substring then return true other false;
        System.out.println("Contains Enter: "+userInput.contains("Enter".toUpperCase()));
        System.out.println("Contains enter: "+userInput.contains("Enter".toLowerCase()));
        System.out.println("Contains Enter: "+userInput.contains("enter"));

        //
        //
        //we are using the Scanner for input

        //now after importing util library for Scanner class
        //we are going to have the access for the Scanner class
        //so we are going to create instance of Scanner class sc(variable for storing it) by using constructor Scanner inbuilt;
        System.out.println("Enter a word: "); //because here sc.next() only going to get the first word we see until the space comes.
                                              // sc.nextLine() will take the group of words (or)string until the next line;
        Scanner sc=new Scanner(System.in);

        //here System.in taking input from user so for the scanner constructor so, the scanner knows where to look for the input;

        //String userInput2=sc.next();
        userInput=sc.next();
        String uppercased=userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);
        char secondcharacter=userInput.charAt(1);
        System.out.println(secondcharacter);
        System.out.println(userInput.charAt(0));
        System.out.println("Contains Enter: "+userInput.contains("Enter"));
        //contains(inbuilt method) means if the userInput contains this substring then return true other false;
        System.out.println("Contains Enter: "+userInput.contains("Enter".toUpperCase()));
        System.out.println("Contains enter: "+userInput.contains("Enter".toLowerCase()));
        System.out.println("Contains Enter: "+userInput.contains("enter"));

        //
        //scanner class can also use integer and double inputs
        //for reading/getting those inputs;
        System.out.println("Enter a number: ");
        Scanner sc1=new Scanner(System.in);
        int userNumber=sc1.nextInt();
        System.out.println(userNumber);

        System.out.println("Enter a decimal number(double): ");
        Scanner sc2=new Scanner(System.in);
        double userDouble=sc2.nextDouble();
        System.out.println(userDouble);
    }
}
