package dia3_lucas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesHashSet {

	CHashSet<Integer> hash = new CHashSet<Integer>();

	@Test
	void test() {

		hash.add(25);
		assertEquals(1, hash.size());

		hash.add(32);
		assertEquals(2, hash.size());

		hash.add(65);
		assertEquals(3, hash.size());

		hash.add(21);
		assertEquals(4, hash.size());
	}

	void testUnion() {
		Integer tabelaA[] = { 27, 56, 87, 96, 32, 15, 24, 93 };
		Integer tabelaB[] = { 23, 58, 81, 98, 34, 19, 22, 99 };

		CHashSet<Integer> hash2 = new CHashSet<Integer>();

		for (int i = 0; i < tabelaA.length; i++) {
			hash.add(tabelaA[i]);
			hash2.add(tabelaB[i]);
		}

		hash.union(hash2);
		assertTrue(hash.contains(99));
		assertEquals(16, hash.size());

	}

	void testUnionRepetido() {
		Integer tabelaA[] = { 27, 56, 87, 96, 32, 15, 24, 93 };
		Integer tabelaB[] = { 23, 58, 81, 96, 32, 19, 22, 99 };

		CHashSet<Integer> hash2 = new CHashSet<Integer>();

		for (int i = 0; i < tabelaA.length; i++) {
			hash.add(tabelaA[i]);
			hash2.add(tabelaB[i]);
		}

		hash.union(hash2);
		assertTrue(hash.contains(99));
		assertEquals(14, hash.size());
	}

}
