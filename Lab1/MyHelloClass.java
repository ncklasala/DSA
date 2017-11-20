/*
 * Purpose: Data Structure and Algorithms Lab 1 Problem 9
 * Status: Complete, and tested
 * Last update: 9/10/17
 * Submitted:  9/12/17
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.util.ArrayList;
import java.util.Scanner;
public class MyHelloClass
{

	static Scanner scrn = new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter number of people:");
		// n is the user entered number of people
		int  n = scrn.nextInt();
    System.out.println(n);
		//int l = n - 1;
		ArrayList<String> nameList = new ArrayList<String>();
		for(int i = 1; i <= n;  i++){
			System.out.println("Enter name number " + i +":");
			//String name = scrn.nextLine();
			nameList.add(scrn.next());
      System.out.println(nameList.get(i-1));
		}
		if(n == 1){
			System.out.println(nameList.get(0) + " says Hello Class!!!");

		}
		if(n == 2){
			System.out.println(nameList.get(0) + " and " + nameList.get(1) + " say Hello Class!!!");	
		}
		if(n > 2){
			for(int j= 0; j < n-1; j++){
				System.out.print(nameList.get(j) + ", "); 
			}
			System.out.print(/*nameList.get(l) + */"and " + nameList.get(n-1) + " say Hello Class!!!");
		}
	}
}

