
//Program to find if a character is vowel or consonant
import java.util.Scanner;

class P5
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character ");
		char ch = sc.next().toLowerCase().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		 {
                System.out.println(ch + " is a vowel.");
            	}	
		else
		 System.out.println(ch + " is a consonant.");

	}
}