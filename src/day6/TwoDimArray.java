package day6;

public class TwoDimArray {
	
/*  1) Declare an array
	2) insert values into array
	3) Find size of an array
	4) read single value from an array
	5) read multiple values from an array */


	public static void main(String[] args) {

//  1) Declare an array
		
		//Approach 1
	  
		int a[][]=new int [3][2];  //declaration
		
		//int []a[]=new int [3][2];
		//int[][]a=new int[3][2];
		
//2) insert values into array
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		//Approach 2
		
		int b[][]= {{100,200},{300,400},{500,600}};
		
// 3) Find size of an array
		
//number of rows & columns
		
		System.out.println("number of rows:"+a.length);
		System.out.println("number of columns:"+a[0].length);
		System.out.println("----------");

				
//4) read specific/single value from an array
		
		System.out.println(a[0][1]);
		System.out.println("----------");

//5) read multiple values from an array
 
	//for loop
		
		System.out.println("extract all values using for loop");
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.println(a[r][c]);
			}
		}
		System.out.println("----------");

	//for each loop

		System.out.println("extract all values using for each loop");
		
		for(int x[]:a)
		{
			for(int v:x)
			{
				System.out.println(v);
			}
		}
	}

}
