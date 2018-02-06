package dia2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesCLinkedList {

	@Test
	void test() {
		CLinkedList<Integer> lista = new CLinkedList<Integer>();
		
		
		lista.add((Integer) 452);
		assertTrue(lista.contains((Integer) 452));
		
		lista.add((Integer) 45);
		assertTrue(lista.contains((Integer) 45));
		
		lista.add((Integer) 21, 5);
		assertTrue(lista.contains((Integer) 21));
		
		lista.add((Integer) 52, 2);
		assertTrue(lista.contains((Integer) 52));
		
		assertEquals(4, lista.size());
		
		lista.remove((Integer) 21);
		assertFalse(lista.contains((Integer) 21));
		
		lista.remove(0);
		assertFalse(lista.contains((Integer) 452));
		
		lista.remove(1);
		assertFalse(lista.contains((Integer) 52));
	}

}
