package linearQueueUsingArray;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice,data;
		System.out.println("enter queue size: ");
		LinearQueue<Integer> queue = new LinearQueue<Integer>(sc.nextInt());
		while(true) {
			
			System.out.println("1.enqueue\n2.dequeue\n3.peek\n4.display\n5.isEmpty\n6.isFull\n7.exit");
			System.out.print("enter the choice: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1: System.out.print("enter the element: ");
						data = sc.nextInt();
						queue.enqueue(data);
						break;
				case 2: System.out.println("element deleted is: "+queue.dequeue());
						break;
				case 3: System.out.println("top element is: "+queue.peek());
						break;
				case 4: queue.display();
						break;
				case 5: System.out.println("is stack empty? "+queue.isEmpty());
						break;
				case 6: System.out.println("is stack full? "+queue.isFull());
						break;
				case 7: System.exit(0);
				default: System.out.println("enter valid choice");
			}
		}
	}
}

