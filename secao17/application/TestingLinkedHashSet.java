package secao17.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestingLinkedHashSet {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook"));
		
		set.remove("Tablet");
		// set.clear();
		
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}
		
	}
	
}
