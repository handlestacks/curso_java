package secao17.application;

import java.util.HashMap;
import java.util.Map;

import secao17.entities.Item;

public class Shopee {

	public static void main(String[] args) {
		
		Map<Item, Double> stock = new HashMap<>();
		
		Item p1 = new Item("Tv", 900.0);
		Item p2 = new Item("Notebook", 1200.0);
		Item p3 = new Item("Tablet", 400.0);

		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Item ps = new Item("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		
		for(Item key : stock.keySet()) {
			System.out.println(key.getName() + ": " + stock.get(key));
		}
		
	}
	
}
