/*
 * Purpose: Lab 9 Improved Bubble Sort
 * Status: Complete
 * Last update: 11/9/17
 * Submitted:  11/14/17
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;
public class IBubbleSort {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		System.out.print("Enter number of integers: ");
		int arraySize = Integer.parseInt(reader.readLine());
		System.out.println(arraySize);
		int []list = new int [arraySize];
		for(int i =0; i < arraySize;i++){
			System.out.print("Enter integer number "+ (i+1) +": ");
			int num = Integer.parseInt(reader.readLine());
			System.out.println(num);
			list[i] = num;
		}
		String string ="";
		for(int s = 0; s < arraySize; s++){
			string = string + list[s] + " ";
		}
		int comp = 0;
		int swaps = 0;
		System.out.println("Input data");
		System.out.println(string);
		System.out.println("Improved Bubble Sort");
		boolean swap =false;
		for(int p = 0;p< arraySize ; p++){
			for(int s = 0; s < arraySize -1  && swap ==false;s++){
				comp = comp + (p-s);
				if(list[s] > list[s+1]){
					swaps++;
					int temp = list[s+1];
					list[s+1]= list[s];
					list[s] = temp;
					swap = true;
				}
				swap = false;
			}
			
			
		}
		String sortString ="";
		for(int s = 0; s < arraySize; s++){
			sortString = sortString + list[s] + " ";
		}
		System.out.println("Sorted data: ");
		System.out.println(sortString);
		System.out.println("Number of comparisons: "+ comp);
		System.out.println("Number of swaps: "+swaps);
		System.out.println("List sorted. Good Bye");
	}

}