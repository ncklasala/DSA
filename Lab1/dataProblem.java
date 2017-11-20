/*
 * Purpose: Data Structure and Algorithms Lab 1 Problem 9
 * Status: Complete, but improvable
 * Last update: 9/10/17
 * Submitted:  9/12/17
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class dataProblem {
	static Scanner scrn = new Scanner(System.in);
	//I created this data field but in the end was never used, I commented it out but did not want to delete it
	//private ArrayList<Character> data = new ArrayList<Character>();
	public static void main(String args[]){

		ArrayList<Character> data = new ArrayList<Character>();
		System.out.println("Enter the number Character you would like to add to data");
		int choice = scrn.nextInt();
		for(int k = 1; k <= choice; k++ ){
			System.out.println("Enter character "+ k +": ");
			add(data);
			System.out.println(data.get(k -1));
		}
		displayNameOfProcessingMethod(data);
		displayReverseNameOfProcessingMethod(data);
		testIfPalindromeNameOfProcessingMethod(data);

	}

	public static void add(ArrayList<Character> data){
		data.add(scrn.next().charAt(0));
	}
	public static void displayNameOfProcessingMethod(ArrayList<Character> data){
		//I included a for loop, a while loop, and while loop, plus I included what would happen if you system out print the ArrayList
    System.out.println("Here is the for loop result for displaying the ArrayList");
		for(int i = 0; i < data.size(); i++){
			System.out.print(data.get(i));
		}
	System.out.println("");
    System.out.println("Here is the while loop result for displaying the ArrayList");
		System.out.println("");
		int i = 0;
		while(i < data.size()){
			System.out.print(data.get(i));
			i++;
		}
		int j =0;
		System.out.println("");
    System.out.println("Here is the do while result for displaying the ArrayList");
		do{
			System.out.print(data.get(j));
			j++;
		}while(j < data.size());
		System.out.println("");
		System.out.println("Here is the iterator result for displaying the contents of the ArrayLisy");
		Iterator<Character> iterateData = data.iterator();
		while(iterateData.hasNext()){
			System.out.print(iterateData.next());
		}
		System.out.println("");
		System.out.println(data);
	}
	public static void displayReverseNameOfProcessingMethod(ArrayList<Character> data){
		//To show the reverse of the array list I chose to make a second arraylist that I would fill in reverse that
		// I demonstrated it working with a for loop and a while loop
		ArrayList<Character> reverseData = new ArrayList<Character>();
    System.out.println("Here is the for loop result for displaying the reverse ArrayList");
		for(int n = data.size() - 1; n >= 0; n--){
			reverseData.add(data.get(n));
		}
		for(int g = 0; g < data.size(); g++){
			System.out.print(reverseData.get(g));
		}
		System.out.println("");
    System.out.println("Here is the while loop result for displaying the reverse ArrayList");
		int y= 0;
		while(y < data.size()){
			System.out.print(reverseData.get(y));
			y++;
		}
		System.out.println("");
		System.out.println(reverseData);

	}
	public static void testIfPalindromeNameOfProcessingMethod(ArrayList<Character> data){
		//I could not figure out how to do this with a for loop
		// another method would be to use a boolean method rather than a void but I choose to do it this way
		System.out.println("Here is the the test for whether of not the ArrayList has a palindrome");
		int start =  0;
		int end = data.size() -1;
		boolean palindromeCheck = true;
		while(start <= end){
			if(data.get(start) != data.get(end)){
				palindromeCheck = false;
				start = end +1;
			}
			else{
				palindromeCheck = true;
			}
			start++;
			end--;
		}
		System.out.println(palindromeCheck);
	}
	
}
