package secao17.application;

import secao17.entities.Client;

public class TestingHashCode {
	
	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "teste";
		String s2 = "teste";
		
		String s3 = new String("teste");
		String s4 = new String("teste");
		
		System.out.println("c1.hashCode() = " + c1.hashCode());
		System.out.println("c2.hashCode() = " + c2.hashCode());
		System.out.println("c1.equals(c2) = " + c1.equals(c2));
		System.out.println("c1 == c2 = " + (c1 == c2));

		System.out.println("s1 == s2 = " + (s1 == s2));
		System.out.println("s3 == s4 = " + (s3 == s4));
	}

}
