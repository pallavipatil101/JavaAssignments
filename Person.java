package assignments;

import java.util.Scanner;
//Q.1 Write a class Person with private properties Name, Age and write the constructor to set these properties. Also write the setter and getter methods to set and get these properties.

public class Person {
	private String name;
	private int age;
	
	Person(){
		this.name = "Naruto";
		this.age = 12;
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public int getAge() {
	     return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name is: "+getName());
		System.out.println("Name is: "+getAge());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter age: ");
		short age = sc.nextShort();
		
		Person obj1 = new Person("Pallavi", 26);
		obj1.display();
		
		Person obj2 = new Person();
		obj2.setName(name);
		obj2.setAge(age);
		obj2.display();

	}

}
