package day8;

public class Employee {

	int eid;
	String ename;
	String job;
	int esal;
	
	
	void display()
	{
		System.out.println("Employee Id is:"+ eid);
		System.out.println("Employee Name is:"+ ename);
		System.out.println("Employee Job is:"+ job);
		System.out.println("Employee Salary is:"+ esal);
	}
	
	
/*public static void main(String[] args) {

	Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="David";
		emp1.job="Manager";
		emp1.esal=50000;
		
		emp1.display();
		System.out.println("--------------------------");
		
	Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="Lokesh";
		emp2.job="Manager2";
		emp2.esal=80000;
		
		emp2.display();
		System.out.println("------------------------");
	
	}*/

}
