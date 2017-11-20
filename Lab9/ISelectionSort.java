/*
 * Purpose: Lab 9 improved Selection sort
 * Status: Complete
 * Last update: 11/13/17
 * Submitted:  11/14/17
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;
public class ISelectionSort {
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
		int shift = 0;
		System.out.println("Input data");
		System.out.println(string);
		System.out.println("Selection Sort");
		int []sList = new int [arraySize];
		
		for(int p= 0; p< arraySize; p++){
			
			int largest =0;
			int lIndex = 0;
			for(int s= 0; s< arraySize-lIndex; s++){
				comp ++;
				if(list[s] >largest){
					shift++;
					largest = list[s];
					lIndex = s;
				}
				
			}
		
			sList[arraySize -1 -p] = largest;
			list[lIndex]=0;
			
		}
		
		String sortString ="";
		for(int s = 0; s < arraySize; s++){
			sortString = sortString + sList[s] + " ";
		}
		System.out.println("Sorted data: ");
		System.out.println(sortString);
		System.out.println("Number of comparisons: "+ comp);
		System.out.println("Number of shifts: "+shift);
		System.out.println("List sorted. Good Bye");
	}
}