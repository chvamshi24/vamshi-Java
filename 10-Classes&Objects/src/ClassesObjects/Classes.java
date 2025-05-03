package ClassesObjects;

class Person {
	String name;
	int age;
}

public class Classes {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Vamhi";
		person1.age = 32;
		
		Person person2 = new Person();
		person2.name = "Krishna";
		person2.age = 28;
		
		System.out.println("Person1 \nName: " + person1.name + ", \nAge: "+ person1.age);
		System.out.println("\nPerson2 \nName: " + person2.name + ", \nAge: " + person2.age);
	}

}
