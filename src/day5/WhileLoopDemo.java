package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {

		//1 2 ...10
		
/* Ex:1
		int i=1;  //Initialization
		
		while (i<=10)  //condition
		{
			System.out.println(i);
			i++;     //incrementation
		} */
/* Ex:2

		int i=1;  //Initialization
		
		while (i<=10)  //condition
		{
			System.out.println("Hello");
			i++;     //incrementation
		}  */
		
// Ex:3 print even no from 1 to 10
	
			int i=1;
			
			while(i<=10)
			{
				if(i%2==0)
				{
				System.out.println(i);
			}
				i++;
			}
		System.out.println("------------");
			
//Ex: 4  print Odd no from 1 to 10
	
			int a=1;
			
			while(a<=10)
			{
				if(a%2!=0)
				{
				System.out.println(a);
			}
				a++;
			}
		System.out.println("------------");

//Ex:5

		int b=10;  //Initialization
		
		while (b>=1)  //condition
		{
			System.out.println(b);
			b--;     //incrementation
		}  
		

}
}
