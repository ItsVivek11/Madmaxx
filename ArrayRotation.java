package com.viv;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int k=2;
		rotateArrayLeft(arr,k);
		System.out.println("Rotated Array is :"+Arrays.toString(arr));

	}
	public static void rotateArrayLeft(int[] arr,int k)
	{
		int n=arr.length;
		k=k%n;
		reverseArray(arr,0,k-1);//0-1 that is from [1,2,3,4,5]
		reverseArray(arr,k,n-1);//2-4 that is from [2,1,3,4,5]
		reverseArray(arr,0,n-1);//0-4 that is from [2,1,5,4,3]
		                                        //=[3,4,5,1,2]
	}
    public static void reverseArray(int[] arr,int s, int l)
	{
		while(s<l)
		{
			int temp=arr[s];
			arr[s]=arr[l];
			arr[l]=temp;
			s++;
			l--;
		}
	}
}
