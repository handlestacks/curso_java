package secao17.application;

public class Hashcode {
	
	public static void main(String[] args) {
		
		String a = "Roger";
		Integer b = 1;
		String c = "Roger";
		Integer i = 100;
		Double j = 20.0;
		
		System.out.println(a.hashCode());
		System.out.println(a.hashCode() == b.hashCode());
		System.out.println(b.hashCode() == c.hashCode());
		System.out.println(i.hashCode());
		System.out.println("Roger".hashCode());
		
		System.out.println();
		
	}

}
