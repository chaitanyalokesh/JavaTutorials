package day10;

public class StaticMain {

	public static void main(String[] args) {
		  
	//main is static method hence can access static variables and static methods directly without creating object
	
	System.out.println(StaticExample.a); // Class name i.e., StaticExample should be mention
	//System.out.println(b);  //incorrect bcoz b is non-static variable hence cannot be accessed directly
	
	StaticExample.m1();// Class name i.e., StaticExample should be mention
	//m2();//incorrect bcoz m2 is non static method we cannot directly call 
	
	StaticExample se=new StaticExample ();
	System.out.println(se.b);       //through object we can access non-static stuff
	se.m2(); 
	
	se.m();//m method is static so can access through object only	
		
	}

}
