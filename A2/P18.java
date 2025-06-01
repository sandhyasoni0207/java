
//Program to find a number is positive negative zero using  switch
import java.util.Scanner;

class P18
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1 ");
		int a = sc.nextInt();
	 	int result;
		if (a>0)
		{result=1;}
		else
		if (a<0)
		{result =-1;}
		else
		{result=0;
		}

      	  switch (result) {
            case -1:
                System.out.println("Number is Negative");
                break;
            case 1:
                System.out.println("Number is positive");
                break;
            case 0:
                System.out.println("Number is zero");
                break;
        }


    }		

}

    
