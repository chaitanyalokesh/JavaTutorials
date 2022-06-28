package day9;

public class ConstructorOverLoading {
	
	int x,y,z;
	double d;
	
	ConstructorOverLoading()  //1. no parameters
	{
		x=10;
		y=20;
		System.out.println(x+y);

	}
	ConstructorOverLoading(int a, int b) //2. parameters 
	{
		x=a;
		y=b;
		System.out.println(a+b);
	}
	ConstructorOverLoading(int a,double dbl) //3.data type different
	{
		x=a;
		d=dbl;
		System.out.println(a+dbl);
	}
	ConstructorOverLoading(double dbl,int a)   //4.order change
	{
		d=dbl;
		x=a;
		System.out.println(dbl+a);
	}
	ConstructorOverLoading(int a, int b, int c) //5.no of params different
	{
		x=a;
		y=b;
		z=c;
		System.out.println(a+b+c);
	}
	
 public static void main(String[] args) {
		ConstructorOverLoading co=new ConstructorOverLoading();
		ConstructorOverLoading co1=new ConstructorOverLoading(10,20);
		ConstructorOverLoading co2=new ConstructorOverLoading(10.1,10);
		ConstructorOverLoading co3=new ConstructorOverLoading(10,10.1);
		ConstructorOverLoading co4=new ConstructorOverLoading(10,10,10);


		
		
	}

}
