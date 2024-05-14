package com.viv;

public class Palindrome {

	public static void main(String[] args) {
		String str= "radar";
		boolean isPalindrome=checkPalindrome(str);
		System.out.println("Is "+str+" a Palindrome? "+ isPalindrome);
	}
	public static boolean checkPalindrome(String str)
	{
		int l=str.length();
		String revstr="";
		for ( int i = l - 1; i >= 0; i-- )  
	         revstr += str.charAt(i);  
	      if (str.equals(revstr))  
	         return true; 
	      else  
	         return false;

	}

}
