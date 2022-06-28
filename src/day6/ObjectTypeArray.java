package day6;

public class ObjectTypeArray {

	public static void main(String[] args) {

		Object a[]=new Object[5];
		
		a[0]=100;
		a[1]=10.5;
		a[2]="welcome";
		a[3]='A';
		a[4]=true;
		
		Object b[]= {100,10.5,"welcome",'A',true};
		
		System.out.println("object class with for loop");

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);

		}
		System.out.println("-----------");

		System.out.println("object class with for each loop");

		for(Object x:a)
		{
			System.out.println(x);
		}
		
	}

}
