package day9;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator cal=new Calculator ();
	
	//1.No params no Return value	
		
		//cal.add();   
		
	//2.No Params Return value
		
		//int res=cal.add();
		//System.out.println(res);   
		
	//3.Take params No return
		
		//cal.add(100, 200);  
		
	//4. Take Params and Return Value
		
		int res =cal.add(100, 200);
		System.out.println(res);  
		
	}

}
