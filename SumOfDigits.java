package com.viv;

public class SumOfDigits {

	public static void main(String[] args) {
		int number=12345;
		int sum=calculateSumOfDigits(number);
		System.out.println("Sum Of Digits of "+number+" is :"+sum);

	}
	public static int calculateSumOfDigits(int number)
	{
		int total=0;
		while(number!=0)
		{
			int d=number%10;//last digit
			total += d;//addition of digit
			number=number/10;//remaining digit
		}
		return total;
		
	}

}
