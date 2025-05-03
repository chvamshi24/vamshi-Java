package Methods;


class Person {
	String name;
	int age;
	
	void speak() {
		for(int i=0; i<3; i++) {
			System.out.println("My name is: " + name + "and Iam an" + age + "years old");
		}	
	}
	void sayHello() {
		System.out.println("Hello there!");
	}
}

public class methodsEx {
	
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Vamhi";
		person1.age = 32;
		person1.speak();
		person1.sayHello();
		
		Person person2 = new Person();
		person2.name = "Krishna";
		person2.age = 28;
		person2.speak();
		person2.sayHello();
		
		System.out.println("Person1 \nName: " + person1.name + ", \nAge: "+ person1.age);
//		System.out.println("\nPerson2 \nName: " + person2.name + ", \nAge: " + person2.age);
	}
}
