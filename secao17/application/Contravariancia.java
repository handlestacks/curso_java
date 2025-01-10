package secao17.application;

import java.util.ArrayList;
import java.util.List;

public class Contravariancia {
	
	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<>();
		myObjs.add("Roger");
		myObjs.add("Brito");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
		for(Object obj : myNums) {
			System.out.println(obj);
		}
		
		//Number x = myNums.get(0); // erro de compilação, pois posso estar tentando guardar um tipo Object dentro de Number
		
	}

}
