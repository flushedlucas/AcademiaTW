package dia2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesCArrayList {

	@Test
	public void teste() {
		CArrayList<Integer> vetor = new CArrayList<Integer>();
		Integer inteiro1 = 5;
		Integer inteiro2 = 7;
		Integer inteiro3 = 9;
		Integer inteiro4 = 13;
		Integer inteiro5 = 21;
		
		assertTrue(vetor.size() == 0);
		
		vetor.add(inteiro1);
		assertTrue(vetor.size() == 1);
		
		vetor.add(inteiro2);
		assertTrue(vetor.size() == 2);
		
		vetor.add(inteiro3, 1);
		assertTrue(vetor.size() == 3);
		
		vetor.add(inteiro4, 4);
		assertTrue(vetor.size() == 4);
		
		vetor.add(inteiro5);
		assertTrue(vetor.size() == 5);
		
		assertTrue(vetor.contains(inteiro5));
		assertTrue(vetor.contains(inteiro2));
		assertFalse(vetor.contains((Integer) 6));
		
		vetor.remove(inteiro3);
		assertFalse(vetor.contains(inteiro3));
		
	}
}
