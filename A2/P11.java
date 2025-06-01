
//Program to check if any input is alphabet or digit or special character
import java.util.Scanner;

class P11
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Give an input");
		char ch = sc.next().charAt(0);
	       if (Character.isLetter(ch)) {
              System.out.println("It is a letter.");
              } else if (Character.isDigit(ch)) {
            System.out.println("It is a digit.");
            } else {
            System.out.println("It is a special character.");
        }
}
}
    
