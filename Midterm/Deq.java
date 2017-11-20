
public class Deq<T> extends Queue<T>implements ExtendedQueueInterface<T> {

	public Deq() {
		super();
	}

	public void enqueueFirst(T newItem) throws ExtendedQueueException {
		if (numItems == queue.length) {
			resize();
		}

		front = (front + queue.length - 1) % queue.length;
		queue[front] = newItem;
		numItems++;
	}

	public T dequeueLast() throws ExtendedQueueException {
		if (numItems == 0) {
			throw new QueueException("Stack is already empty");
		} else {

			back = (back + queue.length - 1) % queue.length;
			T result = queue[back];
			queue[back] = null;
			numItems--;
			return result;
		}
	}

	public T peekLast() throws ExtendedQueueException {
		if (numItems == 0) {
			throw new QueueException("Stack is already empty");
		} else {
			return queue[(back + queue.length - 1) % queue.length];
		}
	}

}
