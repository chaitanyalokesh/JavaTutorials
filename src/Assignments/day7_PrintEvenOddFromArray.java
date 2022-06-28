package Assignments;

public class day7_PrintEvenOddFromArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6};
		
		System.out.println("Even Numbers in an array are:");
	
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}*/
		
	//enhanced for each loop

		for(int e:a)
		{
			if(e%2==0)
				System.out.println(e);
		}
		
	
		System.out.println("Odd Numbers in an array are:");
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}*/
		
		//enhanced for each loop

				for(int e:a)
				{
					if(e%2!=0)
						System.out.println(e);

				}
	}

}
