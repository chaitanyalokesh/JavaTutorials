package day11;

public class Animal {

	String color = "white";
	
	void eat()
	{
		System.out.println("eating...");
	}
	
}
class Dog extends Animal
{
	String color = "black";  //overrided varable
	void eat()
	{
		super.eat();
		System.out.println("eating bread...");
	}
	
	void displayColor()
	{
		System.out.println(color);
		System.out.println(super.color);  //super display immediate parent color

	}
}
