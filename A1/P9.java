//Program to add first & last digit of 4 digit number

import java.util.Scanner;

class P9
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a four digit number");
		int a =sc.nextInt();
		if (a<1000 || a >9999)
		{System.out.println("Invalid number ");
		}
		else
		
		{
		int sum1=a/1000;
		int sum2=a%10;
		int sum3=sum1+sum2;
		System.out.println("The sum of the first and last digits of this number  is "+" "+sum3);
		}
	  }
}