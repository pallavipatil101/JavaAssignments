package assignments;

public class Hello {
	
	public void hello() {
		System.out.println("Hello");
	}
	
	public void hello(String name) {
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {
		Hello h = new Hello();
		h.hello();
		h.hello("Pallavi");

	}

}
