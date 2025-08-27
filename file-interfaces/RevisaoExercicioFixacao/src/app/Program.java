package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("Entre com os dados do contrato");
		System.out.print("Número: ");
		int contractNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(), dtf);
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();
		
		Contract contrato = new Contract(contractNumber, date, valor);
		
		System.out.print("Número de parcelas: ");
		int numParc = sc.nextInt();
		
		ContractService contratoServico = new ContractService(new PaypalService());
		
		contratoServico.processContract(contrato, numParc);
		
		System.out.println("Parcelas:");
		
		for(Installment installment: contrato.getList()) {
			System.out.println(installment);
		}
		
		sc.close();

	}

}
