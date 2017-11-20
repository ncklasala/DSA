/*
 * Purpose: Lab 5
 * Status: Complete
 * Last update: 10/3/17
 * Submitted:  
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;

public class Driver2 {
	public static void menu() {
		System.out.println("Menu");
		System.out.println("1. Place a layer of item(s) in the bag.");
		System.out.println("2. Remove a layer of item(s) from the bag.");
		System.out.println("3. Display the weight of the bag.");
		System.out.println("4. Display the number of layers in the bag.");
		System.out.println("5. Display the number of items and the weight of the sample bag.");
		System.out.println("6. Remove an item from the sample bag.");
		System.out.println("7. Empty the sample bag.");
		System.out.println("8. Exit program.");
	}

	public static void main(String args[]) throws IOException {
		StackArrayBased<Layer> bag = new StackArrayBased<Layer>();
		StackArrayBased<Item> sampleBag = new StackArrayBased<Item>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		menu();
		System.out.println("Make your selection");
		int menuChoice = Integer.parseInt(reader.readLine());
		double bagWeight = 0;
		double sampleBagWeight = 0;
		System.out.println(menuChoice);
		do {
			switch (menuChoice) {
			case 1:
				System.out.println("You are adding a layer of items to the bag");
				System.out.println("Enter number of items to place in bag :");
				int numItems = Integer.parseInt(reader.readLine());
				System.out.println(numItems);
				System.out.println("Enter weight of item (lb):");
				double itemWeight = Double.parseDouble(reader.readLine());
				System.out.println(itemWeight);
				Layer layer = new Layer(numItems, itemWeight);
				bagWeight += layer.layerWeight();
				bag.push(layer);
				System.out.println(numItems + " items weighing " + itemWeight + " lbs have been placed in the bag.");
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 2:
				if (bag.isEmpty() == true) {
					System.out.println("Error: Empty bag.");
				} else {
					System.out.println(bag.peek().getNumItems() + " items have been removed from the bag");
					System.out.println("Would you like to store a sample from this layer(Y/N)?");
					char storeChar = reader.readLine().charAt(0);
					if (storeChar == 'Y') {
						double weight = bag.peek().layerWeight() / bag.peek().getNumItems();
						Item item = new Item(weight);
						sampleBagWeight += weight;
						sampleBag.push(item);
						System.out.println("Sample Stored");
					}
					bagWeight -= bag.peek().layerWeight();
					bag.pop();
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 3:
				if (bag.isEmpty() == true) {
					System.out.println("The bag is empty : Weight is 0 lbs.");
				} else {
					System.out.println("The weight of the bag is " + bagWeight + " lbs");
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 4:
				if (bag.isEmpty() == true) {
					System.out.println("The bag is empty : No layers.");
				} else {

					System.out.println("The number of layers in the bag is " + bag.top);
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 5:
				if (sampleBag.isEmpty() == true) {
					System.out.println("The sample bag is empty : No items.");
				} else {
					System.out.println("The number of items in the sample bag is " + sampleBag.top);
					System.out.println("The sample bag weighs " + sampleBagWeight);
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 6:
				if (sampleBag.isEmpty() == true) {
					System.out.println("Error: Empty sample bag.");
				} else {
					System.out.println("An item weighing " + sampleBag.peek().getWeight()
							+ "lbs has been removed from the sample bag");
					sampleBagWeight -= sampleBag.peek().getWeight();
					sampleBag.pop();
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 7:
				if (sampleBag.isEmpty() == true) {
					System.out.println("The sample bag is already empty.");
				} else {
					sampleBag.popAll();
					sampleBagWeight = 0;
					System.out.println("The sample bag has been emptied.");
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			}
		} while (menuChoice != 8);
		System.out.println("Program ended, Good Bye!!!");
	}

}
