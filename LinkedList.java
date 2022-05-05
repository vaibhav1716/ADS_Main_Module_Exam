import java.util.*;
class LinkedList{
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		Node prev;
		Node(int value)
		{
			this.data=value;
			next=null;
			prev=null;
		}
	}
	
	void insert(int data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			head.prev=null;
		}
		
		Node trav=head;
		while(trav.next!=null)
		{
			trav=trav.next;
			
		}
		trav.next=newNode;
		newNode.prev=trav;
	}
	
	void printList()
	{
		Node trav=head;
		
		while(trav!=null)
		{
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
		System.out.print(" ");
	}
	
	LinkedList reverse(Node head1)
	{
		LinkedList list=new LinkedList();
		Node trav=head1;
		Node previous=null;
		while(trav!=null)
		{
			previous=trav;
			trav=trav.next;
		}
		while(previous!=null)
		{
			list.insert(previous.data);
			previous=previous.prev;
			
		}
		
		return list;
		
	}
	

	public static void main(String args[])
	{
		//System.out.println("Case1 :");
		Scanner sc=new Scanner(System.in);
		LinkedList list1= new LinkedList();
		
		System.out.println("Enter the no.of Nodes ");
		int n=sc.nextInt();
		System.out.println("Enter the Node Values");
		for(int i=0;i<n;i++)
		{
			list1.insert(sc.nextInt());
		}
		
		/*
		list1.insert(1);
		list1.insert(2);
		list1.insert(3);
		list1.insert(4);
		list1.insert(5);
		System.out.println("List 1: " );
		list1.printList();*/
		
		
	}



}