
//Program to find greatest of 3 numbers
import java.util.Scanner;

class P3
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1 ");
		int a =sc.nextInt();
		System.out.println("Enter number 2 ");
		int b =sc.nextInt();
		System.out.println("Enter number 3 ");
		int c =sc.nextInt();
		int greater=0;
		if (a>b)
		greater =a;
		else 
		greater=b;
		if (c>greater)
		greater =c;
		System.out.println("Greater of the 3 is "+ " "+greater);
		
	}
}