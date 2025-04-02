package com.org.qspiders.seleniumpractise.samplePgrms;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length Of Array");
		int arrLen=sc.nextInt();
		int[] intArr=new int[arrLen];
		System.out.println("Enter "+arrLen+" numbers one by one");
		for(int i=0;i<intArr.length;i++)
		{
			intArr[i]=sc.nextInt();
		}

		int temp=0;
		for(int i=0;i<intArr.length;i++)
		{
			if(intArr[i]>=temp)
			{
				temp=intArr[i];
			}
		}
		System.out.println("Biggest Number of Given Array is "+temp);
	}

}
