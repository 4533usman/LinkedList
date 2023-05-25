package singleLinkedList;
//Implementation Of The Singly Linked List
class SinglyLinkedList{
	public int size = 0 ;
	//Creating The Node 
	class Node {
		int data ; 
		Node next ;
		//Creating The Constructor Of class For Initializing The Variables
		public Node (int data) {
			this.data = data ; 
			this.next = null ;
		}
	}
		//Creating The Head And Tail Of The Node
		public Node head = null ;
		public Node tail = null ;
		// Creating The Method For Add The NOde To the List
		public void addNode(int data) {
			Node newNode = new Node(data);
			//checking Whether The List Is Empty
			if(head == null) {
				head = newNode ; 
				tail = newNode ;
			}
			else {
				tail.next = newNode ; 
				tail = newNode ;
			}
			size ++ ;
		}
		//Creating The Method For Displaying The Nodes
		public void display () {
			Node current = head ;
			//Checking Whether The List is empty
			if(head == null) {
				System.out.println("List Is Empty No Node To Display");
			}
			System.out.println("Nodes Are Below");
			while(current!=null) {
				System.out.print(current.data+" ");
				current = current.next ; 
			}
			System.out.println();
		}
		//Deleting The From Start Of The Linked List
		public void delStart() {
			//Checking Whether The List Is Empty
			if(head == null) {
				System.out.println("List Is Empty");
			}
			else {
				if(head!=tail) {
					head = head.next ;					
				}
				else {
					head = tail = null ;
				}
			}
			
		}
		//Deleting The Node From End Of List
		public void delEnd() {
			//checking Whether The List Is Empty Or Not
			if(head == null) {
				System.out.println("List Is Empty");
			}
			else {
				if(head!=tail) {
					Node current = head ;
					while(current.next!=tail) {
						current  = current.next;
					}
					tail = current ; 
					tail.next = null;
				}
				else {
					head = tail = null ;
				}
			}
		}
		//Deleting The Node From Middle Of The Linked List
		public void delMiddle() {
			Node temp ,current ;
			//Checking Whether The List Is Empty Or Not 
			if(head == null) {
				System.out.println("Linked List Is Empty");
				return ;
			}
			else {
				int count = (size%2==0?size/2:(size+1)/2);
				System.out.println(count);
				if(head!=tail) {
					temp = head ;
					current = null ;
					for(int i=0 ; i<count-1 ; i++) {
						current = temp ;
						temp = temp.next ;
					}
					if(current!=null) {
					current.next = temp.next ;
					temp = null;
					}
					//If Current Points TO Null
					else {
						head = tail = temp.next ;
						temp = null ; 
					}
				}
				//If List Has Only One Element
				else {
					head = tail = null ;
				}
			}
		}
		//Reversing The Liked List 
		public void reverseList(Node current) {
			if(head == null ) {
				System.out.println("Linked List Is Empty");
				return ;
			}
			else {
				if(current.next == null) {
					System.out.print(current.data+" ");
					return ;
				}
				reverseList(current.next);
				System.out.print(current.data+" ");
				
			}
		}
		//Finding The Minimum Node From The List
		public void minNode() {
			Node current = head ;
			int min  =head.data ;
			if(head == null) {
				System.out.println("List Is Empty");
			}
			else {
				while(current!=null) {
					if(current.data<min) {
						min = current.data ;
					}
					current = current.next ;
				}
				System.out.println("Minimum Node In The Linked Is: "+min);
			}
		}
		//Finding The Maximum Node From The List
		public void maxNode() {
					Node current = head ;
					int max  =head.data ;
					if(head == null) {
						System.out.println("List Is Empty");
					}
					else {
						while(current!=null) {
							if(current.data>max) {
								max = current.data ;
							}
							current = current.next ;
						}
						System.out.println("Maximum Node In The Linked Is: "+max);
					}
				}
		//Finding Or Searching The Node In The Linked List
		public void searchNode(int data) {
			Node current = head ;
			boolean flag = false ;
			int position = 1 ;
			//Checking Whether The Linked List Is Empty
			if(head == null) {
				System.out.println("List Is Empty");
			}
			else {
				while(current!=null) {
					if(current.data==data) {						
						flag = true ;
						break ;
					}
				position ++ ;
				current = current.next ;
				}
			}
			if(flag) {
				System.out.println(data+" Is Found At Position "+position);
			}
			else {
				System.out.println(data+" Is Not Found In The List");
			}
		}
		//Deleting The Duplicate Nodes From The List
		public void delDulicate() {
			Node current = head ;
			Node temp , index ;
			//Checking Whether The List Is Empty
			if(head == null) {
				System.out.println("List Is Empty");
			}
			else {
				while(current!=null) {
					temp = current ;
					index = current.next ;
					//Inner While For Comparison
					while(index!=null) {
						if(current.data == index.data) {
							temp.next = index.next ;
						}
						else {
							temp = index ;
						}
						index = index.next ;
					}
					current = current.next ;
				}
			}
		}
		//Adding A New Node At The Beginning Of The Linked List
		public void addStart(int data) {
			Node temp ;
			Node newNodeStart = new Node(data);
			//Checking Whether The List Is Empty
			if(head == null) {
				head = newNodeStart ;
				tail = newNodeStart ;
			}
			else {
				temp = head ;
				head = newNodeStart ;
				head.next = temp ;
			}
		}
		//Adding A New Node At The End Of The Linked List
		public void addEnd(int data) {
					Node newNodeEnd = new Node(data);
					//Checking Whether The List Is Empty
					if(head == null) {
						head = newNodeEnd ;
						tail = newNodeEnd ;
					}
					else {
						tail.next = newNodeEnd ;
						tail = newNodeEnd ;
					}
				}
		//Adding A Node At The Middle Of The Linked List
		public void addMiddle(int data) {
			Node addAtMid = new Node(data) ;
			if(head == null) {
				head = addAtMid ;
				tail = addAtMid ;
			}
			else {
				Node current , temp ;
				temp = head ;
				current  = null ;
				int count  = (size%2==0)?size/2:(size+1)/2;
				for (int i =0 ; i<count ; i++) {
					current = temp ;
					temp = temp.next ;
				}
				current.next = addAtMid ;
				addAtMid.next = temp ;
			}
			size++ ;
		}
}
public class program1 {
	//Creating The Class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating The instance of the class 
		SinglyLinkedList obj = new SinglyLinkedList();
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(4);
		obj.addNode(5);
		obj.addNode(3);
		obj.addNode(4);
		obj.addNode(5);
		obj.display();
		//Deleting  The Node From Beginning Of The List
//		obj.delStart();
		//Deleting The Node From End Of The Linked List
//		obj.delEnd();
		//Deleting The Node from the Middle Of Linked List
//		obj.delMiddle();
		//Reversing The Linked List
//		obj.reverseList(obj.head);
		//Finding The Minimum Node In The List
//		obj.minNode();
		//Finding The Maximum Mode In The List
//		obj.maxNode();
		//Searching The Element In The Linked List
//		obj.searchNode(4);
		//Deleting The Duplicate Nodes From Linked List
//		obj.delDulicate();
		//Add The Node In The Beginning Of The Linked List
//		obj.addStart(9);
		//Add The Node At End Of Linked List
//		obj.addEnd(9);
		//Adding A Node At The Middle Of The Linked List
//		obj.addMiddle(10);
		obj.display();
	}

}
