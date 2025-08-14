package circularQueueUisngArray;

public class CircularQueue<T> {
	int front;
	int rear;
	T[] cqueue;
	int count;
	int capacity; 
	
	@SuppressWarnings("unchecked")
	CircularQueue(int size){
		front=0;
		rear=-1;
		capacity=size;
		cqueue = (T[]) new Object[size];
	}
	
	public void enqueue(T data) {
		if(count==capacity) {
			System.out.println("circular queue is full");
			return;
		}
		rear = (rear+1)%capacity;
		cqueue[rear] = data;
		count++;
	}
	
	public T dequeue() {
		if(count==0) {
			throw new RuntimeException("circular queue is empty");
		}
		T data = cqueue[front];
		front = (front+1)%capacity;
		count--;
		return data;	
	}
	
	public void display() {
		if(count==0) {
			throw new RuntimeException("circular queue is empty");
		}
		System.out.println("elements of circular array are: ");
		for(int i=0; i<count;i++) {
			System.out.print(cqueue[(front+i)%capacity]+" ");
		}
		System.out.println();
	}
	
	public T peek() {
		if(count==0) {
			throw new RuntimeException("circular queue is empty");
		}
		return cqueue[front];	
	}
	
	public boolean isEmpty() {
		return count==0	;
	}
	
	public boolean isFull() {
		return count==capacity;
	}
}
