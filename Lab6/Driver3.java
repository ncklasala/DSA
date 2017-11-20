/*
 * Purpose: Lab 6 problem 3
 * Status: Complete
 * Last update: 10/11/17
 * Submitted:  10/12/17
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;

public class Driver3 {
	public static void main(String args[]) throws IOException {
		Deq<Character> right = new Deq<Character>();
		Deq<Character> left = new Deq<Character>();
		int rightLength = 0;
		int leftLength = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the characters you wish to store one at a time");
		System.out.println("enter a dash at the end of first part and a period at the end of the second part");
		Character storedChar;
		do {
			System.out.println("Please enter a character: ");
			storedChar = reader.readLine().charAt(0);
			right.enqueue(storedChar.toLowerCase(storedChar));
			System.out.println(storedChar);
			rightLength++;
		} while (storedChar != '.');
		boolean noDash = false;
		try {
			while (right.peek() != '-') {
				left.enqueue(right.dequeue());
				rightLength--;
				leftLength++;
				if (rightLength == 0) {
					noDash = true;
				}
			}
		} catch (QueueException ex) {
			System.out.println("No Minus");
		}
		// removes period from the right side for comparison
		try {
			rightLength--;
			rightLength--;
			right.dequeue();
			right.dequeueLast();
		} catch (QueueException ex) {
		}
		if (noDash == true) {
		} else if (leftLength > rightLength) {
			System.out.println("Left Longer");
		} else if (leftLength < rightLength) {
			System.out.println("Right Longer");
		} else {
			System.out.print("Same Length, ");
			boolean contentCheck = true;
			boolean palindrome = true;
			if (leftLength == 0) {
				palindrome = false;
			}
			while (right.isEmpty() == false) {
				if (left.peek() != right.peek()) {
					contentCheck = false;
				}
				if (left.peekLast() != right.peekLast()) {
					contentCheck = false;
				}
				if (left.peekLast() != right.peek()) {
					palindrome = false;
				}
				if (left.peek() != right.peekLast()) {
					palindrome = false;
				}
				left.dequeue();
				right.dequeue();
				try {
					left.dequeueLast();
					right.dequeueLast();
				} catch (QueueException ex) {

				}
			}
			if (contentCheck == true) {
				System.out.print("Same content, ");
				if (palindrome == true) {
					System.out.println("Palindrome.");
				} else {
					System.out.println("No Palindrome.");
				}
			} else {
				System.out.print("Different Content. ");
			}

		}
	}
}

