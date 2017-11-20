import java.util.Scanner;

public class CompareToTest {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 if you would like to compare 2 pairs");
		System.out.println("Enter 0 if you would like to quit");
		int choice = scanner.nextInt();
		while(choice == 1){
			System.out.println("Enter first item: ");
			String firstItem = scanner.next();
			System.out.println(firstItem);
			System.out.println("Enter Second item: ");
			String secondItem = scanner.next();
			System.out.println(secondItem);
			if(firstItem.compareTo(secondItem) < 0){
				System.out.println(firstItem + " is larger!");
			}
			else if(firstItem.compareTo(secondItem) == 0){
				System.out.println("The two items are equal!");
			}
			else{
				System.out.println(secondItem + " is larger!");
			}
			System.out.println("Enter 1 if you would like to try another pair");
			System.out.println("Enter 0 if you would like to quit");
			choice = scanner.nextInt();
		}
		
		System.out.println("Goodbye");
		}

}
