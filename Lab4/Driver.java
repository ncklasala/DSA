/*
 * Purpose: Lab 4
 * Status: Complete
 * Last update: 9/28/17
 * Submitted:  10/3/17
 * Comment: Application Program
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
	
	public static void main(String args[]) throws IOException{
		ListCDLSBased list = new ListCDLSBased();
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

		System.out.println("Menu");
		System.out.println("1. Insert item to list.");
		System.out.println("2. Remove item from list.");
		System.out.println("3. Get item from list.");
		System.out.println("4. Clear list.");
		System.out.println("5. Print size and content of list.");
		System.out.println("6. Exit program.");
		System.out.println("Make your selection");
		int menuChoice = Integer.parseInt(reader.readLine());
		System.out.println(menuChoice);
		do{
			switch(menuChoice){
			//This is the 1 menu option
			//It uses the add method		
			case 1:
				System.out.println("You are adding an item to the list");
				System.out.println("Enter item: ");
				Object item = reader.readLine();
				System.out.println(item.toString());
				System.out.println("Enter position: ");
				int index = Integer.parseInt(reader.readLine());
				System.out.println(index);
				try{
					
					list.add(index,item);
					System.out.println("Items "+ item+ " added to postion "+ index);
				}catch(ListIndexOutOfBoundsException ex){
					System.out.println("Postion is out of range");
				}
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			//This is the Second menu option
			//It uses the remove method			
			case 2:
				if(list.size() == 0){
					System.out.println("The Array is already empty");
				}
				else{
					System.out.println("Enter position to remove item from : ");
					
					int removeIndex = Integer.parseInt(reader.readLine());
					System.out.println(removeIndex);
					try{
						System.out.println("Items "+ list.get(removeIndex)+ " removed from postion "+ removeIndex);
						list.remove(removeIndex);
					}catch(ListIndexOutOfBoundsException ex){
						System.out.println("Postion is out of range");
					}
					
				}
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			//This is the third menu option
			//It uses the get method
			case 3:
				if(list.size() == 0){
					System.out.println("The Array is already empty");
				}			
				else{
					System.out.println("What is the postion of the item you would like to get");
					int getChoice = Integer.parseInt(reader.readLine());
					
					try{
						System.out.println("Item " +list.get(getChoice) + " retrieved from postion " + getChoice);
					}catch(ListIndexOutOfBoundsException ex){
						System.out.println("Postion is out of range");
					}
				}
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			//This is the fourth menu option
			//It uses the removeAll method
			case 4:
				if(list.size() == 0){
					System.out.println("The Array is already empty");
				}				
				else{
					list.removeAll();
					System.out.println("List is cleared");
				}
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			//This is the five menu option
			//It uses the toString method
			case 5:
				if(list.size() == 0){
					System.out.println("The Array is already empty");
				}			
				else{
					System.out.println("The List has a size of " + list.size() + " and the items: " + list.toString());
				}
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			//This ends the program
			case 6:
				System.out.println("Program ended, Good Bye!!!");
			break;
			}
		}while(menuChoice != 6);
		System.out.println("Program ended, Good Bye!!!");
	}
}