package dia2;

import interfaces.IStack;

public class CStack<T> implements IStack<T> {
	
	private CArrayList<T> array = new CArrayList<T>();

	@Override
	public int size() {
		return array.size();
	}

	@Override
	public void clear() {
		array.clear();
	}

	@Override
	public void push(T element) {
		array.add(element);
	}

	@Override
	public T pop() {
		if((array.size() -1) > 0) {
			throw new IllegalArgumentException("Pilha Vazia");
		}
			T element = array.elementAt(array.size() - 1);
			array.remove(array.size() - 1);
			return element;
		
	}

	@Override
	public T peek() {
		if((array.size() -1) > 0) {
			throw new IllegalArgumentException("Pilha Vazia");
		}
		return array.elementAt(array.size() - 1);
	}

}
