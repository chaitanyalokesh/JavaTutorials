package day6;

public class SingleDimArray {
	
/*
* single dimensional array ---------- 
	 * 1) Declare an array 
	 * 2) insert values into array 
	 * 3) Find size of an array 
	 * 4) read single value from an array 
	 * 5) read multiple values from an array */
	

	public static void main(String[] args) {

// 1) Declare single dimensional array
	
	//Approach 1
		
	int a[]= new int[5];  //declaration
		
		a[0]=100;    //insert values
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
	//Approach 2
		
		int b[]= {100,200,300,400,500};
		
//3) Find size of an array 
		
		System.out.println(a.length);  //5
		System.out.println("---------");


// 4) read single value from an array 
		
		System.out.println(a[4]); //500
		System.out.println("---------");
		
// 5) read multiple values from an array 
		
	//for loop
		System.out.println("using for loop");

		
		for(int i=0;i<a.length;i++)      //i<a.length or i<=a.length-1
		{
		System.out.println(a[i]);	
		}
		System.out.println("---------");

	//for each loop/enhanced for loop
		
		System.out.println("using for each loop");

		for(int e:a)
		{
			System.out.println(e);
		}
	
	}

}
