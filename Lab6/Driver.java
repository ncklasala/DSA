/*
 * Purpose: Lab 6
 * Status: Complete
 * Last update: 10/10/17
 * Submitted:  10/12/17
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;
public class Driver {
	public static void menu(){
		System.out.println("Menu");
		System.out.println("1. Insert item at back of queue.");
		System.out.println("2. Remove item from front of queue.");
		System.out.println("3. Display front item of queue.");
		System.out.println("4. Clear queue.");
		System.out.println("5. Display content of queue.");
		System.out.println("6. Exit program.");
	}
	public static void main(String args[]) throws IOException{
		Queue queue = new Queue();
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		menu();
		System.out.println("Make your selection");
		int menuChoice = Integer.parseInt(reader.readLine());
		System.out.println(menuChoice);
		do{
			switch(menuChoice){
			case 1:
				System.out.println("You are adding an item to the queue");
				System.out.println("Enter item: ");
				Object item = reader.readLine();
				System.out.println(item.toString());
				queue.enqueue(item);
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			case 2:
				if(queue.isEmpty() == true){
				System.out.println("The Array is already empty");
				}
				else{
					System.out.println(queue.dequeue());
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			case 3:
				if(queue.isEmpty() == true){
					System.out.println("The Array is already empty");
				}			
				else{
					System.out.println(queue.peek());
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			case 4:
				if(queue.isEmpty() == true){
					System.out.println("The Array is already empty");
				}				
				else{
					queue.dequeueAll();
					System.out.println("queue is cleared");
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			case 5:
				if(queue.isEmpty() == true){
					System.out.println("The Array is already empty");
				}
				else{
					System.out.println(queue.toString());
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			}
			
		}while(menuChoice != 6);
		System.out.println("Program ended, Good Bye!!!");
	}
}

