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

public class Driver2 {
	public static void menu() {
		System.out.println("Menu");
		System.out.println("1. Insert item at back of Deq.");
		System.out.println("2. Insert item at front of Deq.");
		System.out.println("3. Remove item from front of Deq.");
		System.out.println("4. Remove item from back of Deq.");
		System.out.println("5. Display front item of Deq.");
		System.out.println("6. Display last item of Deq.");
		System.out.println("7. Clear Deq.");
		System.out.println("8. Display content of Deq.");
		System.out.println("9. Exit program.");
	}

	public static void main(String args[]) throws IOException {
		Deq queue = new Deq();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		menu();
		System.out.println("Make your selection");
		int menuChoice = Integer.parseInt(reader.readLine());
		System.out.println(menuChoice);
		do {
			switch (menuChoice) {
			case 1:
				System.out.println("You are adding an item to the back of the queue");
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
				System.out.println("You are adding an item to the front of the queue");
				System.out.println("Enter item: ");
				Object itemFirst = reader.readLine();
				System.out.println(itemFirst.toString());
				queue.enqueueFirst(itemFirst);
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;

			case 3:
				if (queue.isEmpty() == true) {
					System.out.println("The Array is already empty");
				} else {
					System.out.println(queue.dequeue());
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
			case 4:
				if (queue.isEmpty() == true) {
					System.out.println("The Array is already empty");
				} else {
					System.out.println(queue.dequeueLast());
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 5:
				if (queue.isEmpty() == true) {
					System.out.println("The Array is already empty");
				} else {
					System.out.println(queue.peek());
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 6:
				if (queue.isEmpty() == true) {
					System.out.println("The Array is already empty");
				} else {
					System.out.println(queue.peekLast());
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 7:
				if (queue.isEmpty() == true) {
					System.out.println("The Array is already empty");
				} else {
					queue.dequeueAll();
					System.out.println("queue is cleared");
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 8:
				if (queue.isEmpty() == true) {
					System.out.println("The Array is already empty");
				} else {
					System.out.println(queue.toString());
				}
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			}
		} while (menuChoice != 9);
		System.out.println("Program ended, Good Bye!!!");
	}

}
