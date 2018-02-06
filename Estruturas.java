package dia2;

public class Estruturas {
	
	public static void main(String[] args) {
		
	}

	public static boolean containsBinario(int[] vetor, int x) {
		boolean tem = false;
		
		int inferior = 0;
		int superior = vetor.length - 1;
		int ponteiro = (vetor.length - 1)/2;
			
		while (superior >= inferior && !tem)	{
			if(x == vetor[ponteiro]) {
				tem = true;
			}
			else if (x < vetor[ponteiro]) {
				superior = ponteiro - 1;
			}
			else {
				inferior = ponteiro + 1;
			}
			ponteiro = ((superior - inferior)/2) + inferior;
		}	
		return tem;
	}
	
	public static boolean contains(int[] vetor, int x) {
		boolean tem = false;
		for (int i = 0; i < vetor.length && !tem; i++) {
			if (vetor[i] == x) {
				tem = true;
			}
		}
		return tem;
	}
}
