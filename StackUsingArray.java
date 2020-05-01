
public class StackUsingArray {
	
	private int data[];
	
	private int topIndex;
	
	
	public StackUsingArray()
	{
		data = new int[2];
		topIndex = -1;
	}
	
	public boolean isEmpty()
	{
		return topIndex == -1;
	}
	
	public int size()
	{
		return topIndex+1;
	}
	
	public void push(int ele)
	{
		if(topIndex == data.length-1)
		{
			doubleCapacity();
		}
		
		topIndex++;
		
		data[topIndex] = ele;
		
	}
	
	private void doubleCapacity() {
		
		int temp[] = data;
		
		data = new int[2*temp.length];
		
		for(int i=0;i<temp.length;i++)
		{
			data[i] = temp[i];
		}
		
		
	}

	public  int top() throws StackIsEmpty
	{
		
		if(topIndex==-1)
		{
			throw new StackIsEmpty();
		}
		return data[topIndex];
	}
	
	
	public int pop() throws StackIsEmpty
	{
		
		if(topIndex==-1)
		{
			throw new StackIsEmpty();
		}
		int ele = data[topIndex];
		
		topIndex--;
		
		return ele;
	}
	
	

}
