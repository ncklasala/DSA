/*
 * Purpose: Midterm
 * Status: Complete
 * Last update: 10/18/17
 * Submitted:  10/18/17
 * Comment: Works displays available booths different
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;

public class Driver {
	public static void menu() {
		System.out.println("Menu");
		System.out.println("1. A car arrives at the inspection station");
		System.out.println("2. Entrance barrier opened: car inspected at booth");
		System.out.println("3. Exit barrier opened: car leaves DMV");
		System.out.println("4. Display drivers waiting to be inspected");
		System.out.println("5. Display inspection booths that are idle");
		System.out.println("6. Display # of customers that had their cars inspected");
		System.out.println("7. Exit program.");

	}

	public static void main(String args[]) throws IOException {
		Queue<Car> queue = new Queue<Car>();
		Queue<Car> booths = new Queue<Car>();
		int carsInspected = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of booths for your inspection station: ");
		int numBooths = Integer.parseInt(reader.readLine());
		System.out.println(numBooths);
		System.out.println("Please select an option from the menu");
		menu();
		int menuChoice = Integer.parseInt(reader.readLine());
		System.out.println(menuChoice);

		do {
			switch (menuChoice) {
			case 1:
				// Add car to the line
				System.out.println("Welcome to the DMV satation, may please have your name: ");
				String name = reader.readLine();
				Car car = new Car(name);
				System.out.println(car.getOwnerName().toString() + " is now waiting to have their car inspected.");
				queue.enqueue(car);
				System.out.println("You know the choice, make your new menu selection now: ");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 2:
				// Start inspection of next car
				if (queue.isEmpty() == true) {
					System.out.println("No customer is waiting for their car to be inspected!");
				} else {
					if (booths.numItems == numBooths) {
						System.out.println("No more booths available for inspection!");
					} else {
						System.out.println(booths.back + 1 + " is now inspecting "
								+ queue.peek().getOwnerName().toString() + "'s car");
						booths.enqueue(queue.dequeue());
					}
				}

				System.out.println("You know the choice, make your new menu selection now: ");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;

			case 3:
				// finish inspection of first car to start inspection
				if (booths.isEmpty() == true) {
					System.out.println("No customer is having their car inspected!");
				} else {
					System.out.println("booth number " + (booths.front + 1) + " has finished their inspection of "
							+ booths.peek().getOwnerName().toString() + "'s car");
					booths.dequeue();
					carsInspected++;
				}

				System.out.println("You know the choice, make your new menu selection now: ");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 4:
				// Show everybody that is waiting in line
				if (queue.isEmpty() == true) {
					System.out.println("No costumers are waiting to have their car inspected!");
				} else {
					System.out.println("The following customers are waiting to have their cars inspected: ");
					Queue<Car> tempQueue = new Queue<Car>();
					if(queue.numItems <= 2){

						for (int i = queue.front; i < queue.numItems + 1; i++) {
							System.out.print(queue.peek().getOwnerName().toString() + " ");
							tempQueue.enqueue(queue.dequeue());
						}

					}
					else{
						for (int i = queue.front % queue.numItems -1; i <= queue.numItems + 1; i++) {
							System.out.print(queue.peek().getOwnerName().toString() + " ");
							tempQueue.enqueue(queue.dequeue());
						}
					}
					System.out.println("");
					queue = tempQueue;
				}

				System.out.println("You know the choice, make your new menu selection now: ");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 5:
				//Show which booths are available
				if (booths.numItems == numBooths) {
					System.out.println("No booths are currently available to inspect cars");
				} else {

					System.out.print("The following booths are available for inspection: ");
					if (booths.numItems == 0) {
						for (int i = booths.numItems + 1; i <= numBooths; i++) {
							System.out.print((i) + " ");
						}
						System.out.println("");
					} else {
						for (int i = booths.numItems + 1 % numBooths; i <= numBooths; i++) {
							System.out.print((i) + " ");
						}
						System.out.println("");
					}
				}

				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 6:
				//Show total number of car that were inspected
				System.out.println(carsInspected + " costumers have had their car inspected.");

				System.out.println("You know the choice, make your new menu selection now: ");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			}
		} while (menuChoice != 7);
		System.out.println("DMV station is closing :Good Bye!!!");
	}

}
