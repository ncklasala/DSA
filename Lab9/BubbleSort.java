/*
 * Purpose: Lab 9 BubbleSort
 * Status: Complete
 * Last update: 11/8/17
 * Submitted:  11/14/17
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;
public class BubbleSort {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Enter number of integers: ");
		int arraySize = Integer.parseInt(reader.readLine());
		System.out.print(arraySize);
		
		int []list = new int [arraySize];
		for(int i =0; i < arraySize;i++){
			System.out.println("Enter integer number "+ (i+1) +": ");
			int num = Integer.parseInt(reader.readLine());
			System.out.print(num);
			list[i] = num;
		}
		String string ="";
		for(int s = 0; s < arraySize; s++){
			string = string + list[s] + " ";
		}
		int comp = 0;
		int swap = 0;
		System.out.println("Input data");
		System.out.println(string);
		System.out.println("Bubble Sort");
		for(int p = 0;p<arraySize ; p++){
			for(int s = 0; s < arraySize -1;s++){
				comp += (p-s);
				if(list[s] > list[s+1]){
					swap++;
					int temp = list[s+1];
					list[s+1]= list[s];
					list[s] = temp;
				}
				
			}
		}
		String sortString ="";
		for(int s = 0; s < arraySize; s++){
			sortString = sortString + list[s] + " ";
		}
		System.out.println("Sorted data: ");
		System.out.println(sortString);
		System.out.println("Number of comparisons: "+ comp);
		System.out.println("Number of swaps: "+swap);
		System.out.println("List sorted. Good Bye");
	}

}
