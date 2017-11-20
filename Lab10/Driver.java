/*
 * Purpose: Lab 10
 * Status: Complete
 * Last update: 11/20/17
 * Submitted:  11/21/17
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;
public class Driver {
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
	}
}
