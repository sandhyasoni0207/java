
//Program to check if a year is leap or not
import java.util.Scanner;

class P8
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");s
		int y= sc.nextInt();
		if ((y%4==0 && y%100!=0)||(y%400==0))
		{System.out.println("Leap year");
		 }else 
		System.out.println("Not a leap year");

		
		

		
	}
}