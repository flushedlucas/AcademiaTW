package dia3_lucas;

import java.util.Iterator;

import interfaces.IList;

public class CLinkedList<T> implements IList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;

	private static class Node<T> {
		T element;
		Node<T> next;

		Node(T e) {
			element = e;
		}
	}

	public CLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	@Override
	public boolean contains(T element) {
		boolean b = false;
		Node pivot = this.head;
		while (!(pivot == null) && !b) {
			if (pivot.element.equals(element)) {
				b = true;
			} else {
				pivot = pivot.next;
			}
		}
		return b;
	}

	@Override
	public void add(T element) {
		Node<T> novo = new Node<T>(element);
		if (!(head == null)) {
			this.tail.next = novo;
			this.tail = novo;
			size++;
		} else {
			this.head = novo;
			this.tail = novo;
			size++;
		}
	}

	@Override
	public void remove(T element) {
		Node pivot = this.head;
		while (!(pivot.next == null)) {
			if (pivot.next.element.equals(element)) {
				pivot.next = pivot.next.next;
				size--;
			} else {
				pivot = pivot.next;
			}
		}
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public void clear() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	@Override
	public void add(T element, int index) {
		if (size <= index) {
			this.add(element);
		} else {
			Node<T> novo = new Node<T>(element);
			int cont = 1;
			Node pivot = this.head;
			if (index == 0) {
				novo.next = head;
				head = novo;
				size++;
			} else {
				while (!(pivot == null)) {
					if (cont == index) {
						novo.next = pivot.next;
						pivot.next = novo;
						size++;
						break;
					} else {
						pivot = pivot.next;
						cont++;
					}
				}
			}
		}
	}

	@Override
	public T elementAt(int index) {
		T resposta = null;
		Node pivot = head;
		for (int cont = 0; cont <= index; cont++) {
			pivot = pivot.next;
			if (cont == index) {
				resposta = (T) pivot.element;
			}
		}
		return resposta;
	}

	@Override
	public void replace(int index, T element) {
		Node pivot = head;
		for (int cont = 0; cont <= index; cont++) {
			pivot = pivot.next;
			if (cont == index) {
				pivot.element = element;
			}
		}
	}

	@Override
	public void remove(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node pivot = this.head;
			for (int i = 0; i <= index; i++) {
				if (i + 1 == index) {
					pivot.next = pivot.next.next;
					size--;
				} else {
					pivot = pivot.next;
				}
			}
		}

	}

	public Iterator<T> iterator() {
		return new CLinkedListIterator();
	}

	private class CLinkedListIterator implements Iterator<T> {
		Node<T> pivot = head;

		@Override
		public boolean hasNext() {
			if (pivot != null) {
				return true;
			}
			return false;
		}

		@Override
		public T next() {
			T element = pivot.element;
			pivot = pivot.next;
			return element;
		}
	}

}
