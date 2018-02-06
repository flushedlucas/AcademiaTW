package dia2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testes {

	@Test
	void testContainsBinario() {
		int vetor[] = {1 , 3, 5, 7, 8, 9, 10, 14, 15, 20, 32, 33};
		
		boolean resposta = Estruturas.containsBinario(vetor, 32);
		
		assertTrue(resposta);
		assertFalse(Estruturas.containsBinario(vetor, 70));
	}
}
