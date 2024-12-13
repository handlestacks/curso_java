package secao10.application;

public class LacoForEach {
	
	public static void main(String[] args) {
		
		String[] names = new String[] {"Roger", "Brito", "Santos"};
		
		for(String obj : names) {
			System.out.println(obj);
		}
		
		System.out.println("------------------");
		
		Integer[] idades = new Integer[] {1, 3, 5};
		
		for(Integer i : idades) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		
	Boolean[] verdadesOuNao = new Boolean[] {!true, !false, false};
		
		System.out.println("------------------");
		
		Double[] compras = new Double[] {null, 1.4, 3.2, 1.0};
		
		for(Double db : compras) {
			System.out.println(db);
		}
		
		Character[] chars = new Character[] {'A', 'B', '%', 'º', '|'};
		for (Character c: chars) {
			System.out.println(c);
		}
		
		Number[] i = new Number[] {2, 4, 6, 8, 10};
		
		i = compras;
		
		System.out.println("------------------");
		
		for(Boolean boo : verdadesOuNao) {
			System.out.println(boo);
		}
		
		
		
	}

}
