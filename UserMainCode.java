//package cognizant;
//import java.util.*;
//import java.io.*;
//
//public class UserMainCode {
//    public String colorSandwich(String input1){
//
//        // Read only region end
//
//        // Write code here...
//        StringBuilder result = new StringBuilder();
//
//        int i = 0;
//        int n = input1.length();
//
//
//        while (i < n) {
//
//            char bread = input1.charAt(i);
//            int j = i + 1;
//
//
//            while (j < n && input1.charAt(j) != bread) {
//                j++;
//            }
//
//
//            if (j < n) {
//                result.append(bread);
//            }
//
//
//            i = j + 1;
//        }
//
//        return result.toString();
//
//
//
//
////        String ans="";
////        int n=input1.length();
////        char ch=input1.charAt(0);
////        for(int i=1;i<n;i++){
////            if(input1.charAt(i)==ch){
////                ans+=ch;
////                if(i<n-1){
////                    ch=input1.charAt(i+1);
////                }
////            }
////        }
////        System.out.println(ans);
//
//
//
//
//
//
//        // StringBuilder is more efficient for string concatenation in loops
//        StringBuilder ans = new StringBuilder();
//        int n = input1.length();
//
//        if (n == 0) {
//            throw new UnsupportedOperationException("Input cannot be empty.");
//        }
//
//        char ch = input1.charAt(0); // Initial bread
//
//        // Loop to find sandwiches
//        for(int i = 1; i < n; i++){
//            if(input1.charAt(i) == ch){
//                // Add the bread to result
//                ans.append(ch);
//                if(i < n - 1){
//                    // Update to the next potential bread
//                    ch = input1.charAt(i + 1);
//                }
//            }
//        }
//
//        // Return the final string of breads used
//        return ans.toString();
//        throw new UnsupportedOperationException("colorSandwich(String input1)");
//    }
//}
