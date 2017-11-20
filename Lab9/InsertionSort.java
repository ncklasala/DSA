
/*
 * Purpose: Lab 9 Insertion sort
 * Status: Complete
 * Last update: 11/9/17
 * Submitted:  11/14/17
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;

public class InsertionSort {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of integers: ");
		int arraySize = Integer.parseInt(reader.readLine());
		System.out.println(arraySize);
		int[] list = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			System.out.print("Enter integer number " + (i + 1) + ": ");
			int num = Integer.parseInt(reader.readLine());
			System.out.println(num);
			list[i] = num;
		}
		String string = "";
		for (int s = 0; s < arraySize; s++) {
			string = string + list[s] + " ";
		}
		int comp = 0;
		int shift = 0;
		System.out.println("Input data");
		System.out.println(string);
		for (int p = 1; p < arraySize; p++) {
			int insert = list[p];
			int s = p - 1;
			while (s >= 0 && list[s] > insert) {
				comp++;
				list[s + 1] = list[s];
				s--;
			}
			shift++;
			list[s + 1] = insert;
		}

		System.out.println("Insertion Sort");
		String sortString = "";
		for (int s = 0; s < arraySize; s++) {
			sortString = sortString + list[s] + " ";
		}
		System.out.println("Sorted data: ");
		System.out.println(sortString);
		System.out.println("Number of comparisons: " + comp);
		System.out.println("Number of shifts: " + shift);
		System.out.println("List sorted. Good Bye");
	}
}
