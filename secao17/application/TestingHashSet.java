package secao17.application;

import java.util.HashSet;
import java.util.Set;

public class TestingHashSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("Tablet");
		set.add("Notebook");
		set.add("TV");
		
		System.out.println(set.contains("Tablet"));
		
		for(String p : set) {
			System.out.println(p);
		}
		
	}

}
