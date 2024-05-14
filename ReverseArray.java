package com.viv;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		reverseArray(arr);
		System.out.println("Reversed Array : " + Arrays.toString(arr));

	}
	    public static void reverseArray(int[] arr)
	{
//		
//		int l=arr.length;
//		int[] revarr=new int[l];
//		for(int i=l-1;i>=0;i--)
//		{
//			revarr[i]= arr[l-i-1];		
//		}
//		System.out.println("Reversed Array : " +revarr);
		int s=0;
		int l=arr.length-1; //l=4
		while(s<l)//0<4,,1<3,,
		{
			int temp=arr[s];//1,,2
			arr[s]=arr[l];//[5,2,3,4,5],,[5,4,3,4,1]
			arr[l]=temp;//[5,2,3,4,1],,[5,4,3,2,1]
			s++;//1,,2
			l--;//3,,2
		}
		
	}

}
