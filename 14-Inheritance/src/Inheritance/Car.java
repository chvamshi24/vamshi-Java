package Inheritance;

public class Car extends Machine {
	public void wipeWindshield() {
		System.out.println("Wiping windshield");
	}

	@Override
	public void start() {
		System.out.println("Car Started");
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name);
	}
}
