package day4;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		//int a=700, b=200, c=300;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value");
		int a=sc.nextInt();
		
		System.out.println("Enter b value");
		int b=sc.nextInt();
		
		System.out.println("Enter c value");
		int c=sc.nextInt();
		
		
		if(a>b && a>c)
		{
			System.out.println("a is Largest Number is"+" "+a);
		}
		
		else if (b>a && b>c)
		{
			System.out.println("b is Largest Number"+" "+b);
		}
		
		else
		{
			System.out.println("c is Largest Number"+" "+c);
		}
	}

}
