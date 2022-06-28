package Assignments;

public class day7_ReverseAString {

	public static void main(String[] args) {

//using + (String concatenation) Operator
		
	System.out.println("using + (String concatenation) Operator");		
	
		String s="welcome";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
				
		System.out.println("reverse String:"+rev);	
		System.out.println("--------------------------");
				
//using character Array
	
		System.out.println("using character array");		
	
		String S="java";
		String Rev="";

		char a[]=S.toCharArray();

		
		for(int i=S.length()-1;i>=0;i--)
		{
			Rev=Rev+a[i];
		}
				
		System.out.println("reverse String:"+Rev);		
		
		System.out.println("--------------------------");
		
//using String Buffer class
		
		System.out.println("using String Buffer class");	
		
		String A="chaitanya";
		StringBuffer x = new StringBuffer (A);
		System.out.println(x.reverse());
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}
