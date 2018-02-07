package dia3_lucas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class testIterator {

	@Test
	void test() {
		CLinkedList<Integer> lista = new CLinkedList<Integer>();
		
		
		lista.add((Integer) 42);
		
		lista.add((Integer) 23);
		
		lista.add((Integer) 52);
		
		Iterator<Integer> iter = lista.iterator();
		
		Integer soma = 0;
		
//		for(Integer i : lista) {
//			System.out.println(i);
//		}
		
		while(iter.hasNext()) {
			soma += iter.next();
			System.out.println(soma);
			
		}
		Integer media = soma/lista.size();
		System.out.println(media);
		
		assertEquals((Integer)117, soma);
		assertEquals((Integer) 39, media);
	}

}
