package Assignments;

public class day4_SmallestOf3no {

	public static void main(String[] args) {

		int a=10, b=200,c=3;
		
		if(a<b && a<c)
		{
			System.out.println("Smallest no is:"+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("Smallest no is:"+b);

		}
		else
		{
			System.out.println("Smallest no is:"+c);

		}
	}

}
