package linearQueueUsingArray;

public class LinearQueue<T> {
	int front;
	int rear;
	T[] queue;
	int capacity;
	
	@SuppressWarnings("unchecked")
	LinearQueue(int size){
		front=rear=-1;
		capacity = size;
		queue = (T[]) new Object[size];
	}
	
	public void enqueue(T data) {
		if(rear==capacity-1) {
			System.err.println("queue is full");
			return;
		}
		if(rear==-1) {
			front=rear=0;
			queue[rear] = data;
			return;
		}
		queue[++rear] = data;
	}
	
//	public T dequeue() {
//		if(front==-1) {
//			throw new RuntimeException("queue is empty");
//		}
//		if(front==rear) {
//			T data = queue[front];
//			front=rear=-1;
//			return data;
//		}
//		return queue[front++];
//	}
	
	//by sifting elements
	public T dequeue() {
		if(front==-1) {
			throw new RuntimeException("queue is empty");
		}
		T data = queue[front];
		if(front==rear) {
			front=rear=-1;
			return data;
		}
		for(int i=front; i<rear; i++) {
			queue[i] = queue[i+1];
		}
		rear--;
		return data;
	}
	
	public T peek() {
		if(front==-1) {
			throw new RuntimeException("queue is empty");
		}
		return queue[front];
	}

	public void display() {
		if(front==-1) {
			System.err.println("queue is empty");
			return;
		}
		System.out.println("elements of queue are: ");
		for(int i=front;i<=rear;i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}
	
	public boolean isEmpty() {
		return front==-1;
	}
	
	public boolean isFull() {
		return rear==capacity-1;
	}
	
	
	
}
