package Casting;

public class Casting {

	public static void main(String[] args) {
		
		byte byteValue = 20;
		short shortValue = 55;  //16bits
		int intValue = 888;  //32bit
		long longValue = 23456;
		
		float floatValue = 8834.3f;
		float floatValue2 = (float)99.3;
		double doubleValue = 32.4;
		
		System.out.println(Byte.MAX_VALUE);
		
		intValue = (int)longValue;
		
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		// The following won't work as we expect it to!!
		// 128 is too big for a byte.
		byteValue = (byte)128;
		System.out.println(byteValue);
	}
}
