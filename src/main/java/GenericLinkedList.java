//import java.util.Iterator;

public class GenericLinkedList<T> implements Iterable<T> {
	private Node head;
	private int length;
	class Node{
		T data;
		Node next; 
		Node prev;
		public Node(T val) {
			// sets data equal to val1
			data=val;
		}
	}
	public GenericLinkedList(T val) {
		head=new Node(val);
		length=1;
	}
	public void addFirst(T e) {
		Node temp=head;
		 head = new Node(e);
		 temp.prev=head;
		 head.next=temp;
		    length++;
	}
	public void addLast(T e) {
		length++;
		Node ele=new Node(e);
		Node curr=head;
		if(curr==null){
			head=ele;

			return;
		}
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=ele;
		ele.prev=curr;
//		length++;
	}
	public int size( ) {
		return length;
	}
	public boolean contains(T e) {
		Node curr=head;
		while(curr!=null) {
			if(curr.data==e) {
				return true;
			}
			curr=curr.next;
		}
		return false;
	}
	public boolean remove(T e) {

		Node curr=head;
		if(length==0)  return  false;
		do{
			if(curr.data==e){
				Node prev=curr.prev;
				Node next=curr.next;
				if(prev==null && next==null){
					head=null;
					length-=1;
					return true;
				}
				else if(prev==null){
					removeHead();
					length-=1;
					return true;
				}else if(next==null){
					removeTail();
					length-=1;
					return true;
				}else{
					prev.next=next;
					next.prev=prev;
					length-=1;
					return  true;
				}
			}
			curr=curr.next;
		}while(curr.next!=null);
//		while(curr!=null) {
//			if(curr.data==e) {
//				(curr.prev).next=curr.next;
//				length--;
//				return true;
//			}
//			curr=curr.next;
//		}
		return false;
	}
	public void clear( ) {
		head=null;
//		Node temp=null;
//		while(head!=null) {
//		 temp=head.next;
//		 head=null;
//		 head=temp;
//		}
		length=0;
		
	}
	public T get(int index) {
		int i= index;
		Node curr=head;
		if(i>=length) {
			return null;
		}
		while(i!=0) {
			curr=curr.next;
			i--;
		}
		return curr.data;
	}
	public T set(int index, T element){
		int i= index;
		Node curr=head;
		T temp=null;
		if(i>length) {
			return null;
		}
		while(i!=0) {
			curr=curr.next;
			i--;
		}
		temp=curr.data;
		curr.data=element;
		return temp;
	}
	public T removeHead() {
		Node temp=null;
		T data1=head.data;
		temp=head.next;
		head=temp;
		length--;
		return data1;
		
	}
	public T removeTail() {
		Node curr=head;
		while(curr.next!=null){
			curr=curr.next;
		}
		curr.prev.next=null;
		length-=1;
		return  curr.data;
//		int i=0;
//		Node curr=head;
//		T data1;
//		while(i<=length) {
//			curr=curr.next;
//			i++;
//		}
//		data1=curr.data;
//		(curr.prev).next=null;
//		return data1;
	}
	public Node gethead() {
		return head;
	}
	 
	public GLListIterator<T> listIterator( int index){


		return new GLListIterator<T>(index,head,this);
	}
	
	public ReverseGLLIterator<T> descendingIterator(){
		Node tail=head;
		while (tail.next!=null){
			tail=tail.next;
		}
		return new ReverseGLLIterator<T>(tail);
	}
	
	public GLLIterator<T> iterator() {
		return new GLLIterator<T>(head);
	}
	

	

}

