/*
 * Purpose: Lab 4
 * Status: Complete
 * Last update: 9/28/17
 * Submitted:  10/3/17
 * Comment: List Implementation
 * @author: Nicholas La Sala
 * @version: 2017.09.28
 */
public class ListCDLSBased<T> implements ListInterface<T> {
	private DNode tail;
	private int numItems;

	// Constructor
	public ListCDLSBased() {
		tail = null;
		numItems = 0;
	}

	public boolean isEmpty() {
		return numItems == 0;
	}

	public int size() {
		return numItems;
	}

	// More Efficient find method
	private DNode find(int index) {
		// --------------------------------------------------
		// Locates a specified node in a linked list.
		// Precondition: index is the number of the desired
		// node. Assumes that 0 <= index <= numItems
		// Postcondition: Returns a reference to the desired
		// node.
		// --------------------------------------------------
		DNode curr = tail.getNext();
		int midPoint = numItems / 2;
		if (index <= midPoint) {
			for (int skip = 0; skip < index; skip++) {
				curr = curr.getNext();
			} // end for
		} else if (index > midPoint) {
			for (int skip = numItems - 1; skip > index; skip--) {
				curr = curr.getBack();
			} // end for
		}
		return curr;
	} // end find

	// Updated add method
	public void add(int index, T item) throws ListIndexOutOfBoundsException {
		if (index >= 0 && index < numItems + 1) {
			if (numItems == 0) {
				// insert the new node containing item at
				// beginning of list
				DNode newNode = new DNode(item);
				tail = newNode;
			}

			else if (index == numItems) {
				DNode prev = tail;
				DNode next = tail.getNext();
				DNode newNode = new DNode(item, next, prev);
				prev.setNext(newNode);

				next.setBack(newNode);
				tail = newNode;
			}

			else {
				DNode next = find(index);

				DNode prev = next.getBack();
				DNode newNode = new DNode(item, next, prev);
				prev.setNext(newNode);

				next.setBack(newNode);

			} // end if
			numItems++;
		} else {
			throw new ListIndexOutOfBoundsException("List index out of bounds exception on add");
		} // end if

	}

	public T get(int index) throws ListIndexOutOfBoundsException {
		{
			if (index >= 0 && index < numItems) {

				DNode curr = find(index);
				T dataItem = (T) curr.getItem();
				return dataItem;
			} else {
				throw new ListIndexOutOfBoundsException("List index out of bounds exception on get");
			}
		}
	}

	// Updated remove method
	public void remove(int index) throws ListIndexOutOfBoundsException {
		if (index >= 0 && index < size()) {
			if (index == 0) {
				// delete the first node from the list
				tail = tail.getNext();
			} else {
				DNode prev = find(index - 1);
				// delete the node after the node that prev
				// references, save reference to node
				DNode curr = prev.getNext();
				DNode next = curr.getNext();// added
				next.setBack(prev);// added
				prev.setNext(next);

			} // end if
			numItems--;
		} // end if
		else {
			throw new ListIndexOutOfBoundsException("List index out of bounds exception on remove");
		}

	}

	public void removeAll() {

		tail = null;
		numItems = 0;
	}

	// Returns list as a string
	public String toString() {
		String string = "";

		DNode curr = tail.getNext();
		for (int i = 0; i < size(); i++) {
			string += curr.getItem() + " ";
			curr = curr.getNext();
		}
		return string;
	}

}

