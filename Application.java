package dia3_lucas;

import java.util.Arrays;
import java.util.Random;

public class Application {
	
	public static void main(String args[]) {
//		System.out.println("Hello World!");
		int vetorInt[] = random(5, 10);
		System.out.println(Arrays.toString(vetorInt));
		Integer vetorInteger[] = random(5, 10, 20);
		System.out.println(Arrays.toString(vetorInteger));
	}
	
	public static int[] random(int n, int max) {
		int vetor[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			double r = Math.random();
			vetor[i] = (int)(r * (max + 1));
		}
		return vetor;
	}
	
	public static Integer[] random(int n, int min, int max) {
		Random rand = new Random();
		Integer vetor[] = new Integer[n];
		for (int i = 0; i < n;) {
			Integer num = rand.nextInt(max);
			if (num > min && num < max) {
				vetor[i] = num;
				i ++;
			}
		}
		return vetor;
	}
}