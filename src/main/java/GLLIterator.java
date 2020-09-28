import java.util.Iterator;

public class GLLIterator<E> implements Iterator<E> {
	GenericLinkedList<E>.Node head;
//	GenericLinkedList<E> Glist;
//	int i=0;
	GLLIterator(GenericLinkedList<E>.Node head){
		this.head=head;

	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(head!=null) {
			return true;
		}
		return false;	
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		if(hasNext()) {



			E res=head.data;
			head=head.next;
			return res;
//			E data1 = curr.data;
//			curr=curr.next;
////			i++;
//			return data1;
		}
		return null;
	}
}
