
public class linkedListStackUse {

	public static void main(String[] args) throws StackIsEmpty {
		StackUsingLinkedList<Integer> stack = new StackUsingLinkedList();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack.pop());
		System.out.println(stack.top());
		
		System.out.println(stack.pop());
		System.out.println(stack.top());
		
		System.out.println(stack.pop());
		System.out.println(stack.top());


	}

}
