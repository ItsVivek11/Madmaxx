package com.viv;

public class Factorial {
	public static void main(String[] args) {
		int n=6;
		int factorial=calculateFactorial(n);
		System.out.println("Factorial of "+n+" is : "+factorial);
	}
	public static int calculateFactorial(int n)
	{
		if(n==0)
		{
			return 0;
		}
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
		
	}

}
