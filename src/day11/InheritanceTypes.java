package day11;

	class A
	{
		int a=100;
		void display ()
		{
			System.out.println(a);
		}
	}
	class B extends A
	{
		int b=200;
		void show()
		{
			System.out.println(b);
		}
	}
	
	class C extends B
	{
		int c=300;
		void print()
		{
			System.out.println(c);
		}
	}
	public class InheritanceTypes
	{
		
	
	public static void main(String[] args)
	{
		A aobj =new A();
		System.out.println(aobj.a);
		aobj.display();
		
		B bobj = new B();
		System.out.println(bobj.a);
		System.out.println(bobj.b);

		bobj.show();
		bobj.display();
		
		C cobj=new C();
		
		cobj.a=1000;
		cobj.b=2000;
		cobj.c=3000;
		System.out.println(cobj.a);
		System.out.println(cobj.b);
		System.out.println(cobj.c);

		cobj.show();
		cobj.display();
		cobj.print();
		
		
		

	}
}

