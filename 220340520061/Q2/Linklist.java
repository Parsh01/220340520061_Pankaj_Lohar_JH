import java.util.Scanner;
//Question_02

class Node{
	int data;
	Node next;
}
class Linklist{
	Node head;
	
	Linklist(){
		head = null;
	}
	
		void insert(int a){
		Node B = new Node();
		B.data = a;
		B.next = null;
			if(head==null){
			head = B;
			}else{
			Node temp = new Node();
			temp = head;
			while(temp.next !=null)
				temp=temp.next;
				temp.next =B;
		}
	}
	
	void reverseList(){
		if(this.head !=null){
		Node A = this.head;
		Node tempNode =this.head;
		Node Curr =this.head.next;
		A.next =null;
		while(Curr != null){
		tempNode = Curr.next;
		Curr.next =A;
		A = Curr;
		Curr = tempNode;
		
		}
		 this.head = A;
		}
	}
	
	void Display(){
		Node temp = new Node();
		temp = this.head;
		if(temp != null){
			System.out.println("The List contains:" );
			
			while(temp != null){
				System.out.println(temp.data+" ");
				temp = temp.next;
				
			}
			System.out.println();
		}else{
			System.out.println("The List is Empty");
		}
		
	}
	
	public static void main(String[] args){
		Linklist List = new Linklist();
		
		List.insert(2);
		//List.insert(5);
		//List.insert(1);
		List.insert(4);
		List.insert(3);
		List.insert(4);
		List.insert(2);
		List.insert(5);
		
		List.Display();
		List.reverseList();
		List.Display();
	}
}