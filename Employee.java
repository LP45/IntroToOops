package demo;
import java.util.Scanner;

public class Employee extends Person {
	
	long id;
	String jobTitle;
	String ranking;

	Employee(long id, String jobTitle, String ranking, String name, int age, double height,String color){
		
		super(name,age,height,color);
		
		this.id = id;
		this.jobTitle = jobTitle;
		this.ranking = ranking;
	}
	
	public void display() {
		System.out.println("ID: " + this.id);
		System.out.println("Jobtitle "+this.jobTitle);
		System.out.println("Ranking "+this.ranking);
		System.out.println("Name: " + super.name);
		System.out.println("Age "+super.age);
		System.out.println("Your are " + super.height +"ft");
		System.out.println("Your skin color is " + super.color);
		
	}
//	 void userInput() {
//		System.out.println("What is your id");
//		this.id = scan.nextInt();
//		System.out.println("What is your Job title");
//		this.jobTitle = scan.next();
//		System.out.println("What is your Ranking");
//		this.ranking = scan.next();
//		System.out.println("What is Name?");
//		super.name = scan.next();
//		System.out.println("How old are you?");
//		super.age = scan.nextInt();
//		System.out.println("How tall are you?");
//		super.height = scan.nextDouble();
//		System.out.println("What color are you?");
//		super.color= scan.next();
//	}

	public static void main( String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		Employee e1 = new Employee(21,"Healer","Highest","George",24,6.2,"Black AF");
		e1.display();
		
	}

}
