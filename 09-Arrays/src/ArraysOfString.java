
public class ArraysOfString {

	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"apple", "banana", "grapes", "pear", "kiwi"};
		
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
		
		int value = 0;
		String text = null;
		String[] texts = new String[2];
		System.out.println(texts[1]);
		texts[0] = "one";
	}
}
