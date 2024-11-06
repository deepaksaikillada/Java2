package LinkedIn_TCS.Variables_and_datatypes;
//Class:- Blue-print of any object
//Object:- Instance of class;


//in this file we are creating a class called car , here we created a class car which is a blue-print of a car,
// but we don't have a car yet, for that we have to create a constructor

//import java.awt.Color;
//import java.util.*;
import java.awt.*;      //for Color data type, we have to import java library called abstract window toolkit library;
public class Datatypes {
        //attributes/properties :-  describing the properties of class
        //Methods/Functions :- Interacting with Class // how it functions work on

        //Data Types    :-
        //int -> integer (1,2,3 or whole numbers)
        //double -> double (decimal values 34.123, 3.14556677)
        //String -> string ("a1b3" or "Hello World")
        //Color ->  from awt(abstract window toolkit library);
        //boolean -> true or false;
        int AVG;
        double averageMassPerGallon;   //here we use variable name in CAMEL CASE means every word expect the first is capitalised
        //average miles per gallon might not be a whole number or integer, so we have to use double or float

        String licencePlate;    //for licence plate it considers both numbers and characters, so we are using String data type
        //String :- 1. A string is continuation of list of characters;
        //          2. strings are immutable (means if once created we can't change the content of the string after created);
        //          3. A single character is called Char;

        Color paintColor;       //first color was not recognised as a data type, we have to import awt library
        // for paint color, we can use string data type but in java we have inbuilt Color data type

        Boolean areTailLightsWorking; // for are tailing lights working or not there is two options true/false, so we are using Boolean data type;
    public static void main(String[] args) {

    }
}