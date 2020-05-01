/*
 Reverse a given Stack with the help of another empty stack. Two stacks will be given. Out of which first contains some integers and second one is empty. You need to reverse the first one using second stack. Change in the given first stack itself.
Note : You don't need to print or return the stack, just reverse the given stack and it will be printed internally.
Input format :
Line 1 : Size of Stack
Line 2 : Stack elements (separated by space)
Sample Input 1 :
4 
1 2 3 4     (4 is at top)
Sample Output 1 :
1 2 3 4    (1 is at top)
 */


import java.util.Stack;

public class ReverseStack {
	
	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) 
	{
		if(s1.size()<=1)
		{
			return;
		}
		
		int top = s1.pop();
		
		reverseStack(s1,s2);
		
		while(!s1.isEmpty())
		{
			int b=s1.pop();
			
			s2.push(b);
		}
		
		s1.push(top);
		
		while(!s2.isEmpty())
		{
			int c = s2.pop();
			
			s1.push(c);
		}
		
		
	}

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		
		Stack<Integer> s2 = new Stack<>();
		
		int arr[] = {1,2,3,4,5};
		
		for(int item :arr)
		{
			s1.push(item);
		}
		System.out.println(s1);
		reverseStack(s1,s2);
		
		System.out.println(s1);
		
	
		
	
	}

}
