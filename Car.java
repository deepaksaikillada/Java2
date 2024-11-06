package LinkedIn_TCS.Variables_and_datatypes;

import java.awt.*;  // Importing AWT library for Color class
public class Car {
/*    """There are a few issues with your Java code that need to be addressed to make it functional:

Class Name Convention: By convention, class names in Java should start with an uppercase letter. It would be better to rename the class constructor to Car or any other meaningful name related to what the class represents.

Scope of Constructor: The constructor is defined inside the main method, which is not allowed. Constructors should be defined inside the class but outside any methods.

Initializing Variables: You need to initialize instance variables within the constructor using the parameters provided.

Visibility of Instance Variables: You should declare instance variables outside the constructor but inside the class, so they are accessible in both the constructor and any other methods in the class.

Boolean Type: The Boolean type should be boolean unless you have a specific reason to use the Boolean wrapper class.

Here's a corrected version of the code:
"""
*/
        //attributes;//describing the class properties
        public double avgMassPerGallon;
        public String licencePlate;
        public Color paintColor;   //import awt library;
        public boolean areTailingLightsWorking;

//        constructor for creating a car object;    (function with same name as class called)-> CONSTRUCTOR
        public Car(
                double inputAvgMassPerGallon,
                String inputLicencePlate,
                Color inputPaintColor,
                Boolean inputAreTailingLightsWorking){
        //inorder to create this car using this (function with same name as class called) constructor
            // we need to set the values of car properties using (this {pointer / keyword})

            // Set the values of car properties using 'this' keyword
            this.avgMassPerGallon=inputAvgMassPerGallon;
            this.licencePlate=inputLicencePlate;
            this.paintColor=inputPaintColor;
            this.areTailingLightsWorking=inputAreTailingLightsWorking;
            }

            public void changePaintColor(Color newpaintColor){
                this.paintColor=newpaintColor;
            }

    public static void main(String[] args){
            Color color=Color.RED;
            Car mycar=new Car(31.14,"ABC123",color,true);
        System.out.println("Car Licence Plate: "+mycar.licencePlate);
        System.out.println("Car Color: "+mycar.paintColor);
        System.out.println("Car Average Mass Per Gallon: "+mycar.avgMassPerGallon);
        System.out.println("Are Tailing Lights Working ? : "+mycar.areTailingLightsWorking);
    }
}
