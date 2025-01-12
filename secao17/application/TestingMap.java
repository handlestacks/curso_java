package secao17.application;

import java.util.Map;
import java.util.TreeMap;

public class TestingMap {
	
	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Roger");
		cookies.put("email", "rogerbritosan@gmail.com");
		cookies.put("phone", "11981584393");
		
		cookies.remove("email");
		cookies.put("phone", "11942442801"); // irá sobrescrever
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("All cookies:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
	}

}
