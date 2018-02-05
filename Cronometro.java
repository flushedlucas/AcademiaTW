package academia;

public class Cronometro {

	public static void main(String[] args) {
		int[] vetorInsert = Application.random(1000000, 50);
		int[] vetorSelect = Application.random(1000000, 50);
		
		System.out.println("Inserction n�o ordenado");
		long time = System.currentTimeMillis();
		Sorts.inserctionSort(vetorInsert);
		time = System.currentTimeMillis() - time;
		System.out.println(time);
		
		System.out.println("Inserction J� ordenado");
		time = System.currentTimeMillis();
		Sorts.inserctionSort(vetorInsert);
		time = System.currentTimeMillis() - time;
		System.out.println(time);
		
		System.out.println("Selection n�o ordenado");
		time = System.currentTimeMillis();
		Sorts.selectionSort(vetorSelect);
		time = System.currentTimeMillis() - time;
		System.out.println(time);
		
		System.out.println("Selection J� ordenado");
		time = System.currentTimeMillis();
		Sorts.selectionSort(vetorSelect);
		time = System.currentTimeMillis() - time;
		System.out.println(time);
		
	}

}
