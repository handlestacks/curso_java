package secao17.application;

import java.util.Set;
import java.util.TreeSet;

import secao17.entities.Pedido;

public class Amazon {
	
	public static void main(String[] args) {
		
		Set<Pedido> set = new TreeSet<>();
		
		set.add(new Pedido("TV", 900.0));
		set.add(new Pedido("Notebook", 1200.0));
		set.add(new Pedido("Tablet", 400.0));
		
		for (Pedido p : set) {
			System.out.println(p);
		}
		
		
	}

}
