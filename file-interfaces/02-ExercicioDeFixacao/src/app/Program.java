package app;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entiites.Contract;
import model.entiites.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("Entre com os dados do contrato");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.nextLine(), dtf);
		System.out.print("Valor do Contrato: ");
		double valor = sc.nextDouble();
			
		Contract contract = new Contract(numero, data, valor);
		
		System.out.print("Entre com o número de parcelas: ");
		int numParc = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, numParc);
		
		System.out.println("Parcelas:");
		for(Installment installment: contract.getInstallment()) {
			System.out.println(installment);
		}
		
		
		sc.close();
		
	}

}
