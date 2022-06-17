package day2;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {

		//int a=10, b=20;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number:");
			int a= sc.nextInt();
		
		System.out.println("Enter seccond Number:");
			int b= sc.nextInt();
			
	System.out.println("sum of two numbers is "+(a+b));

			
		System.out.println("Enter your name:");
			String name = sc.next();
			
				
		System.out.println("your name is "+name);
		
		
		
		
		
	}

}
