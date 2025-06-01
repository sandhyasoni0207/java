
//Program to take 2 number & operator & do the operation
import java.util.Scanner;

class P14
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		System.out.println("Enter operator");
		char ch = sc.next().charAt(0);
		
		switch(getCharType(ch))
		{
		case '+':
		System.out.println(a+b);
		break;
		case'-' :
		System.out.println(a-b);
		break;
		default:
		System.out.println("wrong input");
		}
	}		

}

    
