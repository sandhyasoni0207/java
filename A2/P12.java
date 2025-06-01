
//Program to check triangle can be formed
import java.util.Scanner;

class P12
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter angle 1");
		int a = sc.nextInt();
		System.out.println("Enter angle 2");
		int b = sc.nextInt();
		System.out.println("Enter angle 3");
		int c = sc.nextInt();
		int d =a+b+c;
	       if (d==180)
	     {
              System.out.println("Triangle can be made");
              } else 
	  System.out.println("Trianngle cannot be made");
           
}
}
    
