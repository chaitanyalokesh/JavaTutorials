package day9;

public class ThisKeywordDemo {
	
	int x,y;
	//Instance/Class variable are variables created inside a class
	// Instance variables are accessed in any methods.

	
	void setData(int x, int y)  
	//variables which are defined as parameters or inside methods are called Local/Method variables
	// local variable are accessed only within method only
	{
		this.x=x;
		this.y=y;
	}
	void display()

	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {

		ThisKeywordDemo th = new ThisKeywordDemo();
		th.setData(10, 20);
		th.display();
		
		
		
	}

}
