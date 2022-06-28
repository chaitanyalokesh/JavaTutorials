package day11;

public class TestSuper {

	public static void main(String[] args) {
		
		Dog dobj=new Dog();
		dobj.displayColor();  //black updated overridded value
		
		dobj.displayColor(); //white as super results immediate parent color method
		dobj.eat();
	}

}
