
public class StackUse {

	public static void main(String[] args) throws StackIsEmpty, stackisfullException {
		StackUsingArray stack = new StackUsingArray();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack.top());
		System.out.println(stack.size());
		
		
		
	}

}
