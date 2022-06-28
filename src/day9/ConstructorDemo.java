package day9;

public class ConstructorDemo {
	
	
	int x, y;
	String s;
	
/*	ConstructorDemo() 		// if constructor not accepting any parameters it is default constructor)
	{
		System.out.println("This is default Constructor");   
		
	}*/
	
ConstructorDemo(int a, int b, String str) 	// if constructor accepting any parameters it is parameterized constructor)
	{
		x=a;
		y=b;
		s=str;
	
	}

void display()
{
	System.out.println(x);
	System.out.println(y);
	System.out.println(s);
}


	public static void main(String[] args) {
		
		//ConstructorDemo cd=new ConstructorDemo();  //this will invoke defualt constructor
		
		ConstructorDemo cd=new ConstructorDemo(10,20,"welcome");  //this will invoke parameterized constructor
		cd.display();
	}

}
