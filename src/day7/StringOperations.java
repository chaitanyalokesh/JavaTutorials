package day7;

public class StringOperations {

	public static void main(String[] args) {

		String s="welcome";		
		//String s = new String("welcome");

		System.out.println(s);
		
//length()
		
		System.out.println(s.length());
		
//concat() Joining of Strings
		
		String s1="welcome";
		String s2="to java";
		String s3="automation";
		
		System.out.println(s1.concat(s2)); //welcometo java
		System.out.println(s1.concat(s2).concat(s3)); //welcometo javaautomation
		System.out.println("welcome".concat("to java")); //welcometo java
		
//trim() it will trim right and left side spaces.
		
		s="   automation   ";
		System.out.println(s);
		System.out.println(s.length());  //16
		
		System.out.println(s.trim());    //automation
		System.out.println(s.trim().length()); //10
		
//charAt() - returns a single character based on index we passed
		//index starts from 0
		
		s="welcome";		
		System.out.println(s.charAt(5));  //m
		
//contains() -returns a boolean true/false
		
		System.out.println(s.contains("wel"));  //true
		System.out.println(s.contains("Com"));  //false  Uppercase C
		System.out.println(s.contains("ee"));  //false  
		System.out.println(s.contains("come"));  //true
		
		System.out.println("---------");

		
//equals() equalsIgnore Case ()
		
		s1="WELCOME";
		s2="welcome";
		
		System.out.println(s1.equals(s2));  //false  case sensitive
		System.out.println(s1.equalsIgnoreCase(s2));  //true  ignore case sensitive
		
//replace() - replace single/multiple/sequence characters
		
		s="welcome to selenium automation testing selenium training";
		
		System.out.println(s.replace('e', 'X'));   //wXlcomX to sXlXnium automation tXsting sXlinum training
		System.out.println(s.replace("selenium", "java"));   //welcome to java automation testing java training

//substring() - extract  substring from the main string
		
		s="welcome";
		System.out.println(s.subSequence(2, 5)); //lco
		System.out.println(s.subSequence(0, 4)); //welc
		
//split() divide string into multiple parts based on delimeter
		//should not use * $ ^ ( ) + -
		
		s="abc@xyz@123";
		String a[]=s.split("@");
		System.out.println(a[0]);  //abc
		System.out.println(a[1]);  //xyz
		System.out.println(a[2]);  //123
		
		s="abc@gmail.com 123";
		a=s.split(" ");
		System.out.println(a[0]);  //abc@gmail.com
		System.out.println(a[1]);  //123
		
//toUpperCase() //toLowerCase()
		
		s="WELCOME";
		System.out.println(s.toLowerCase());  //welcome
		
		s="welcome";
		System.out.println(s.toUpperCase());  //WELCOME

		
		
		
		
		
		
		
		
		
		
		
		


		

		

		
		
		
		
		
		
		
		
		
		

		
		
		
		
		


		

		
		
		
		
		
		



		
		
		
		
		
		
		
	}

}
