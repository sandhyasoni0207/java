
//Program to take a number & print day of week
import java.util.Scanner;

class P15
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weekday number ");
		int a = sc.nextInt();
		
		switch(a)
		{
		case 1:
		System.out.println("Monday");
		break;
		case 2 :
		System.out.println("Tuesday");
		break;
		case 3 :
		System.out.println("Wednesday");
		break;
		case 4 :
		System.out.println("Thursday");
		break;
		case 5 :
		System.out.println("Friday");
		break;
		case 6 :
		System.out.println("Saturday");
		break;
		case 7 :
		System.out.println("Sunday");
		break;
		default:
		System.out.println("wrong input");
		}
	}		

}

    
