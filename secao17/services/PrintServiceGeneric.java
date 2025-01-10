package secao17.services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceGeneric<T> {

	private List<T> list = new ArrayList<>();

	public List<T> getList() {
		return list;
	}

	public void addValue(T value) {
		list.add(value);
	}

	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}

	public void print() {
		System.out.println("[");
		if (!list.isEmpty()) {
			System.out.println(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.println(", " + list.get(i));
		}
		System.out.println("]");
	}

}
