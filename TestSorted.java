package academia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSorted {

	@Test
	void testSorted() {
		int teste1[] = {1, 2, 3, 4};
		int teste2[] = {2, 3, 1, 4};
		
		boolean b = Sorts.isSorted(teste1);
		assertTrue(b);
		boolean x = Sorts.isSorted(teste2);
		assertFalse(x);
	}
	
	@Test
	void testRandom() {
		int n = 5;
		int min = 5;
		int max = 10;
		int[] vetorTeste = Application.random(n, max);
		
		for (int i = 0; i < vetorTeste.length; i++) {
			assertTrue(vetorTeste[i] <= max);
		}
		
		Integer[] vetorIntervalo = Application.random(n, min, max);
		for (int i = 0; i < vetorIntervalo.length; i++) {
			assertTrue(vetorIntervalo[i] <= max && vetorIntervalo[i] >= min);
		}
	}

	@Test
	void testMaximo() {
		int vetor[] = {1, 5, 6, 7, 3, 1, 9};
		
		assertEquals(9, Sorts.maximo(vetor));
	}
	
	@Test
	void testInserctionSort() {
		Integer vetorOrdenado[] = {1, 3, 5, 6, 7, 9};
		Integer vetor[] = {1, 5, 6, 7, 3, 9};
		
		InserctionComparator comp = new InserctionComparator();
		
		Sorts.inserctionSort(vetor, comp);
		
		assertArrayEquals(vetorOrdenado, vetor);
	}
	
	@Test
	void testSelectionSort() {
		Integer vetorOrdenado[] = {1, 3, 5, 6, 7, 9};
		Integer vetor[] = {1, 5, 6, 7, 3, 9};
		
		SelectionComparator comp = new SelectionComparator();
//		Sorts.selectionSort(vetor);
		Sorts.selectionSort(vetor, comp);
		assertArrayEquals(vetorOrdenado, vetor);
	}
	
}
