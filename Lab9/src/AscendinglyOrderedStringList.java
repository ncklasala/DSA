
public class AscendinglyOrderedStringList implements AscendinglyOrderedStringListInterface {

	private static final int MAX_LIST = 3;
	protected String[] items; // an array of list items
	protected int numItems;

	public AscendinglyOrderedStringList() {
		items = new String[MAX_LIST];
		numItems = 0;
	}

	public boolean isEmpty() {
		return (numItems == 0);
	}

	public int size() {
		return numItems;
	}

	public void add(String item) throws ListIndexOutOfBoundsException {

		if (numItems == items.length) {
			resize();
		}

		if(numItems == 0){
			items[0] = item;
			System.out.println("Items " + item.toString() + " added to list at position: 0");
			numItems++;
		}
		else {
			if (search(item) > numItems) {
				System.out.println("Item is already in list");
			} 
			else{	
				for (int pos = numItems-1; pos >= decode(search(item)); pos--) 
            	{
                	items[pos+1] = items[pos];
                	
            	} 
				items[decode(search(item))] = item;
				//System.out.println(items[decode(search(item))]);
				System.out.println("Items " + item.toString() + " added to list at position: "+ decode(search(item)));
				numItems++;
			}
			
		}

	}

	public String get(int index) throws ListIndexOutOfBoundsException {
		if (index >= 0 && index < numItems) {
			return items[index];
		} else {
			throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on get");
		}
	}

	public void remove(int index) throws ListIndexOutOfBoundsException {
		if (index >= 0 && index < numItems) {

			for (int pos = index + 1; pos < numItems; pos++)

			{
				items[pos - 1] = items[pos];
			}

			numItems--;
			items[numItems] = null;
		} else {
			throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on remove");
		}
	}

	public int search(String item) {
		int pos = 0;
		int low = 0;
		int high = numItems -1;
		int mid = low + (high - low) / 2;
		boolean end = false;

		while(low < high){
			if (item.compareTo(items[mid]) <= 0) {
				high = mid -1;
			} else {
				low = mid +1;
			}
			mid = (high + low) / 2;
		}
		if (low >= high) {
			if (item.compareTo(items[mid]) == 0) {
				pos = ((numItems+1)*2) + mid ;
				
			} else {
				pos = mid;
				
			}
			end = true;
		}
		return pos;
	}

	public int decode(int pos) {
		int index = 0;
		if (pos >= numItems) {
			index = pos - ((numItems+1)*2) ;
		} else {
			index = pos;
		}
		return index;
	}

	public void clear() {
		items = new String[MAX_LIST];
		numItems = 0;
	}

	public void resize() {
		int newLength = 0;
		newLength = (int) ((int) (numItems + 1) * 1.5);
		String[] newArray = new String[newLength];
		for (int k = 0; k < numItems; k++) {
			newArray[k] = items[k];
		}
		items = newArray;
	}

	public String toString() {
		String string = "";
		for (int s = 0; s < numItems; s++) {
			string += items[s] + " ";
		}
		return string;
	}

}

