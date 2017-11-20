/*
 * Purpose: Lab 8 Problem 1
 * Status: Complete
 * Last update: 11/1/17
 * Submitted:  11/7/17
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;
public class Driver2 {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		ListArrayBasedPlus list = new ListArrayBasedPlus();
		System.out.println("Menu");
		System.out.println("1. Insert item to list.");
		System.out.println("2. Remove item from list.");
		System.out.println("3. Get item from list.");
		System.out.println("4. Search for a specified item in the list.");
		System.out.println("5. Clear list.");
		System.out.println("6. Print size and content of list.");
		System.out.println("7. Exit program.");
		System.out.println("Make your selection");
		int menuChoice = Integer.parseInt(reader.readLine());
		System.out.println(menuChoice);
		do{
			switch(menuChoice){
		
			case 1:
				System.out.println("You are adding an item to an ordered list");
				System.out.println("Enter item: ");
				Object item = reader.readLine();
				System.out.println(item.toString());
				boolean place = false;
				int index = 0 ;
				for(int i = 0; i < list.size(); i++){
					if(((String) item).compareTo((String) list.get(i)) == 0){
						System.out.println("The item is already located at postion: "+i);
						place = true;
					}
					if(((String) item).compareTo((String) list.get(i)) > 0){
						index = i +1;
					}
				}
				if(place == false){
					list.add(index,item);
				}
				
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
					System.out.println("Please enter the item you would like to search for");
					Object key = reader.readLine();
          System.out.println(key.toString());
					boolean found = false;
					int pos =0;
					int j =0;
					while(((String) key).compareTo((String) list.get(j)) >= 0 && j <list.size()){
						if(((String) key).compareTo((String) list.get(j)) == 0){
							found = true;
							pos = j;
						}
						j++;
					}
					if(found == true){
						System.out.println("Search Successful, Item found at postion: "+ pos);
					}
					else{
						System.out.println("Search unsuccessful, Item not in the list");
					}
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
					list.removeAll();
					System.out.println("List is cleared");
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
					System.out.println("The List has a size of " + list.size() + " and the items: " + list.toString());
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
