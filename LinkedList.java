package LL;

public class LL {
	Node head;
	
	public class Node
	{
		String data;
		Node next;
		
		Node (String data)
		{
			this.data = data;
			this.next = null;
		}
		
	}
		//making our addFirst function;
		public void addFirst(String data)
		{
			Node newNode = new Node(data);
			if (head == null)
			{
				head = newNode;
				return;
			}
			
			newNode.next = head;
			head = newNode;
		}
		
		public void addLast(String data)
		{
			Node newNode = new Node(data);
			if (head == null)
			{
				head = newNode;
				return;
			}
			
			Node currNode = head;
			
			while (currNode.next != null)
			{
				currNode = currNode.next;
			}
			
			
			currNode.next = newNode;
			
		}
		
		//function to print Linked List;
		
		public void printList()
		{
			Node currNode = head;
			
			while (currNode != null)
			{
				System.out.print(currNode.data + " -> ");
				currNode = currNode.next;
			}
			System.out.print("null");
		}
		
	

	public static void main(String[] args) {
		LL list = new LL();
		
		list.addFirst("I");
		list.addLast("understand");
		list.addLast("the");
		list.addLast("Linked List");
		list.printList();
		

	}

}
