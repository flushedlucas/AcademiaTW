package dia3_lucas;

import java.util.Iterator;

import interfaces.ISet;

public class CHashSet<T> implements ISet<T> {

	private CMap<T, T> hash = new CMap<T, T>();

	@Override
	public boolean contains(T element) {
		return hash.containsKey(element);
	}

	@Override
	public void remove(T element) {
		hash.remove(element);
	}

	@Override
	public int size() {
		return hash.size();
	}

	@Override
	public void clear() {
		hash.clear();
	}

	@Override
	public void add(T element) {
		hash.put(element, element);
	}

	@Override
	public Iterator<T> iterator() {
		return hash.values().iterator();
	}

	@Override
	public void union(ISet<T> set) {
		Iterator<T> iterator = set.iterator();
		while (iterator.hasNext()) {
			this.add(iterator.next());
		}
	}

	@Override
	public void intersection(ISet<T> set) {
		// TODO Auto-generated method stub

	}

	@Override
	public void difference(ISet<T> set) {
		// TODO Auto-generated method stub

	}

}
