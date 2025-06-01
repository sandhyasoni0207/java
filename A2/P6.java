
//Program to find if a character is vowel or consonant using switch
import java.util.Scanner;

class P6
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character ");
		char ch = sc.next().toLowerCase().charAt(0);
		switch (ch){
		case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
		System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
                    break;
		}

	}
}