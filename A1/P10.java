
//Program to calculate area of a  triangle 

import java.util.Scanner;

class P10
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		int[]b= new int[3];
		for(int i=0;i<5;i++)
	
		
		{int total=0;
		 double average=0;
		System.out.println("##Enter the marks of Student ### " +(i+1));
			for (int j=0;j<3;j++)
			{System.out.println("##Enter the marks of Student " +(i+1)+"for Subject"+(j+1));
			 b[j]=sc.nextInt();
			total+=b[j];
			average=total/3;
		
		          }
		System.out.println("##Total marks of Student " +(i+1)+"is"+total);
		System.out.println("##Average marks of Student " +(i+1)+"is"+average);

		}

		
	}
}