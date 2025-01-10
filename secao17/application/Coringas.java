package secao17.application;

import java.util.ArrayList;
import java.util.List;

public class Coringas {
	
	public static void main(String[] args) {
		
		List<?> myObjs = new ArrayList<>();
		List<Integer> myNumbers = new ArrayList<>();
		myNumbers.add(30);
		myObjs = myNumbers;
		
		myNumbers.add(10);
		
		for(Object i : myObjs) {
			System.out.println(i);
		}
		
		Object obj;
		Integer x = 10;
		obj = x;
		
	}

}
