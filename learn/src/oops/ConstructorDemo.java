package oops;

public class ConstructorDemo {

	private int age;
	private String name;
	String school;
	
	
	
	

	ConstructorDemo() {

		
		//this(10, "abc");
		school="SKPS";
		System.out.println("this");
	}

	ConstructorDemo(int age, String name) {

		this.age = age;
		this.name = name;
		
		//System.out.println(age + " " + name);
		//System.out.println("schoolsha");

	}

	public static void main(String[] args) {

		ConstructorDemo d2 = new ConstructorDemo(29, "Shubham");
		System.out.println(d2.age + " " + d2.name);
		
		ConstructorDemo d1 = new ConstructorDemo();
		System.out.println(d1.school);
	}

}
