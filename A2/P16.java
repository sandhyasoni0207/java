
//Program to take a month & find number of days
import java.util.Scanner;

class P16
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of a month ");
		String a = sc.nextLine();
		
		switch(a)
		{
		case "January":
		System.out.println("31");
		break;
		case "Feb" :
		System.out.println("28");
		break;
		case "March" :
		System.out.println("31");
		break;
		case "April" :
		System.out.println("30");
		break;
		case "May" :
		System.out.println("31");
		break;
		case "June" :
		System.out.println("30");
		break;
		case "July":
		System.out.println("31");
		break;
		default:
		System.out.println("wrong input");
		}
	}		

}

    
