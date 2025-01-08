package practisePgrms;

import java.util.Scanner;

public class FibanocciNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int maxNum=sc.nextInt();
		int num1=0;
		int num2=1;
		//System.out.println(num1+" "+num2);
		for(int i=1;i<=maxNum;i++)
		{
			System.out.print(num1+" ");
			int sum=num1+num2;
			num1=num2;
			num2=sum;
		}
		
	}

}
