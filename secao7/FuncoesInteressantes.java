package secao7;

public class FuncoesInteressantes {
	
	public static void main(String[] args) {
		
		String name = "Rogério Brito dos Santos            ";
		System.out.println("-" + name.toLowerCase() + "-");
		System.out.println("-" + name.toUpperCase() + "-");
		System.out.println("-" + name.trim() + "-");
		System.out.println("-" + name.substring(2) + "-");
		System.out.println("-" + name.substring(2,5) + "-");
		System.out.println("-" + name.replace('r','w').trim() + "-");
		System.out.println(name.indexOf("ri"));
		System.out.println(name.lastIndexOf("ri"));
		
		String[] vect = name.split(" ");
		String name1 = vect[0];
		String name2 = vect[1];
		String name3 = vect[2];

		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
	}

}
