import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GenericLinkedListTest {
	static GenericLinkedList<Integer> list1;
	@BeforeAll
	static void setup() {
		list1=new GenericLinkedList<Integer>(1);
	}
	@Test
	@Order(1)
	void constructorTest(){
		assertEquals(1,list1.size()," length wrong");
		assertEquals(1,list1.get(0)," data wrong");
	}
	@Test
	@Order(2)
	void getTest() {
		assertEquals(1,list1.get(0)," get wrong");
	}
	@Test
	@Order(3)
	void sizeTest() {
		assertEquals(1,list1.size()," size wrong");
	}
	@Test
	@Order(4)
	void addLastTest() {
		list1.addLast(2);
		assertEquals(1,list1.get(0)," add wrong");
		assertEquals(2,list1.get(1)," add wrong");
		assertEquals(2,list1.size()," length wrong");
		
	}
	@Test
	@Order(5)
	void addFirstTest() {
		list1.addFirst(0);
		assertEquals(0,list1.get(0)," add wrong");
		assertEquals(1,list1.get(1)," add wrong");
		assertEquals(3,list1.size()," length wrong");
	}
	@Test
	@Order(6)
	void containsTest() {
		list1.addLast(2);
		list1.addLast(3);
		assertEquals(true,list1.contains(2)," contains wrong");
		assertEquals(false,list1.contains(4)," contains wrong");
	}
	@Test
	@Order(7)
	void removeTest() {
		list1.addLast(2);
		list1.addLast(3);
		assertEquals(true,list1.remove(2)," remove wrong");
		assertEquals(1,list1.get(1)," remove wrong");
		assertEquals(false,list1.remove(4)," contains wrong");
	}
	@Test
	@Order(8)
	void clearTest() {
		list1.addLast(2);
		list1.addLast(3);
		list1.clear();
		assertEquals(null,list1.get(0),"clear wrong");
		assertEquals(0,list1.size(),"clear wrong");	
	}
	@Test
	@Order(9)
	void setTest() {
		list1.addLast(2);
		assertEquals(2,list1.set(0, 4),"set wrong");
	}
	@Test
	@Order(10)
	void removeHeadTest() {
//		list1.addLast(2);
		list1.addLast(3);
		assertEquals(4,list1.removeHead(),"removeHead wrong");
		assertEquals(3,list1.get(0),"removeHead wrong");
	}
	@Test
	@Order(11)
	void removeTail() {
//		list1.addLast(2);
//		list1.addLast(3);
		assertEquals(3,list1.removeTail(),"removeTail wrong");
//		assertEquals(3,list1.get(2),"removeTail wrong");
	}

	@Test
	@Order(13)
	void GLLIteratorTest() {
//		list1.addLast(2);
//		list1.addLast(3);
		list1.clear();
		list1.addLast(1);
		list1.addLast(2);
		list1.addLast(3);

		int t[]={1,2,3};
		int k=0;
		GLLIterator<Integer> iter1  = list1.iterator();
		while(iter1.hasNext()) {
			int i=iter1.next();
			assertEquals(t[k++],i,"GLList wrong");

		}
	}
	@Test
	@Order(13)
	void ReverseGLLIteratorTest() {
//		list1.addLast(2);
//		list1.addLast(3);
		list1.clear();
		list1.addLast(1);
		list1.addLast(2);
		list1.addLast(3);

		int t[]={3,2,1};
		int k=0;
		ReverseGLLIterator<Integer> iter1  = list1.descendingIterator();
		while(iter1.hasNext()) {
			int i=iter1.next();
			assertEquals(t[k++],i,"GLList wrong");

		}
	}
	
	
	
	
	
	
	
}
