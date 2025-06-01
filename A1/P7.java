
//Program to add sum of the digits of a number 

import java.util.Scanner;

class P7
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a four digit number");
		int a =sc.nextInt();
		int sum=0;

		while(a!=0)
		{int digit =a%10;
		 sum+=digit;
		 a=a/10;
		}
		System.out.println("The sum of the digits of this number  is "+" "+sum);
		
	}
}