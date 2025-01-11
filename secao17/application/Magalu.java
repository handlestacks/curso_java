package secao17.application;

import java.util.HashSet;
import java.util.Set;

import secao17.entities.Order;

public class Magalu {
	
	public static void main(String[] args) {
		
		Set<Order> set = new HashSet<>();
		
		set.add(new Order("TV", 900.0));
		set.add(new Order("Notebook", 1200.0));
		set.add(new Order("Tablet", 400.0));
		
		Order ord = new Order("Notebook", 1200.0);
		
		System.out.println(set.contains(ord));
		
	}

}
