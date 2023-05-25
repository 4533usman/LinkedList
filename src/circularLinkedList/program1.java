package circularLinkedList;
//Creating The class Linked List 
class circularLinkedList {
	//Creating The Class Node 
	class Node {
		//
		int data ;
		Node next ;
		//Creating The Constructor Of The Class
		public Node(int data) {
			this.data = data ;
		}
	}
	// Declaring The Nodes Head Tail 
	public Node head = null ;
	public Node tail = null ;
	public  int size =0 ;
	//Creating The Method For AddIng The Nodes In The Linked List
	public void addNode(int data) {
		//Creating The Object OF The Node Class
		Node newNode = new Node(data) ;
		//Checking Whether The Linked List Is Empty 
		if(head == null) {
			head = newNode ;
			tail = newNode ;
			newNode.next = head ;
		}
		else {
			tail.next = newNode ;
			tail = newNode ;
			newNode.next = head ;
		}
		size++ ;
	}
	//Creating The Method For Displaying The Node In The Linked List
	public void display () {
		Node current = head ;
		//Checking Whether The List Is Empty
		if(head == null) {
			System.out.println("Linked List Is Empty");
		}
		else {
			System.out.println("Node Of The Circular Linked List Are");
			do {
				System.out.print(current.data+" ");
				current = current.next ;
			}while(current!=head);
		}
		System.out.println();
	}
	//Creating A Method To Delete A Node From The Beginning Of The Linked List
	public void delStart() {
		//Checking Whether The Linked List is Empty
		if(head == null) {
			System.out.println("Linked List Is Empty");
			return ;
		}
		else {
			if(head!=tail) {
				head = head.next ;
				tail.next = head ;
			}
			else {
				head = tail = null ;
			}
		}
		
	}
	//Creating A Method To Delete A Node From The End Of The Linked List
	public void delEnd() {
		if(head == null) {
			System.out.println("Linked List Is Empty");
			return ;
		}
		else {
			if(head!=tail) {				
				Node current = head ;
//				System.out.println(current.data);
				while(current.next!=tail) {
					current = current.next ;
				}
//				System.out.println(current.data);
				tail = current ;
				tail.next = head ;
			}
			else {
				head = tail = null ;
			}
		}
		
	}
	//Deleting The Node From The Mid Of The Linked Or Deleting The Middle Node Of The Linked list  
	public void delMid() {
		//checking Whether The Liked List Is Empty
		if(head == null ) {
			System.out.println("Linked List Is Empty");
		}
		else {
			Node temp ,current ;
			temp = head ;
			current = null ;
			int count = (size%2==0)?size/2:(size+1)/2;
			//Finding The Middle Node Which IS To Be Deleted
			if(head!=tail) {
			for(int i=0 ; i<count-1 ; i++) {
				current = temp ;
				temp = temp.next ;
			}
			//Checking Whether Current Is Point To Null
			if(current!=null) {
				current.next = temp.next ;
				temp = null ;
			}
			else {
				head = tail = temp.next ;
				tail.next = head ;
				temp = null ;
			}
		}
		else {
			head = tail = null ;
		}
	}
}
	//Adding A Node At The Beginning OF LInked List
	public void addStart(int data) {
		//Creating The Object Of The Class Node 
		Node addatStart = new Node(data);
		//Checking Whether The List Is Empty
		if(head==null) {
			head = addatStart ;
			tail = addatStart ;
			tail.next = head ;
		}
		else {
			Node temp = head ;
			addatStart.next = temp ;
			head  = addatStart ;
			tail.next = head ;
		}
	}
	//Adding The Node At The End Of The Linked List 
	public void addEnd(int data) {
		Node addatEnd = new Node(data);
		//Checking Whether The Linked List Is Empty
		if(head == null ) {
			head  = addatEnd ;
			tail  = addatEnd ;
			tail.next = head ;
		}
		else {
			tail.next = addatEnd ;
			tail = addatEnd ;
			tail.next = head ;
		}
	}
	//Adding The New Node At The Middle Of The Linked List
	public void addMid(int data) {
		Node addatMid = new Node(data) ;
		if(head == null) {
			head = addatMid ;
			tail = addatMid ;
			tail.next = head ;
		}
		else {
			Node current ,temp ;
			temp = head ;
			current = null ;
			int count = (size%2==0)?size/2:(size+1)/2 ;
			for (int i=0 ; i<count;i++) {
				current  = temp ;
				temp = temp.next ;
			}
			current.next = addatMid ;
			addatMid.next = temp ;
			temp = null;
		}
		size++ ;
	}
	//Creating A Method For Finding The Maximum Value In The Linked
	public void maxValue() {
		if(head == null) {
			System.out.println("Linked List Is Empty");
		}
		else {
			Node current  = head ;
			int max = head.data ;
			do {
				if(current.data>max) {
					max= current.data ;
				}
				current = current.next ;
			}while(current!=head);
			System.out.println("Maximum Value In The Linked List Is: "+ max);
		}
	}
	//Creating A Method For Finding The Minimum Value In The Linked
	public void minValue() {
			if(head == null) {
				System.out.println("Linked List Is Empty");
			}
			else {
				Node current  = head ;
				int min = head.data ;
				do {
					if(current.data<min) {
						min= current.data ;
					}
					current = current.next ;
				}while(current!=head);
				System.out.println("Minimum Value In The Linked List Is: "+ min);
			}
		}
	//Finding The Value In The Linked List
	public void searchList(int data) {
		boolean flag =false ;
		int Position =1 ;
		Node current = head ;
		if(head == null) {
			System.out.println("List Is Empty");
		}
		do {
			if(current.data==data){
				flag=true;
				break ;
			}
			current = current.next ;
			Position++ ;
		}while(current!=head);
		if(flag) {
			System.out.println(data+" Is Found In The Linked List At Position "+Position);
		}
		else {
			System.out.println(data+" Is Not Found In The Linked List At Position "+Position);
		}
	}
	//Reverse the Circular Linked List
	public void reverseList(Node current) {
		if(current.next == head ) {
			System.out.print(" "+current.data);
			return ;
		}
		reverseList(current.next);
		System.out.print(" "+current.data);
	}
	//Removing Duplicate From The Linked List
	public void removeDuplicate() {
		Node current  = head, temp = null , index = null ;
		if(head == null) {
			System.out.println("Linked List Is Empty");
		}
		else {
			do {
				temp = current ;
				index = current.next ;
				while(index!=head){
					if(current.data == index.data) {
						temp.next = index.next ;
					}
					else {
						temp = index ;
					}
					index = index.next ;
				}
				current = current.next ;
			}while(current.next!=head);
		}
	}
}
public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating The Object Of The Class CircularLinkedList
		circularLinkedList obj = new circularLinkedList();
		//Adding The Nodes In The Linked List
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(4);
		obj.addNode(2);
		obj.addNode(3);
		//Displaying The Nodes In The Linked List
		obj.display();
		//Deleting The Node From The Beginning Of The Linked List
//		obj.delStart();
		//Deleting The Node From The End OF The Linked List
//		obj.delEnd();
		//Deleting The Node From The Mid Of The Linked List
//		obj.delMid();
		//Adding A Node At The Beginning Of The Linked List
//		obj.addStart(5);
		//Adding The Node At The End OF Linked List
//		obj.addEnd(5);
		//Adding The Node At Mid Of THe Linked List
//		obj.addMid(5);
		//Finding The Maximum value In The Linked List
//		obj.maxValue();
		//Finding The Minimum Value In The Linked List
//		obj.minValue();
		//Searching The Node In The Linked List
//		obj.searchList(3);
		//Reversing The Linked List 
//		obj.reverseList(obj.head);
		//Removing The Duplicate From The Linked List
		obj.removeDuplicate();
		//Displaying The Nodes In The Linked List
		obj.display();
//		System.out.println(obj.size);

	}

}

