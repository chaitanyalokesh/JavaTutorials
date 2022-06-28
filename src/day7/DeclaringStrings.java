package day7;

public class DeclaringStrings {

	public static void main(String[] args) {

	//	String s="welcome";
	//	String s=new String("welcome");
		

	//Scenerio 1
		System.out.println("string comparision");
		String s1 = "welcome";  
		String s2 = "welcome";  
		System.out.println(s1==s2);   //true
		System.out.println(s1.equals(s2));  //true
		System.out.println("------------");
		
	//Scenerio 2
		
		System.out.println("string object comparision");

				String s3 = new String("welcome");
				String s4 = new String("welcome");
				System.out.println(s3==s4);         //false  //== compares the objects
				System.out.println(s3.equals(s4));  //true  // equals compare value
				System.out.println("------------");

	//Scenerio 3
				
			System.out.println("string & object comparision");

			String x1="abc"; //value
			String x2=new String("abc");  //object
			String x3=x2;  //object
			
			System.out.println(x1==x2);         //false  //== compares the objects
			System.out.println(x1.equals(x2));  //true  // equals compare value
			System.out.println("------------");

			
			System.out.println(x2==x3);         //true  //== compares the objects
			System.out.println(x2.equals(x3));  //true  // equals compare value
			
			
		
			
			
			
				
			
		
		

		
		
		
		

		
		
		
		
		
		
		
	}

}
