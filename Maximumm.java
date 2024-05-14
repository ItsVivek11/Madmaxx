package com.viv;
import java.util.Scanner;
public class Maximumm {

	public static void main(String[] args) {
		int[] arr= {10,9,8,15,3};
		int max=findMax(arr);
		System.out.println("Maximun Element: "+max);
	}
    public static int findMax(int[] arr)
    {
//    	int l=sizeof(arr)/sizeof(arr[0]);
//    	int max=Integer.MIN_VALUE;
    	int max=arr[0];
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]>max)
    		{
    			max=arr[i];
    		}
    	}
		return max;
    	
    }
}
