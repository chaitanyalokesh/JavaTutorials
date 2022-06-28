package day10;

public class StaticExample {
	
	static int a=10;  //static variable
	int b=20;  //Non static variable
	
	
	static void m1() //static method
	{
		System.out.println("this is m1 static method");
	}
	
	void m2()   //Non-static method
	{
		System.out.println("this is m2 Non-static method");

	}
	
	void m() //non-static no restrictions, can access variables and methods directly
	{
	System.out.println(a);
	System.out.println(b);
	m1();
	m2();
	 	
		
	}

	/*public static void main(String[] args) {
  
		//main is static method hence can access static variables and static methods directly without creating object
	
	System.out.println(a); //directly can print static varaible a without object
	//System.out.println(b);  //incorrect bcoz b is non-static varaible hence cannot be accessed directly
	
	m1();//directly can call static method m1 without object
	//m2();//incorrect bcoz m2 is non static method we cannot directly call 
	
	StaticExample se=new StaticExample ();
	System.out.println(se.b);       //through object we can access non-static stuff
	se.m2(); 
	
	se.m();//m method is static so can access through object only	
		
	} */

}
