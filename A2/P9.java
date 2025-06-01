
//Program to check if user is eligible to vote 
import java.util.Scanner;

class P9
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age= sc.nextInt();
		if (age>=18)
		{System.out.println("Eligible to vote");
		 }else 
		System.out.println("Not eligible");

		
		

		
	}
}