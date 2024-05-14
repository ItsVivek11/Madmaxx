package cscorner;
import java.util.*;   
public class palindrome  
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; 
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter the data to check if it is  palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered data is  palindrome.");  
      else  
         System.out.println("Entered data isn't  palindrome.");   
   }  
}  
	