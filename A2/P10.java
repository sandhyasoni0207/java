
//Program to check if number is single digit , 2 digit or 3 
import java.util.Scanner;

class P10
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		  int absNumber = Math.abs(number);

        // Check the number of digits
        if (absNumber >= 0 && absNumber <= 9) {
            System.out.println(number + " is a single-digit number.");
        } else if (absNumber >= 10 && absNumber <= 99) {
            System.out.println(number + " is a two-digit number.");
        } else if (absNumber >= 100 && absNumber <= 999) {
            System.out.println(number + " is a three-digit number.");
        } else {
            System.out.println(number + " is more than three digits.");
        }		
		

		
	}
}