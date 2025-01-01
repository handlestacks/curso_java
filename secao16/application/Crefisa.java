package secao16.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import secao16.model.entities.Contract;
import secao16.model.entities.Installment;
import secao16.model.services.ContractService;
import secao16.model.services.PaypalService;

public class Crefisa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Entre os dados do contrato:");
			Integer number = sc.nextInt();
			System.out.print("Data (dd/MM/yyyy): ");
			LocalDate date = LocalDate.parse(sc.next(), fmt);
			System.out.print("Valor do contrato: ");
			Double amount = sc.nextDouble();
			System.out.print("Entre com o número de parcelas: ");
			Integer n = sc.nextInt();		
			
			Contract obj = new Contract(number, date, amount);
			
			ContractService contractService = new ContractService(new PaypalService());
			
			contractService.processContract(obj, n);
			
			System.out.println("PARCELAS:");
			for(Installment i : obj.getInstallments()) {
				System.out.println(i);
			}
			
			
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
		
		
	}

}
