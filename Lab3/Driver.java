import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
	static MyListReferenceBased list = new MyListReferenceBased();
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

		System.out.println("Menu");
		System.out.println("1. Insert item to list.");
		System.out.println("2. Remove item from list.");
		System.out.println("3. Get item from list.");
		System.out.println("4. Clear list.");
		System.out.println("5. Print size and content of list.");
		System.out.println("6. Delete largest item in the list.");
		System.out.println("7. Reverse list.");
		System.out.println("8. Exit program.");
		System.out.println("Make your selection");
		int menuChoice = Integer.parseInt(reader.readLine());
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
				try{
				list.add(index, item);
				}catch(IndexOutOfBoundsException ex){
					System.out.println("Postion is out of range");
				}
				System.out.println("Item " + item.toString() + " was added to postion " + index);
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			case 2:
				if(list.isEmpty() == true){
					System.out.println("The Array is already empty");
				}
				else{
					System.out.println("Enter position to remove item from : ");
					int removeIndex = Integer.parseInt(reader.readLine());
					System.out.println(removeIndex);
					System.out.println();
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
				if(list.isEmpty() == true){
					System.out.println("The Array is already empty");
				}
				else{
					System.out.println("Enter position to remove item from : ");
					int getIndex = Integer.parseInt(reader.readLine());
					System.out.println(getIndex);
					System.out.println();
					try{
						System.out.println("Item " +list.get(getIndex) + " retrieved from postion " + getIndex);
						
						}catch(IndexOutOfBoundsException ex){
							System.out.println("Postion is out of range");
						}
				}
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			
			case 4:
				if(list.isEmpty() == true){
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
				if(list.isEmpty() == true){
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
				if(list.isEmpty() == true){
					System.out.println("The Array is already empty");
				}
				else{
					Object largest = list.get(0);
					int largestIndex = 0;
					for(int c = 0; c < list.size(); c++){
						if(((String) largest).compareTo((String) list.get(c)) < 0){
							largest = list.get(c);
							largestIndex = c;
						}
						
					}
					list.remove(largestIndex);
					System.out.println("Largest item "+ largest.toString() +" deleted.");
				}
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			case 7:
				if(list.isEmpty() == true){
					System.out.println("The Array is already empty");
				}
				else{
					int revIndex = list.size() - 1;
					MyListReferenceBased revList = new MyListReferenceBased();
					for(int r = 0; r < list.size(); r++){
						revList.add(r, list.get(revIndex - r));
					}
					list = revList;
					System.out.println("List Reversed!!!");
				}
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			break;
			case 8:
				System.out.println("Program ended, Good Bye!!!");
			break;
			}
		}while(menuChoice != 8);
	
	}

}
