package stackUsingArray;

public class Stack<T> {
	int top;
	int capacity;
	T[] stack;
	@SuppressWarnings("unchecked")
	Stack(int size){
		top = -1;
		stack = (T[]) new Object[size];
		capacity = size;
	}
	
	public void push(T data) {
		if(top==capacity-1) {
			System.err.println("stack overflow");
			return;
		}
		stack[++top] = data;
	}
	
	public T pop() {
		if(top==-1) {
			throw new RuntimeException("stack underflow");
		}
		return stack[top--];
	}
	
	public T peek() {
		if(top==-1) {
			throw new RuntimeException("stack is empty");
		}
		return stack[top];
	}
	
	public void display() {
		if(top==-1) {
			System.err.println("stack is empty");
			return;
		}
		System.out.println("Elements of stack are: ");
		for(int i=top;i>=0;i--)
			System.out.println(stack[i]);
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==capacity-1;
	}
}
