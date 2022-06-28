package day8;

public class StudentMain {

	public static void main(String[] args) {
		
		/*Student stu=new Student();
		
	//Approach 1: through object reference variable
			
		System.out.println("Approach 1:through object reference variable");
		    stu.sid=100;
			stu.sname="Raaga"; 
			stu.grade='A';  
		
		System.out.println("------------");
		
	//Approch2 : through method
		
		System.out.println("Approach 2:through method");

		stu.setData(100, "Raaga", 'A');
		
		System.out.println("------------");*/

		
	//Approach 3: using constructor
		System.out.println("Approach 3:through constructor");

		Student stu1=new Student(100,"Raaga",'A');
		
		stu1.show(); 

		
	}

}
