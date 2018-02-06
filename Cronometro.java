package dia2;
import java.util.Arrays;

import dia1.Application;

public class Cronometro {

	public static void main(String[] args) {
		
//		cronometroContains();
		cronometroCArrayList();
		
	}
	
	private static void cronometroCArrayList() {
		Integer temp[] = Application.random((Integer) 10000000, (Integer)100);
		CArrayList<Integer> vetor = new CArrayList<Integer>();
		CArrayList<Integer> vetorUnico = new CArrayList<Integer>();
		
		for (int i = 0; i < temp.length; i ++) {
			vetor.add(temp[i]);
		}
		
		long time = System.currentTimeMillis();
		for (int i = 0; i < vetor.size(); i++) {
			if(!vetorUnico.contains(vetor.elementAt(i))) {
				vetorUnico.add(vetor.elementAt(i));
			}
		}
		time = System.currentTimeMillis() - time;
		System.out.println(time);
	}

	private static void cronometroContains() {
		int[] vetorInsert = Application.random(1000000, 1000);
		Arrays.sort(vetorInsert);
//		Sorts.inserctionSort(vetorInsert);
		
		System.out.println("Linear");
		long time = System.currentTimeMillis();
		int t[] = Application.random(10000, 1000);
		for (int i = 0; i < t.length; i++) {
			Estruturas.contains(vetorInsert, t[i]);
		}
		time = System.currentTimeMillis() - time;
		System.out.println(time);
		
		System.out.println("Logaritmica");
		time = System.currentTimeMillis();
		for (int i = 0; i < t.length; i++) {
			Estruturas.containsBinario(vetorInsert, t[i]);
		}
		time = System.currentTimeMillis() - time;
		System.out.println(time);
	}

}
