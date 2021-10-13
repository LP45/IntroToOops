package demo;

public class Person {
	
	String name;
	int age;
	double height;
	String color;
	
	Person(String name, int age, double height, String color){
		this.name = name;
		this.age = age;
		this.height = height;
		this.color = color;
	}
	
	void show() {
		System.out.println("Your name is " + this.name);
		System.out.println("You are " + this.age+ "Years old");
		
		System.out.println("You are " +this.height +"ft");
		System.out.println("Your skin color is " + this.color);
	}
	
	
	
	
	
	
}
