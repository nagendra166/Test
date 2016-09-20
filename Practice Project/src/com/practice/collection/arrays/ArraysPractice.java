package com.practice.collection.arrays;

import java.util.Arrays;

public class ArraysPractice {
	
	public static void main(String args[])
	{
		int[] ageList = new int[5];
		for (int i=0;i<5;i++)
		{
			ageList[i]=i+10;
			int sum=0;
			sum=sum+ageList[i];
			System.out.println(sum);
		}
		
		for(int k=0;k<ageList.length;k++)
		{
			System.out.println(ageList[k]);
		}
		
		for(int j : ageList){
			System.out.println(j);
				}
		int a= Arrays.binarySearch(ageList, 13);
		System.out.println(a);
		
	}

}
