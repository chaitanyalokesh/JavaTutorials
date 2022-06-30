package day13.pack2;

import day13.pack1.Test;

public class TestMain extends Test{

	public static void main(String[] args) {
		
		/*Test t=new Test();     //for public
		System.out.println(t.x);
		t.m1();*/
		
		TestMain t=new TestMain();  //for protected main class should be extends child inheritance
		System.out.println(t.x);
		t.m1();
	}

}
