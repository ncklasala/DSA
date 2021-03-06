/*
 * Purpose: Lab 2
 * Status: incomplete
 * Last update: 9/17/17
 * Submitted:  
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;
public class Driver {
	static ListArrayBasedPlus list = new ListArrayBasedPlus();
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

		System.out.println("Menu");
		System.out.println("1. Insert item to list.");
		System.out.println("2. Remove item from list.");
		System.out.println("3. Get item from list.");
		System.out.println("4. Clear list.");
		System.out.println("5. Print size and content of list.");
		System.out.println("6. Reverse list.");
		System.out.println("7. Exit program.");
		System.out.println("Make your selection");
		int menuChoice = Integer.parseInt(reader.readLine());
		System.out.println(menuChoice);
		do{
			switch(menuChoice){
		
			case 1:
				System.out.println("You are adding an item to the list");
				System.out.println("Enter item: ");
				Object item = reader.readLine();
				System.out.println(item.toString());
				System.out.println("Enter position: ");
				int index = Integer.parseInt(reader.readLine());
				System.out.println(index);

				list.add(index,item);
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
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
					}catch(IndexOutOfBoundsException ex){
						System.out.println("Postion is out of range");
					}
					
				}
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			case 3:
				if(list.size() == 0){
					System.out.println("The Array is already empty");
				}			
				else{
					System.out.println("What is the postion of the item you would like to get");
					int getChoice = Integer.parseInt(reader.readLine());
					
					try{
						System.out.println("Item " +list.get(getChoice) + " retrieved from postion " + getChoice);
					}catch(IndexOutOfBoundsException ex){
						System.out.println("Postion is out of range");
					}
				}
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
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
			case 6:
				if(list.size() == 0){
					System.out.println("The Array is already empty");
				}
				else{
					System.out.println("List Reversed!!!");
					list.reverse();
				}
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			case 7:
				System.out.println("Program ended, Good Bye!!!");
			break;
			}
		}while(menuChoice != 7);
	}
}


