package stackUsingArray;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice,data;
		System.out.println("enter stack size: ");
		Stack<Integer> stack = new Stack<Integer>(sc.nextInt());
		while(true) {
			
			System.out.println("1.push\n2.pop\n3.peek\n4.display\n5.isEmpty\n6.isFull\n7.exit");
			System.out.print("enter the choice: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1: System.out.print("enter the element: ");
						data = sc.nextInt();
						stack.push(data);
						break;
				case 2: System.out.println("element deleted is: "+stack.pop());
						break;
				case 3: System.out.println("top element is: "+stack.peek());
						break;
				case 4: stack.display();
						break;
				case 5: System.out.println("is stack empty? "+stack.isEmpty());
						break;
				case 6: System.out.println("is stack full? "+stack.isFull());
						break;
				case 7: System.exit(0);
				default: System.out.println("enter valid choice");
			}
		}
	}
}
