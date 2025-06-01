
//Program to calculate area of a  triangle 

import java.util.Scanner;

class P8
{
	public static void main(String...k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("##Program to Print ARea of a Triangle ### ");
		System.out.println("Enter base of triangle ");
		double b =sc.nextDouble();
		System.out.println("Enter height of triangle ");
		double h =sc.nextDouble();
		double area=0;
		area =0.5*b*h;
		System.out.println("The area of the triangle   is "+" "+area);
		
	}
}