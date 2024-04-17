package Lab33;
class Node{
	int data;   //data
	Node next;  //reference
	
	Node(int data){
		this.data=data;
		this.next=next;
	}
}
public class LinkedList{
	Node head;  
	int size;
	LinkedList(){
		this.head=null;
		this.size=0;
	}
	void insertend(int data){
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	void printElements() {
		Node i;
		for(i=head;i!=null;i=i.next) {
			System.out.print(i.data+"->");
		}
        System.out.println(" ");

	}
	void reverse() {
		Node prev = null;
        Node i = head;
        Node next = null;
        while (i!=null) {
            next = i.next;
            i.next = prev; 
            prev = i; 
            i = next;
        }
        head = prev;
    }
	public static void main(String[] args) {
		LinkedList sl=new LinkedList();
		sl.insertend(14);
		sl.insertend(64);
		sl.insertend(73);
		sl.insertend(31);
		System.out.println("Original Linked List: ");
        sl.printElements();
        System.out.println("Reversed Linked List: ");
        sl.reverse();  
        sl.printElements();

		
	}
	
}

/*
Original Linked List: 
14->64->73->31-> 
Reversed Linked List: 
31->73->64->14-> 
*/
