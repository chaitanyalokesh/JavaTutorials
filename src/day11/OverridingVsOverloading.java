package day11;

	class ABC
	{
		void m1(int a)
		{
			System.out.println(a);
		}
	void m2(int b)
	{
		System.out.println(b);
	}
	}
	class XYZ extends ABC
	{
		void m1(int a)   //Overrided Method
		{
			System.out.println(a*a);
		}
		
		void m2(int a, int b) //OverLoaded Method
		{
			System.out.println(a+b);
		}
	}

public class OverridingVsOverloading {

	public static void main(String[] args) {
		
		XYZ obj =new XYZ();
		obj.m1(100);
		obj.m2(200);
		obj.m2(300, 400);
	}

}
