package dia3_lucas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesCMap {
	 CMap<Integer, String> table = new CMap<Integer, String>();
	 
	@Test
	void test() {
		table.put(7, "Primeiro");
		assertTrue(table.containsKey(7));
		assertEquals(1, table.size());
		
		table.put(9, "Segundo");
		assertTrue(table.containsKey(9));
		assertEquals(2, table.size());

		table.put(21, "Terceiro");
		assertTrue(table.containsKey(21));
		assertEquals(3, table.size());
		
		table.put(73, "Quarto");
		assertTrue(table.containsKey(73));
		assertEquals(4, table.size());
		
		table.put(87, "Quinto");
		assertTrue(table.containsKey(87));
		assertEquals(5, table.size());
		
		table.put(7, "Quinto");
		assertTrue(table.containsKey(7));
		assertEquals(5, table.size());
		
		table.remove(7);
		assertTrue(table.containsKey(7));
		assertEquals(4, table.size());
		
		assertEquals("Quinto", table.get(87));
		
		table.clear();
		assertEquals(0, table.size());
	}
	
	@Test
	void testReHash() {
		
	}

}
