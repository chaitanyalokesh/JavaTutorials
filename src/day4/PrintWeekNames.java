package day4;

import java.util.Scanner;

public class PrintWeekNames {

	public static void main(String[] args) {

		//int weekno=5;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Week Number");
				int weekno = sc.nextInt();
		
		if(weekno==1) 
		{
			System.out.println("Sunday");
		}
		else if (weekno==2)
		{
			System.out.println("Monday");
		}
		else if (weekno==3)
		{
			System.out.println("Tuesday");
		}
		else if (weekno==4)
		{
			System.out.println("Wenesday");
		}
		else if (weekno==5)
		{
			System.out.println("Thrusday");
		}
		else if (weekno==6)
		{
			System.out.println("Friday");
		}
		else if (weekno==7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Invalid week numbe");
		}
	}

}
