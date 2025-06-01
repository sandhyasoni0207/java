
//Program to check triangle is eq,iso or sca
import java.util.Scanner;

class P13
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side 1");
		int a = sc.nextInt();
		System.out.println("Enter side 2");
		int b = sc.nextInt();
		System.out.println("Enter side 3");
		int c = sc.nextInt();
	
	       if ((a==b)&& (b==c)&&(c==a))
	     {
              System.out.println("Triangle is equilateral");
              } else
	  if((a==b)||(b==c)||(c==a))

	{	  System.out.println("Triangle is isosceles");
           
	}
	else 
	System.out.println("Scalene");
}
}

    
