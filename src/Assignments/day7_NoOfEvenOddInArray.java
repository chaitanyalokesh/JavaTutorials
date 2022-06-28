package Assignments;

public class day7_NoOfEvenOddInArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6};
		int even_count=0;
		int odd_count=0;
		
		for(int i=0;i<a.length;i++)
			
		while(a[i]>0)
		{
			int rem=a[i]%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			a[i]=a[i]/10;
		}
		System.out.println("Number of Even numbers:"+even_count);
		System.out.println("Number of Even numbers:"+odd_count);

	}

}
