package dia2;

import interfaces.IList;

public class CArrayList<T> implements IList<T>{

	private Object elementos[];
	private int next;
	
	public CArrayList() {
		this.elementos = new Object[10];
		this.next = 0;
	}
	
	@Override
	public boolean contains(T element) {
		boolean tem = false;
		for (int i = 0; i < this.next && !tem; i++) {
			if (this.elementos[i].equals(element)) {
				tem = true;
			}
		}
		return tem;
	}

	@Override
	public void add(T element) {
		this.elementos[next] = element;
		next ++;
		
		if (next == this.elementos.length) {
			this.extendList(this.elementos);
		}
	}

	@Override
	public void remove(T element) {
		for (int i = 0; i < this.next; i++) {
			if (this.elementos[i].equals(element)) {
				for (int j = i; j < this.next; j++) {
					this.elementos[j] = this.elementos[j+1];
				}
				this.elementos[next] = null;
				this.next --;
				break;
			}
		}
	}

	@Override
	public int size() {
		return this.next;
	}

	@Override
	public void clear() {
		for (; next > 0; next --) {
			this.elementos[next-1] = null;
		}
	}

	@Override
	public void add(T element, int index) {
		int p = this.next;
		for (; p > index && p < this.next; p--) {
			this.elementos[p] = this.elementos[p - 1];
		}
		this.elementos[p] = element;
		this.next ++;
		
		if (next == this.elementos.length) {
			this.extendList(this.elementos);
		}
	}

	@Override
	public T elementAt(int index) {
		return (T) this.elementos[index];
	}

	@Override
	public void replace(int index, T element) {
		this.elementos[index] = element;
	}

	@Override
	public void remove(int index) {
		for (; index < next; index++) {
			this.elementos[index] = this.elementos[index + 1]; 
		}
		this.next --;
	}
	
	public void extendList(Object elements[]) {
		Object novoArray[] = new Object[this.elementos.length * 2];
		
		for (int i = 0; i < this.next; i++) {
			novoArray[i] = this.elementos[i];
		}
		this.elementos = novoArray;
	}
}
