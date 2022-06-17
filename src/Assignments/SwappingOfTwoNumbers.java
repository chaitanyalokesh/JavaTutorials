package Assignments;

public class SwappingOfTwoNumbers {
	

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println("Before swapping a & b:"+a+" "+b);
		
	//Logic 1: Third variable
		
		//int c=a;
		//a=b;
		//b=a;
		
	//Logic 2 : use + & - without  using third variable
		
		//a=a+b;   //10+20=30
		//b=a-b;	//30-20=10
		//a=a-b;	//30-10=20
		
	//Logic 3: use * and / without using  third variable ; a&B shoukd not be zero
		
		//a=a*b;  //10*20=200
		//b=a/b;	//200/20=10
		//a=a/b;	//200/10=20
		
	//Logic 4: bitwise XOR (^)
		
		/*a=a^b;		//10 ^20=30
		b=a^b;		//30^20=10
		a=a^b;		//30^10=20*/
		
	//Logic 5: 
		
		b=a+b-(a=b);   //reverse calculation b=a so now b=10; a+b = 30 now b= 30-10=20
			
		System.out.println("After swapping a & b:"+a+" "+b);

		}

}