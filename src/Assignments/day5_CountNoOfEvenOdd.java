package Assignments;

public class day5_CountNoOfEvenOdd {

	public static void main(String[] args) {

		int num=123456789;
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("Number of Even numbers:"+even_count);
		System.out.println("Number of Even numbers:"+odd_count);

	}

}
