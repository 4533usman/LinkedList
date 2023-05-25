package doublyLinkedList;
class doublyLinkedList{
	class Node {
		int data ;
		Node previous ,next ;
		public Node (int data) {
			this.data = data ;
		}
	}
	public Node head , tail = null ;
	public int count=0 ;
	//Method For adding The New Node In The Linked List
	public void addNode (int data) {
		Node newNode = new Node(data) ;
		if(head == null) {
			head = tail = newNode ;
			tail.next = null ;
			head.previous = null ;
		}
		else {
			tail.next = newNode ;
			newNode.previous = tail ;
			tail = newNode ;
			tail.next = null ;
		}
		count++ ;
	}
	//Displaying The Nodes OF The DoublyLinkedList
	public void display() {
		Node current = head ;
		if(head == null) {
			System.out.println("DLL Is Empty");
			return ;
		}
		else {
			while(current!=null) {
				System.out.print(current.data+" ");
				current = current.next ;
			}
		}
	}
	//Method For Delete The Node From The Beginning Of The DLL
	public void delStart() {
		//Checking Whether The Linked List Is Empty Or not
		if(head == null) {
			System.out.println("DLL Is Already Empty. No Node To Display");
		}
		else {
			if(head!=tail) {
				head = head.next ;
				head.previous = null ;
			}
			else {
				head = tail = null ;
			}
		}
		count-- ;
	}
	//Deleting a Node From The End Of The Doubly Linked List
	public void delEnd() {
		//Checking Whether The Linked List Is Empty
		if(head==null) {
			System.out.println("Linked List Is Empty.No To Display");
		}
		else {
			if(head!=tail) {
				tail = tail.previous ;
				tail.next = null ;
			}
			else {
				head = tail = null ;
			}
		}
		count-- ;
	}
	//Java Program To Delete A Node From The Middle OF Doubly Linked List
	public void delMid() {
		if(head == null) {
			return ;
		}
		else {
			Node current = head ;
			int mid = (count%2==0)?count/2:(count+1)/2;
			//Iterating Through The Linked List For Finding The Mid Of The Linked List
			for(int i =0 ; i<mid-1 ; i++) {
				current = current.next ;
			}
			if(current == head ) {
				head = current.next;
			}
			else if(current == tail) {
				tail = tail.previous ;
			}
			else {
				current.previous.next = current.next ;
				current.next.previous = current.previous ;
			}
			current = null ;
		}
		count-- ;
	}
	//Finding The Minimum and Maximum Node In The DLL
	public void minSearch() {
		int min = head.data ;
		Node current  = head ;
		if(head == null) {
			System.out.println("DDL IS Empty");
		}
		else {
			while(current != null) {
				if(current.data<min) {
					min = current.data ;
				}
				current = current.next ;
			}
		}
		System.out.println(min+" Is The Minimum Element In The Linked List");
	}
	//Finding The Maximum and Maximum Node In The DLL
	public void maxSearch() {
		int max = head.data ;
		Node current  = head ;
		//For Maximum
		while(current!=null){
			if(current.data>max) {
				max = current.data ;
			}
			current = current.next ;
		}
		System.out.println(max+" Is The Maximum Element In The Linked List");	
	}
	//Searching The Element From The DLL
	public void searchNode(int data) {
		if(head == null) {
			System.out.println("DDL Is empty");
			return ;
		}
		else {
			Node current = head ;
			boolean flag = false ;
			while(current !=null) {
				if(current.data == data) {
					flag = true ;
				}
				current = current.next ;
			}
			if(flag){
				System.out.println(data+ " Is Found In The Linked List");
			}
			else {
				System.out.println(data+ " Is Not Found In The Linked List");				
			}
		}
		
	}
	//Insert A New Node At The Beginning Of The Doubly Linked List
	public void addStart(int data) {
		Node addstart = new Node(data);
		if(head == null) {
			head = tail =  addstart ;
			head.previous = null ;
			tail.next = null ;
			
		}
		else {
			addstart.next = head ;
			head.previous = addstart ;
			head = addstart ;
			head.previous = null ;
		}
		count++ ;
	}
	//Adding a New Node At The End Of DLL
	public void addEnd(int data) {
		Node addend = new Node(data);
		if(head == null) {
			head = tail = addend ;
			head.previous = null ;
			tail.next = null ;
		}
		else {
			tail.next = addend ;
			addend.previous = tail ;
			tail = addend ;
			tail.next = null ;
		}
		count++ ;
	}
	//Add A New Node At The Middle Of The DLL
	public void addMid(int data) {
		Node addmid = new Node(data);
		if(head == null) {
			head = tail = addmid ;
			head.previous = null; 
			tail.next = null;
		}
		else {
			Node current  = head , temp = null ;
			int size = (count%2==0)? count/2:(count+1)/2 ;
			//Finding The Mid Of DLL
			for(int i = 0 ; i<size-1 ;i++ ) {
				current  = current.next ;
			}
			temp = current.next ;
			temp.previous = current ;
			current.next = addmid ;
			addmid.previous = current ;
			addmid.next = temp ;
			temp.previous = addmid ;
		}
		count++ ;
	}
}
public class program1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doublyLinkedList obj = new doublyLinkedList();
		//Adding The Node In THe DLL
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(4);
		obj.addNode(0);
		obj.addNode(5);
		//Deleting The Node From The Beginning OF The Linked List
//		obj.delStart();
		//Deleting A Node From End Of The Linked List
//		obj.delEnd();
		//Deleting a Node From The Middle Of The DLL 
//		obj.delMid();
		//Searching The Minimum Element In The Linked List 
//		obj.minSearch();
		//Searching The Maximum Node From The DLL
//		obj.maxSearch();
		//Searching The Node From The DLL
//		obj.searchNode(0);
		//Adding A New Node At The Beginning Of The DLL
//		obj.addStart(10);
		//Adding A Node At The End Of DLL
//		obj.addEnd(12);
		//Adding A new Node at The Middle Of DLL
		obj.addMid(10);
		//Displaying The Nodes Of DLL
		obj.display();
	}

}
