package interview_questions_practice;
import java.util.*;
import java.lang.*;
import java.math.*;
public class Browser {
    // Stores the current
// visiting page
    static String curr_state_url="";
    // Stores url when pressed forward
    static Stack<String>forward_Stack=new Stack<>();
    // Stores url when pressed backward
    static Stack<String>backward_Stack=new Stack<>();

    // Function for when visit a url
    static void visit_new_url(String url){
        // If current URL is empty
        if(curr_state_url!=""){ //if current url is not empty then
            // Push into backward_stack
            backward_Stack.add(curr_state_url);
        }
        // Set curr_state_url to url
        curr_state_url=url;
    }



    // Function to handle state
// when the forward button
// is pressed
    public static void forward(){
        // If current url is the last url (or) means if empty forward stack
        if(forward_Stack.isEmpty() || curr_state_url==forward_Stack.peek()){
            System.out.println("Not Available");
            return;
        }else{// Otherwise
            // Push current state to the
            // backward stack
            backward_Stack.add(curr_state_url);
            // Set current state to top
            // of forward stack
            curr_state_url=forward_Stack.peek();
            // Remove from forward
            // stack
            forward_Stack.pop();
        }

    }

    // Function to handle state
// when the backward button
// is pressed
    public static void backward(){
        // If current url is the
        // last url
        if( backward_Stack.isEmpty() ||curr_state_url==backward_Stack.peek()){
            System.out.println("Not Available");
            return;
        }else{  // Otherwise
            // Push current url to the
            // forward stack
            forward_Stack.add(curr_state_url);
            // Set current url to top
            // of backward stack
            curr_state_url=backward_Stack.peek();
            // Pop it from backward
            // stack
            backward_Stack.pop();

        }
    }

    //simulating function or working function of forward and backward buttons

    // Function that performs the
// process of pressing forward
// and backward button in a
// Browser
    public static void simulatorFunction(){
        // Current URL
        String url="ajay.com";
        // Visit the current URL
        visit_new_url(url);
        // Print the current URL
        System.out.println("Current URL is: " +
                curr_state_url +
                " \n");

        //  // New current URL
        url="abc.com";
        // Visit the current URL
        visit_new_url(url);
        // Print the current URL
        System.out.println("Current URL is: " +
                curr_state_url +
                " \n");
        // Pressed backward button
        backward();
        // Print the current URL
        System.out.println("Current URL after pressing" +
                " Backward button is: " +
                curr_state_url + " \n");

        // Pressed forward button
        forward();

        // Print the current URL
        System.out.println("Current URL after pressing" +
                " Forward button is: " +
                curr_state_url + " \n");

        // New current URL
        url = "nikhil.com";

        // Visit the current URL
        visit_new_url(url);

        // Print the current URL
        System.out.println("Current URL is: " +
                curr_state_url +
                " \n");

        // Pressed forward button
        forward();

        // Print the current URL
        System.out.println("Current URL after pressing" +
                " Forward button is: " +
                curr_state_url + " \n");
        // Pressed backward button
        backward();

        // Print the current URL
        System.out.println("Current URL after pressing" +
                " Backward button is: " +
                curr_state_url + " \n");
    }

    public static void main(String[] args){
        // Function to simulate process of
        // pressing forward & backward button
        simulatorFunction();
    }

}


//package interview_questions_practice;//package interview_questions_practice;

//public class Implementing_Backward_and_Forward_buttons_of_Browser {
//    public static void main(String[] args){
//    }
//}
