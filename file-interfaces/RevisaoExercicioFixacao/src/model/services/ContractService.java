package model.services;

import java.time.LocalDate;


import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService; 	
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contrato, int months) {
		
		double cotaBasica = contrato.getTotalValue() / months;
		
		for(int i = 1; i <= months; i ++) {
			LocalDate dataParcela = contrato.getDate().plusMonths(i);
			
			double juros = onlinePaymentService.interest(cotaBasica, i);
			double taxa = onlinePaymentService.paymentFee(cotaBasica + juros);
			double cotaCheia = cotaBasica + juros + taxa;
			
			contrato.getList().add(new Installment(dataParcela, cotaCheia));
			
		}
	}

}
