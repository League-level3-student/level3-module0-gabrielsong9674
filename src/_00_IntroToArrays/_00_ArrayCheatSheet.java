package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] string = { "one", "two", "three", "four", "five" };
		// 2. print the third element in the array
		System.out.println(string[2]);
		// 3. set the third element to a different value
		string[2] = "six";
		// 4. print the third element again
		System.out.println(string[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < string.length; i++) {
			string[i] = "Grace";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
		// 7. make an array of 50 integers
		int intArray[] = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		Random num = new Random();
		int smallestNum = 50;
		int largestNum = 0;
		int lastNum = 0;
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = num.nextInt(50);
			if (intArray[i] < smallestNum) {
				smallestNum = intArray[i];
			}

			if (intArray[i] > largestNum) {
				largestNum = intArray[i];
			}
			lastNum = intArray[49];
			// 10 print the entire array to see if step 8 was correct
			System.out.println(intArray[i]);
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		System.out.println("Smallest number: " + smallestNum);
		// 11. print the largest number in the array.
		System.out.println("Largest number: " + largestNum);

		// 12. print only the last element in the array
		System.out.println("Last number: " + lastNum);

	}
}
