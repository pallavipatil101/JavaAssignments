package assignments;
//Q.3 Write a class with method talk which prints hello and then overload the talk method by taking in a name and printing “Hello” with that name.
public class Hello {
	
	public void talk() {
		System.out.println("Hello!!");
	}
	
	public void talk(String name) {
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {
		Hello h = new Hello();
		h.talk();
		h.talk("Pallavi");

	}

}
