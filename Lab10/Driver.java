
/*
 * Purpose: Lab 10 QuickSort&Merge Sort
 * Status: Complete
 * Last update: 11/20/17
 * Submitted:  11/21/17
 * Comment: 
 * @author: Nicholas La Sala
 * @version: 2017.09.07
 */
import java.io.*;
public class Driver {
	public static void menu() {
		System.out.println("Menu");
		System.out.println("1. Merge sort.");
		System.out.println("2. Quick Sort.");
		System.out.println("3. Exit.");
	}
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		menu();
		System.out.println("Make your selection");
		int menuChoice = Integer.parseInt(reader.readLine());
		System.out.println(menuChoice);
		do {
			switch (menuChoice) {
			case 1:
				System.out.print("Enter number of integers: ");
				int mArraySize = Integer.parseInt(reader.readLine());
				System.out.println(mArraySize);
				int[] mlist = new int[mArraySize];
				for (int i = 0; i < mArraySize; i++) {
					System.out.print("Enter integer number " + (i + 1) + ": ");
					int num = Integer.parseInt(reader.readLine());
					System.out.println(num);
					mlist[i] = num;
				}
				System.out.println(toString(mlist));
				mergeSort(mlist, mArraySize);
				System.out.println("sorted");
				System.out.println(toString(mlist));
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			case 2:
				System.out.print("Enter number of integers: ");
				int qArraySize = Integer.parseInt(reader.readLine());
				System.out.println(qArraySize);
				int[] qlist = new int[qArraySize];
				for (int i = 0; i < qArraySize; i++) {
					System.out.print("Enter integer number " + (i + 1) + ": ");
					int num = Integer.parseInt(reader.readLine());
					System.out.println(num);
					qlist[i] = num;
				}
				System.out.println(toString(qlist));
				quickSort(qlist, 0, qArraySize-1);
				System.out.println("sorted");
				System.out.println(toString(qlist));
				menu();
				System.out.println("Make your new Menu Selection");
				menuChoice = Integer.parseInt(reader.readLine());
				System.out.println(menuChoice);
				break;
			}

		} while (menuChoice != 3);
		System.out.println("Program ended, Good Bye!!!");
	}
	// to string for both
	public static String toString(int[] list) {
		String string ="";
		for(int s = 0; s < list.length; s++){
			string = string + list[s] + " ";
		}
		return string;
	}
	// Merge Sort methods
	public static int[] mergeSort(int[] list, int arraySize){
		int[] split = list;
		int comp =0;
		for(int i =1; i <= (arraySize/2) +2; i= i *2){
			for(int j= i;j <arraySize ; j = j+(2*i)){
				int smaller =0;
				if(j +i > arraySize){
					smaller = arraySize;
				}
				else{
					smaller = j+i;
				}
				comp++;
				combine(split, arraySize, j-i,j,smaller);
			}
		}
		System.out.println("number of comparisons: "+ comp);
		return split;
	}
	public static void combine(int list[], int arraySize, int first, int mid, int last){
		int sortSize = last -first;
		int[] sort = new int[sortSize];
		int a = 0;
		int b = 0;
		int c = 0;
		
		while(a < mid - first && b< last - mid ){
			if(list[first + a] < list[mid +b]){
				sort[c] = list[first+a];
				a++;
				c++;
			}
			else{
				sort[c] = list[mid +b];
				b++;
				c++;
			}
		}
		while(b <(last - mid)){
			sort[c] =  list[mid +b];
			b++;
			c++;
		}
		while(a <(mid-first)){
			sort[c] =  list[first +a];
			a++;
			c++;
		}
		for(c =0; c <sortSize;c++){
			list[first+c] = sort[c];
		}
		
	}
	//quickSort methods
	public static int findPivot(int[] list, int arraySize){
		int pivot =0;
		if((list[0] > list[arraySize/2]&& list[0]< list[arraySize-1])||(list[0] > list[arraySize-1]&& list[0]< list[arraySize/2])){
			pivot = 0;
		}
		else if((list[arraySize/2] > list[0]&& list[arraySize/2]< list[arraySize-1])||(list[arraySize/2] < list[0]&& list[arraySize/2]> list[arraySize-1])){
			pivot = arraySize/2;
		}
		else if((list[arraySize-1] > list[0]&& list[arraySize-1]< list[arraySize/2])||(list[arraySize-1] < list[0]&& list[arraySize-1]> list[arraySize/2])){
			pivot = arraySize-1;
		}
		return pivot;
	}
	public static int divide(int[] list,int start, int end){
		int p = findPivot(list, end );
		int pivot = list[p];
	    int s = start;
	    int e = end ;
	    while(s<e)
	    {
	        if(list[s]<pivot){
	        
	            s++;
	        }
	        if(list[e]>pivot){
	        
	        	e--;
	        }
	        if(s <=e){
	    	    int temp= list[s];
	    	    list[s]=list[e];
	    	    list[e]=temp;
	    	    s++;
	    	    e--;
	        }
	    }

	    return s;
	}
	public static int[] quickSort(int[] list,int start,int end){
		int partition = divide(list,start, end);

		if(start < partition -1){
			quickSort(list,start, partition -1);
		}
		if(end > partition){
			quickSort(list,partition, end);
		}
		return list;
	}
}
