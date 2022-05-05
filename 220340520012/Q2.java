/*Q2:Reverse a Linked List*/

 class Q2 
 {
  static Node head;
   static class Node 
   {
	   int data;
	   Node next;
	   Node prev;
	     Node(int d)
		 {
			 data=d;
			 next=null;
			 prev=null;
		 }
   }
   
   void insert(int new_data)
   {
	   Node new_node = new Node(new_data);
	   new_node.next=head;
	   if(head!=null)
	   {
		   head.prev=new_node;
		   head=new_node; 
	   }
   }
	   
	void display(Node n)
	{
     Node p = null;
     System.out.println("Forward display");
       while (n!=null)
	   {
		    System.out.print(n.data+"-->");
			p=n;
			n=n.next;
	   }
	   
	 System.out.println();
	 System.out.println("Reverse display");
	 
	   while (p!=null)
	   {
		   System.out.print(p.data+"<--");    		   
		   p=p.prev;
	   }
	}
		   
	public static void main(String... args)
	{
           Q2 q = new Q2();
		   q.head = new Node(1);
		   q.head.next = new Node (2);
		   q.head.next.next = new Node (3);
		   q.head.next.next.next = new Node (4);
		   q.head.next.next.next.next = new Node (5);
		   
		   
		    /*
			q.insert(1);
			q.insert(2);
			q.insert(3);
			q.insert(4);
			q.insert(5);
			*/
			
			q.display(head);
			
	}
 }
 
	
   
   
