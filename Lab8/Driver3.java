/*
 * Purpose: Lab 8 Problem 3
 * Status: incomplete
 * Last update: 11/1/17
 * Submitted:  11/7/17
 * Comment: problem adding second item to list, the search does not return expected values
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;
public class Driver3 {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		AscendinglyOrderedStringList list = new AscendinglyOrderedStringList();
		System.out.println("Menu");
		System.out.println("1. Insert item to list.");
		System.out.println("2. Remove item from list.");
		System.out.println("3. Get item from list.");
		System.out.println("4. Search for a specified item in the list.");
		System.out.println("5. Clear list.");
		System.out.println("6. Exit program.");
		System.out.println("Make your selection");
		int menuChoice = Integer.parseInt(reader.readLine());
		System.out.println(menuChoice);
		do{
			switch(menuChoice){
		
			case 1:
				System.out.println("You are adding an item to an ordered list");
				System.out.println("Enter item: ");
				String item = reader.readLine();
				System.out.println(item.toString());
				list.add(item);
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
					System.out.println("Please enter the item you would like to search for");
					String key = reader.readLine();
					if(list.search(key) < list.size()){
						System.out.println("The item is not in the list but should be at postion: "+ list.decode(list.search(key)));
					}
					else{
						System.out.println("The search was successful, the item is at postion: "+ list.decode(list.search(key)));
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
					list.clear();
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
			break;
			}
		}while(menuChoice != 6);
		System.out.println("Program ended, Good Bye!!!");
	}
}