package Assignments;

public class day7_sumOfElementsInArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		
		int sum=0;
	
//using for loop
		
	/*for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}*/
		
	//enhanced for loop
		
	for(int e:a)
	{
		sum=sum+e;
	}
		
		System.out.println("sum of array elements:" +sum);
	}

}
