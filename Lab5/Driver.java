/*
 * Purpose: Lab 5
 * Status: incomplete
 * Last update: 10/3/17
 * Submitted:  
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;
public class Driver {
	public static void menu(){
		System.out.println("Menu");
		System.out.println("1. Push item onto stack.");
		System.out.println("2. Pop item from stack.");
		System.out.println("3. Peek at top of stack.");
		System.out.println("4. Clear stack.");
		System.out.println("5. Exit program.");
	}
	public static void main(String args[]) throws IOException{
		StackArrayBased stack = new StackArrayBased();
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		menu();
		System.out.println("Make your selection");
		int menuChoice = Integer.parseInt(reader.readLine());
		System.out.println(menuChoice);
		do{
			switch(menuChoice){
			case 1:
				System.out.println("You are adding an item to the stack");
				System.out.println("Enter item: ");
				Object item = reader.readLine();
				System.out.println(item.toString());
				stack.push(item);
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			case 2:
				if(stack.isEmpty() == true){
				System.out.println("The Array is already empty");
				}
				else{
					System.out.println(stack.pop());
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			case 3:
				if(stack.isEmpty() == true){
					System.out.println("The Array is already empty");
				}			
				else{
					System.out.println(stack.peek());
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			case 4:
				if(stack.isEmpty() == true){
					System.out.println("The Array is already empty");
				}				
				else{
					stack.popAll();
					System.out.println("stack is cleared");
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;

			}
		}while(menuChoice != 5);
		System.out.println("Program ended, Good Bye!!!");
	}
}

