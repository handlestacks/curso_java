package secao17.application;

import java.util.Set;
import java.util.TreeSet;

public class TestingTreeSet {
	
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("TV"));
		
		for (String p : set) {
			System.out.println(p);
		}
		
		
	}

}
