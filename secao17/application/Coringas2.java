package secao17.application;

import java.util.Arrays;
import java.util.List;

public class Coringas2 {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> myStrs = Arrays.asList("Roger", "Brito", "San");
		printList(myStrs);
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println();
	}

}
