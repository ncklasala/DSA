/*
 * Purpose: Lab 7 part 2
 * Status: Complete
 * Last update: 10/25/17
 * Submitted:  10/31/17
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;
public class Driver2 {
	static int calls;
	static int moves;
	public static void main(String args[]) throws IOException{
		System.out.println("This program will solve the tower of hanoi problem for n disks");
		System.out.println("Please enter n: ");
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		int n = Integer.parseInt(reader.readLine());
		System.out.println(n);
		String i = "Inital";
		String t = "Temporary";
		String d = "Destination";
		tHanoi(n, i, t, d);
		System.out.println("There are "+ calls +" calls for "+ n + " disks");
		System.out.println("There are "+ moves +" moves for "+ n + " disks");
	}
	public static void tHanoi(int n,String i, String t, String d){
		calls++;
		
		if(n > 0){
			tHanoi(n-1, i, d,t);
			System.out.println("move disk "+n+ " from peg " + i +" to "+ d);
			moves++;
			tHanoi(n-1, t, i, d);
		}
		
	}
}
