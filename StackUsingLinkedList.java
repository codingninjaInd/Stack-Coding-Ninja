
public class StackUsingLinkedList<T> {
	
	Node<T> head;
	
	private int size;
	
	
	public  StackUsingLinkedList()
	{
		head = null;
		
		size = 0;
	}
	
	
	public int size()
	{
		
		return size;
		
	}
	
	public boolean isEmpty()
	{
		
		return head == null;
		
	}
	
	public void push(T data)
	{
		
		Node<T> node= new Node<>(data);
		
		node.next = head;
		
		head = node;
		
		size++;
		
	}
	
	public T pop() throws StackIsEmpty
	{
		
		if(head == null)
		{
			
				throw new StackIsEmpty();
			
		}
		
		size--;
		
		T temp = head.data;
		
		head = head.next;
		
		return temp;
		
	}
	
	public  T top() throws StackIsEmpty
	{
		
		if(head == null)
		{
			
				throw new StackIsEmpty();
			
		}
		
		return head.data;
		
	}

}
