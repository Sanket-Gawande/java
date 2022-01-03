import java.util.*;

 // program to reverse string using sting builder object in javq
// normal strings are immutable in almost all programming languages , also are in java
// so string builder function in java allows to change char at specific index of string 
//here is example 

 class string_builder
 {
   public static void main(String args[])
   { 
    System.out.println("Enter a string to reverse");
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    StringBuilder sb = new StringBuilder(line);
   
    int length = line.length();
    for(int i=0;i <= length/2; i++){
      char front = sb.charAt(i);
      char rear = sb.charAt(length - 1 - i);
      System.out.println(front + " " + rear);
      
      sb.setCharAt(i , rear );
      sb.setCharAt(length - 1 - i, front);
     
    }
    System.out.println(sb);
   }
 }
