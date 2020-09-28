import java.util.Iterator;

public class ReverseGLLIterator<E> implements Iterator<E> {
	GenericLinkedList<E>.Node curr;
//	GenericLinkedList<E>Glist;
	public ReverseGLLIterator(GenericLinkedList<E>.Node tail){
//		curr=Glist.gethead();
//		while(curr.next!=null) {
//			curr=curr.next;
//		}
		this.curr=tail;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(curr!=null) {
			return true;
		}
		return false;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		if(hasNext()) {

			E res=curr.data;
			curr=curr.prev;
			return res;
		}
		return null;
	}

	

	

}
