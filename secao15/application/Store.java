package secao15.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import secao15.model.entities.Product;

public class Store {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		boolean success = new File(path.getParent() + "\\out").mkdir();

		System.out.println(path.getParent());

		if (success) {
			System.out.println("Directory out created successfully");
		}

		List<String> lines = new ArrayList<>();
		List<Product> products = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {

			String line = br.readLine();

			while (line != null) {

				String[] info = line.split(",");
				String name = info[0];
				Double price = Double.parseDouble(info[1]);
				Integer quantity = Integer.parseInt(info[2]);
				Product product = new Product(name, price, quantity);
				products.add(product);

				line = br.readLine();

			}

			strPath = "c:\\temp\\store\\out\\summary.csv";

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPath))) {
				for (Product product : products) {
					bw.write(product.getName() + "," + product.total());
					bw.newLine();
				}

				System.out.println(strPath + " created!");

			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
