package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = { "hi", "hello", "hola", "bonjour" };
		// sprintStrings(strings);
		// reverseStrings(strings);
		// skipStrings(strings);
		randomizeStrings(strings);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void printStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}

	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void reverseStrings(String[] strings) {
		for (int i = strings.length - 1; i >= 0; i--) {
			System.out.println(strings[i]);

		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void skipStrings(String[] strings) {
		for (int i = 0; i < strings.length; i += 2) {
			System.out.println(strings[i]);

		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void randomizeStrings(String[] strings) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < strings.length; i++) {
			list.add(strings[i]);
			
		}
		while(list.size() > 0)
		{
			Random r = new Random();
			int temp = r.nextInt(list.size());
			System.out.println(list.get(temp));
			list.remove(temp);
		}
	}
}
