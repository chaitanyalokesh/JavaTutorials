package day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		int a =10, b=20;
		
	//Arthemetic Operators + - * / %
		
		System.out.println("sum of a and b is:" + (a+b));
		System.out.println("Substraction of a and b is:" + (b-a));

		System.out.println("Multiplication of a and b is:" + (b*a));
		System.out.println("Division of a and b is:" + (b/a));
		System.out.println("Modulo Division of a and b is:" + (b%a));
		
	//Relational/comparision operators > >= <= != ==
	//Relational operators  always return  true/false  (Boolean value)
	//used for any type of data types
		
		a=100; b=200;
		
		System.out.println(a>b);  	//false
		System.out.println(b>a);	//true
		System.out.println(b==a);	//false
		System.out.println(a!=b);	//true
		System.out.println(a<=b);	//true
		System.out.println(b>=a);	//false
		
	//Logical Operators && || !
	//returns true/false (Boolean)
	//logical operators used between 2 boolean values
		
		
		boolean x= true;
		boolean y=false;
		System.out.println(x&&y);
		System.out.println(x||y);	//true
		System.out.println(!x);		//false
		System.out.println(!y); 	//true
		
		
		boolean b1 = 10>20;     //false
		boolean b2 = 20>10;		//true
		System.out.println(b1 && b2);     //false
		System.out.println(b1 || b2);     //false
		System.out.println(b1!=b2);     //false

	}

}
