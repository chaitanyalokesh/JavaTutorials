package day9;

public class MethodOverLoading {
	
	int x,y,z;
	double d;
	
	void sum()  //1. no parameters
	{
		x=10;
		y=20;
		System.out.println(x+y);
	}
	void sum(int a, int b) //2. parameters 
	{
		x=a;
		y=b;
		System.out.println(a+b);
	}
	void sum(int a,double dbl) //3.data type different
	{
		x=a;
		d=dbl;
		System.out.println(a+dbl);
	}
	void sum(double dbl,int a)   //4.order change
	{
		d=dbl;
		x=a;
		System.out.println(dbl+a);
	}
	void sum(int a, int b, int c) //5.no of params different
	{
		x=a;
		y=b;
		z=c;
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {

		MethodOverLoading mo = new MethodOverLoading ();
				mo.sum();
				mo.sum(10.10, 10);
				mo.sum(10, 10.1);
				mo.sum(10, 20);
				mo.sum(10, 20, 30);
				//mo.sum(10,20,20.1); //error
	}

}
