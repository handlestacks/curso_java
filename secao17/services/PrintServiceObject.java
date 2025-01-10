package secao17.services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceObject {

	private List<Object> list = new ArrayList<>();

	public void addValue(Object value) {
		list.add(value);
	}

	public Object first() {
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

	public List<Object> getList() {
		return list;
	}

}
