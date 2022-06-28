package day7;

public class SearchingElementinArray {

	public static void main(String[] args) {

		//int a[]= {100,50,30,20,10,75,30};
		//int num=20;

		
		String a[]= {"welcome", "java", "automation"};
		String s="chaitu";
		
		boolean status = false;
		
	/* for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		} */
		
		
		for(String x:a)
		{
			if(x==s)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		
		if( status==false)
		{
			System.out.println("Element not found");
	}
		System.out.println("--------------");

		
		
		
		
		
}
}
