package day13;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		
		//int x=100; //x is a variable
		
		Integer x=100;  //x is a object reference variable
		
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		
// converting primitives into  objects  AutoBoxing
		
		Byte byteobj=b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean boolobj = b2;
		
		
	System.out.println("Byte object:"+byteobj);
	System.out.println("Short object:"+shortobj);
	System.out.println("Integer object:"+intobj);
	System.out.println("Long object:"+longobj);
	System.out.println("Float object:"+floatobj);
	System.out.println("Double object:"+doubleobj);
	System.out.println("Character object:"+charobj);

// converting objects into primitives unBoxing

	byte bytevalue =byteobj;
	short shortvalue = shortobj;
	int intvalue = intobj;
	long longvalue = longobj;
	float floatvalue = floatobj;
	double doublevalue = doubleobj;
	char charvalue = charobj;
	Boolean boolvalue = boolobj;
	
	System.out.println("byte value:"+byteobj);
	System.out.println("shortvalue:"+shortvalue);
	System.out.println("int value:"+intobj);
	System.out.println("long value:"+longobj);
	System.out.println("short value:"+shortobj);
	System.out.println("double value:"+doubleobj);
	System.out.println("char value:"+ charobj);
	System.out.println("boolean value:"+boolobj);



		
		
		
		
	}

}
