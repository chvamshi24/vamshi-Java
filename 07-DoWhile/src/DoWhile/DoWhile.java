package DoWhile;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	/*	System.out.println("Enter a number: ");
		int value = sc.nextInt();
		while(value != 5) {
			System.out.println("Enter a number: ");
			value = sc.nextInt();			
		}*/
		
		int value = 0;
		do { 
			System.out.println("Enter a number: ");
			value = sc.nextInt();
		}while(value != 5);
		System.out.println("Got 5!");
	}
}
