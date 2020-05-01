/*
 Check redundant brackets
Send Feedback
Given a string mathematical expression, return true if redundant brackets are present in the expression. Brackets are redundant if there is nothing inside the bracket or more than one pair of brackets are present.
Assume the given string expression is balanced and contains only one type of bracket i.e. ().
Note: You will not get partial score for this problem. You will get marks only if all test cases are passed.
Input Format :
String s (Expression)
Output Format :
true or false
Sample Input 1:
((a + b)) 
Sample Output 1:
true
Sample Input 2:
(a+b) 
Sample Output 2:
false
 */

import java.util.Stack;

public class Checkredundantbrackets {
	
	
	public static boolean checkRedundantBrackets(String input) 
	{
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i) != ')')
			{
				stack.push(input.charAt(i));
				
				
			}
			else {
				
				int count = 0;
				
				while(stack.peek()!='(')
				{
					count++;
					stack.pop();
				}
				
				if(count == 0)
				{
					return true;
				}
				else {
					
					stack.pop();
					count=0;
				}
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		String str = new String("((a+b))");
		
		System.out.println(checkRedundantBrackets(str));

	}

}
