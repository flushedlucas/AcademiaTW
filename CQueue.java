package dia2;

import interfaces.IQueue;

public class CQueue<T> implements IQueue<T>{
	
	CLinkedList<T> lista = new CLinkedList<T>();

	@Override
	public int size() {
		return lista.size();
	}

	@Override
	public void clear() {
		lista.clear();
	}

	@Override
	public void enqueue(T e) {
		lista.add(e);
		
	}

	@Override
	public void poll() {
		lista.remove(lista.size() - 1);
	}

	@Override
	public T head() {
		return lista.elementAt(0);
	}

}
