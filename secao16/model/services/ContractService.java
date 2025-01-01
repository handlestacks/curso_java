package secao16.model.services;

import java.time.LocalDate;

import secao16.model.entities.Contract;
import secao16.model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService() {

	}

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer month) {

//		contract.getInstallments().add(new Installment(LocalDate.of(2018, 7, 25), 206.04));
//		contract.getInstallments().add(new Installment(LocalDate.of(2018, 8, 25), 208.08));

		double basicQuota = contract.getTotalValue() / month;
		
		for (int i = 1; i <= month; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate, quota));
			
		}

	}

}
