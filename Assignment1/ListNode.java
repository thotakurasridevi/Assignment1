import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int d) {data = d;next = null;}
}
	
class Main
{
    Node head;
    public void addToTheLast(Node node)
    {
    	if (head == null)
    	{
    		head = node;
    	}
    	else
    	{
    		Node temp = head;
    		while (temp.next != null)
    			temp = temp.next;
    		temp.next = node;
    	}
    }
    void printList()
    {
    	Node temp = head;
    	while (temp != null)
    	{
    		System.out.print(temp.data + " ");
    		temp = temp.next;
    	}
    	System.out.println();
    }
    public static void main(String args[])
    {
    	Main head1 = new Main();
    	Main head2 = new Main();
    	
    	head1.addToTheLast(new Node(25));
    	head1.addToTheLast(new Node(35));
    	head1.addToTheLast(new Node(4));
    	head1.addToTheLast(new Node(12));
    	head1.addToTheLast(new Node(36));
        head1.addToTheLast(new Node(48));
        
        
        head2.addToTheLast(new Node(8));
    	head2.addToTheLast(new Node(32));
    	head2.addToTheLast(new Node(22));
    	head2.addToTheLast(new Node(45));
        head2.addToTheLast(new Node(63));
        head2.addToTheLast(new Node(49));
    	
    	
    	head1.head = new Mergesortedlists().MergeSortedLists(head1.head, head2.head);
    	head1.printList();	
    	
    }
}


class Mergesortedlists 
{
    public Node MergeSortedLists(Node head1, Node head2) 
    {
      
        if(head1 == null) return head2;
        if(head2 == null) return head1;
          
        if(head1.data < head2.data) 
        {
            head1.next = MergeSortedLists(head1.next, head2);
            return head1;
        }
        else 
        {
            head2.next = MergeSortedLists(head1, head2.next);
            return head2;
        }
          
    }
}  
