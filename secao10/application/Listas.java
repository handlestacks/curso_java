package secao10.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Roger");
		list.add("Brito");
		list.add("Santos");
		list.add("Anderson");
		list.add("Darci");
		list.add("Roberto");
		list.add(3, "Gerson");
		
		System.out.println(list.size());
		
//		list.remove("Brito");
//		list.remove("Gerson");
//		list.remove("Ninha");
//		list.remove("Roberto");
//		list.remove("Darci");
		
		//list.removeIf(x -> x.charAt(0) == 'G');
		
		// System.out.println("Index of Gerson: " + list.indexOf("Gerson"));
		
		System.out.println("Index of Santos: " + list.indexOf("Santos"));
		System.out.println("Index of Anderson: " + list.indexOf("Anderson"));
		System.out.println("Index of Darci: " + list.indexOf("Darci"));
		System.out.println("Index of Brito: " + list.indexOf("Brito"));
		System.out.println("Index of Nick: " + list.indexOf("Nick"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());
		
		System.out.println(result);
		
		for(String x: result) {
			System.out.println(x);
		}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
		System.out.println(name);
		
	}
	
}
