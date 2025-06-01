
//Program to input marks of 5 subjects & pprint grade
import java.util.Scanner;

class P7
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		int []b=new int[5];
		for(int i=0;i<5;i++)
	
		{int total=0;
		System.out.println("##Enter the marks of SUBJECT ### " +(i+1));
			{b[i]=sc.nextInt();
			total+=b[i];
		        }
		}
		System.out.println("##Total marks of Student"+total);
	 if (total >= 90) {
           System.out.println("##Grade is A");

        } else if (total >= 80) {
             System.out.println("##Grade is B");
        } else if (total >= 70) {
          System.out.println("##Grade is C");
        } else if (total >= 60) {
             System.out.println("##Grade is D");
        } else {
             System.out.println("##Grade is F");
        }

		
	}
}