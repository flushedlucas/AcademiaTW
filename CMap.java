package dia3_lucas;

import interfaces.ICollection;
import interfaces.IMap;
import interfaces.ISet;

public class CMap<K, V> implements IMap<K, V> {
	private int size;
	private Node<K, V>[] dados;
	private double fator = 10;

	public CMap() {
		size = 0;
		dados = new Node[10000];
	}

	private static class Node<K, V> {
		K key;
		V value;
		Node<K, V> next;

		Node(K k, V v) {
			key = k;
			value = v;
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		for (int i = 0; i < dados.length; i++) {
			dados[i] = null;
		}
		size = 0;
	}

	@Override
	public void put(K key, V value) {
		putGlobal(key, value, dados);
	}

	@Override
	public V get(K key) {
		int hash = posicaoHash(key);
		Node<K, V> pivot = dados[hash];

		while (pivot.key != key && pivot != null) {
			pivot = pivot.next;
		}
		return pivot.value;
	}

	@Override
	public boolean containsKey(K key) {
		int hash = posicaoHash(key);
		Node<K, V> pivot = dados[hash];
		while (pivot != null) {
			if (pivot.key == key) {
				return true;
			} else {
				pivot = pivot.next;
			}
		}
		return false;
	}

	@Override
	public void remove(K key) {
		int hash = posicaoHash(key);
		if (containsKey(key)) {
			Node<K, V> pivot = dados[hash];
			if (key != pivot.key) {
				Node<K, V> aux = null;
				while (pivot.key != key && pivot != null) {
					aux = pivot;
					pivot = pivot.next;
				}
			} else {
				dados[hash] = pivot.next;
			}
			size--;
		}
	}

	private void reHash() {
		Node<K, V>[] novosDados = new Node[dados.length * 2];
		for (int i = 0; i < dados.length; i++) {
			Node<K, V> pivot = dados[i];
			while (pivot != null) {
				putGlobal(pivot.key, pivot.value, novosDados);
				pivot = pivot.next;
			}
		}
		dados = novosDados;
		novosDados = null;
	}

	private int posicaoHash(K key) {
		return key.hashCode() % dados.length;
	}

	private void fatorHash() {
		if (size / dados.length > fator) {
			reHash();
		}
	}

	@Override
	public ISet<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICollection<V> values() {
		CLinkedList<V> lista = new CLinkedList<V>();
		for (int i = 0; i < dados.length; i++) {
			Node<K, V> pivot = dados[i];
			while (pivot != null) {
				lista.add(pivot.value);
				pivot = pivot.next;
			}
		}
		return lista;
	}

	private void putGlobal(K key, V value, Node<K, V>[] vetor) {
		int hash = posicaoHash(key);
		Node<K, V> novo = new Node(key, value);
		if (!containsKey(key)) {
			novo.next = vetor[hash];
			vetor[hash] = novo;
			size++;
		} else {
			Node<K, V> pivot = vetor[hash];
			while (!(novo.key == pivot.key)) {
				pivot = pivot.next;
			}
			pivot.value = novo.value;
		}
	}
}
