package day12;

	interface Shape
	{
		int length=10; //final & Static
		int width=20; //final & static
		
		void circle(); //abstract method: method without body
		
		default void square()   //default method
		{
			System.out.println("this is square");
		}
		static void rectangle()  //static method
		{
			System.out.println("this is rectangle");
		}
		
	}

	public class InterfaceDemo implements Shape {

		public void circle()  
		{
			System.out.println("this is circle");   //abstract method by public 
		}
		
	public static void main(String[] args) {
		
		InterfaceDemo idobj=new InterfaceDemo();
		
		idobj.circle();
		idobj.square();
		
		Shape.rectangle();
		
	}

}
