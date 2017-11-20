
public class StackArrayBased<T> implements StackInterface {

	private T[] arrayvariable;
	protected int top;

	public StackArrayBased() {
		arrayvariable = (T[]) new Object[3];
		top = 0;
	}

	public boolean isEmpty() {

		return (top == 0);
	}

	public void popAll() {

		arrayvariable = (T[]) new Object[3];
		top = 0;
	}

	public void push(Object newItem) throws StackException {
		if (top == arrayvariable.length) {
			resize();
		}
		arrayvariable[top] = (T) newItem;
		top++;

	}

	public void resize() {
		int newLength = 0;
		newLength = (int) ((int) (top + 1) * 1.5);
		Object[] newArray = new Object[newLength];
		for (int k = 0; k < top; k++) {
			newArray[k] = arrayvariable[k];
		}
		arrayvariable = (T[]) newArray;
	}

	public T pop() throws StackException {
		if (top == 0) {
			throw new StackException("Stack is already empty");
		} else {
			T result = arrayvariable[top - 1];
			arrayvariable[top - 1] = null;
			top--;
			return result;
		}
	}

	public T peek() throws StackException {
		if (top == 0) {
			throw new StackException("Stack is already empty");
		} else {
			return arrayvariable[top - 1];
		}
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < top; i++) {
			s += (String) arrayvariable[i];
		}
		return s;
	}

}