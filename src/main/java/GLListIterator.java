import java.util.ListIterator;

public class GLListIterator<E> implements ListIterator<E> {
	GenericLinkedList<E>.Node curr;
	GenericLinkedList<E> Glist;
	int index;
	public GLListIterator(int i,GenericLinkedList<E>.Node curr,GenericLinkedList<E> Glist){
		this.curr=curr;
		this.Glist=Glist;
		index=i;
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



			E data1 = curr.data;
			curr=curr.next;



			return data1;
		}
		return null;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		if(curr.prev!=null) {
			return true;
		}
		return false;
	}

	@Override
	public E previous() {
		// TODO Auto-generated method stub
		if(hasPrevious()) {
			E data1 = curr.data;
			curr=curr.prev;
//			nextindex--;nextindex
			return data1;
		}
		return null;
	}

	@Override
	public int nextIndex() {
		// TODO Auto-generated method stub
		
		return index+1;
	}

	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		
		return index-1;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}

	@Override
	public void set(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(E e) {
		// TODO Auto-generated method stub
		
	}

	
}
