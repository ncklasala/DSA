
public class DNode<T> {
	private T item;
	private DNode next;
	private DNode back;

	public DNode(T item) {
		this.item = item;
		next = back = this;
	}

	// public DNode(T item){
	// this.item = item;
	// }
	// public DNode(T item, DNode backNode){
	// this.item = item;
	// back = backNode;
	// }

	public DNode(T item, DNode next, DNode back) {
		this.item = item;
		this.next = next;
		this.back = back;
	}

	public void setItem(T newItem) {
		item = newItem;
	}

	public T getItem() {
		return item;
	}

	public void setNext(DNode nextNode) {
		next = nextNode;
	}

	public DNode getNext() {
		return next;
	}

	public DNode getBack() {
		return back;
	}

	public void setBack(DNode nextBack) {
		back = nextBack;

	}

}// end class Node
