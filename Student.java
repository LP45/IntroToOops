package demo;

public class Student extends Person {
	long id;
	String university;
	String state;
	
	Student(long id, String university, String state, String name, int age, double height,String color){
		super(name,age,height,color);
		
		this.id = id;
		this.university = university;
		this.state = state;
	}
	
}
