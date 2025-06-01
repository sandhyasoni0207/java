
//Program to find greatest of 3 numbers 
import java.util.Scanner;

class P4
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
		int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println("Greater of the 3 is "+ " "+largest);
		
	}
}