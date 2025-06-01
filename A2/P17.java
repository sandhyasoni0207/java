
//Program to find max of 2 number using switch
import java.util.Scanner;

class P17
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1 ");
		int a = sc.nextInt();
		System.out.println("Enter number 2 ");
		int b = sc.nextInt();
	 	int result = Integer.compare(a, b); // Returns -1, 0, or 1

      	  switch (result) {
            case 1:
                System.out.println("Maximum is: " + a);
                break;
            case -1:
                System.out.println("Maximum is: " + b);
                break;
            case 0:
                System.out.println("Both numbers are equal.");
                break;
        }


    }		

}

    
