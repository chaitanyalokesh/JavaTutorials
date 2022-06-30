package day13;

public class DataConversionMethods {

	public static void main(String[] args) {

// String ---->Integer
		
	/*	String s="welcome";  //not possible
		
		String s1="10";
		String s2="20";
		
		System.out.println(s1+s2);  //1020
		
		int s1num=Integer.parseInt(s1);
		int s2num=Integer.parseInt(s2);
		
		System.out.println(s1num+s2num); //30 */

		
// String ---->Double
		
		/*String s1="10.10";
		String s2="20.10";
		
		double s1dbl=Double.parseDouble(s1);
		double s2dbl=Double.parseDouble(s2);
		
		System.out.println(s1dbl+s2dbl);*/
		
//String------>Boolean
		
		//String status="passed";  //cannot convert to boolean bcoz boolean accepts only true/false
		
		/*String status="true";
		
		boolean b=Boolean.parseBoolean(status);
		System.out.println(b);*/
		
//int, char, boolean ------>String
		
		int a=10;
		double d=150.55;
		char c='A';
		boolean b=false;
		
		String astr=String.valueOf(a);
		String dstr=String.valueOf(d);
		String cstr=String.valueOf(c);
		String bstr=String.valueOf(b);
		
		System.out.println(astr+"   "+dstr+"   "+cstr+"   "+bstr);
		
		






		
		
		
		
		
		
		
		
		

		

		
		
		
		
		
	}

}
