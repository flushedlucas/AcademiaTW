package dia3_lucas;

import dia3_lucas.Application;
import Dia2.CArrayList;

public class CronometroDia3 {

	public static void main(String[] args) {

		int temp[] = Application.random((Integer) 100000, (Integer) 100);
		cronometroCArrayList(temp);
		cronometroCHash(temp);
		

	}

	private static void cronometroCHash(int temp[]) {
		CHashSet<Integer> vetor = new CHashSet();
		long time = System.currentTimeMillis();
		for (int i = 0; i < temp.length; i++) {
			vetor.add(temp[i]);
		}
		time = System.currentTimeMillis() - time;
		System.out.println(time);
	}
	
	private static void cronometroCArrayList(int temp[]) {
		CArrayList<Integer> vetor = new CArrayList<Integer>();
		CArrayList<Integer> vetorUnico = new CArrayList<Integer>();

		for (int i = 0; i < temp.length; i++) {
			vetor.add(temp[i]);
		}

		long time = System.currentTimeMillis();
		for (int i = 0; i < vetor.size(); i++) {
			if (!vetorUnico.contains(vetor.elementAt(i))) {
				vetorUnico.add(vetor.elementAt(i));
			}
		}
		time = System.currentTimeMillis() - time;
		System.out.println(time);
	}

}
