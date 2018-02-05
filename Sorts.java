package academia;

import java.util.Comparator;

public class Sorts {
	
	public static void main(String[] args) {
		int teste1[] = {1, 2, 3, 4};
		int teste2[] = {2, 3, 1, 4};
		System.out.println(isSorted(teste1));
		System.out.println(isSorted(teste2));
	}

	public static boolean isSorted(int[] v) {
		boolean b = true;
		
		for (int i = 0; i < (v.length - 1) && b; i++) {
			if (v[i] > v[i+1]) {
				b = false;
			}
		}		
		return b;
	}
	
	public static int maximo(int[] vetor) {
		int maximo = vetor[0];
		
		for (int i = 1; i < vetor.length; i++) {
			if(vetor[i] > maximo) {
				maximo = vetor[i];
			}
		}
		return maximo;
	}
	
	public static int minimo(int[] vetor) {
		int minimo = vetor[0];
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < minimo) {
				minimo = vetor[i];
			}
		}
		return minimo;
	}
	
	public static void swap(int indice1, int indice2, int[] vetor) {
		if(indice1 != indice2) {
			int aux = vetor[indice1];
			vetor[indice1] = vetor[indice2];
			vetor[indice2] = aux;
		}
	}
	
	private static <T> void swap(int indice1, int indice2, T[] vetor) {
		if(indice1 != indice2) {
			T aux = vetor[indice1];
			vetor[indice1] = vetor[indice2];
			vetor[indice2] = aux;
		}		
	}
	
	public static void inserctionSort(int[] vetor){
		if(vetor.length > 1) {
			for (int i = 1; i < vetor.length; i++) {
				int j = i-1;
				int pivot = vetor[i];
				for (; j >= 0 && pivot < vetor[j]; j --) {
						vetor[j + 1] = vetor[j];
				}
				vetor[j + 1] = pivot;
			}
		}
	}
	
	public static <T> void inserctionSort(T[] vetor, Comparator<T> comp){
		if(vetor.length > 1) {
			for (int i = 1; i < vetor.length; i++) {
				int j = i-1;
				T pivot = vetor[i];
				for (; j >= 0 && comp.compare(pivot , vetor[j]) < 0; j --) {
						vetor[j + 1] = vetor[j];
				}
				vetor[j + 1] = pivot;
			}
		}
	}
	
	public static void selectionSort(int[] vetor) {
		if(vetor.length > 1) {
			for (int i = 0; i < vetor.length; i++) {
				int minimo = i;
				int j = i;
				for (; j < vetor.length; j++) {
					if (vetor[i] > vetor[j]) {
						minimo = j;
					}
				}
				swap(i, minimo, vetor);
			}
		}
	}
	
	public static <T> void selectionSort(T[] vetor, Comparator<T> comp) {
		if(vetor.length > 1) {
			for (int i = 0; i < vetor.length; i++) {
				int minimo = i;
				int j = i;
				for (; j < vetor.length; j++) {
					if (comp.compare(vetor[i], vetor[j]) > 0) {
						minimo = j;
					}
				}
				swap(i, minimo, vetor);
			}
		}
	}	
}
