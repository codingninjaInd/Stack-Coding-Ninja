
/*
 Brackets Balanced
Send Feedback
Given a string expression, check if brackets present in the expression are balanced or not. Brackets are balanced if the bracket which opens last, closes first.
You need to return true if it is balanced, false otherwise.
Note: This problem was asked in initial rounds in Facebook
Sample Input 1 :
{ a + [ b+ (c + d)] + (e + f) }
Sample Output 1 :
true
Sample Input 2 :
{ a + [ b - c } ]
Sample Output 2 :
false
 */


import java.util.Stack;

public class BalencedBracket {
	
	
	 public static boolean checkBalanced(String exp) {
		 
		  Stack<Character> stack = new Stack<>();
		 
		 for(int i=0;i<exp.length();i++)
		 {
			 if(exp.charAt(i) == '{' || exp.charAt(i)=='[' || exp.charAt(i) == '(')
			 {
				 stack.push(exp.charAt(i));
				 
			 }
			 else if(exp.charAt(i) == '}' || exp.charAt(i)==']' || exp.charAt(i) == ')')
			 {
				 if(stack.isEmpty())
				 {
					 return false;
				 }
				 char ch = stack.pop();
				 
				 if(exp.charAt(i)==')' && ch =='(')
				 {
					 continue;
				 }
				 else if(exp.charAt(i) =='}' && ch == '{')
				 {
					 continue;
				 }
				 else if(exp.charAt(i) ==']' && ch == '[')
				 {
					 continue;
				 }
				 else {
					 
					 return false;
				 }
				 
			 }
		 }
		 
		 if(stack.isEmpty())
		 {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }

	public static void main(String[] args) {
		
		
		String str = new String("{ a + [ b - c } ]");
		
		System.out.println( checkBalanced(str));

	}

}
