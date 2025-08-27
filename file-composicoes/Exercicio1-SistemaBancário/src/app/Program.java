package app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.Titular;
import entities.Transacao;
import entities.enums.TipoConta;
import entities.enums.TipoTransacao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		List<Conta> contas = new ArrayList<>();
		
		System.out.println("SISTEMA BANCÁRIO");
		System.out.print("Quantas contas deseja cadastrar? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Entre com os dados do titular");
			System.out.print("Digite o número da Conta");
			int numeroConta = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome Completo: ");
			String titularNome = sc.nextLine();

			System.out.print("CPF do Titular (somente os números): ");
			Titular t = new Titular();
			String cpf = t.aplicarMascaraCpf(sc.next());

			Titular titular = new Titular(titularNome, cpf);

			
			System.out.println("Entre com os dados da conta:");
			System.out.print("Tipo da conta: ");
			TipoConta tipoConta = TipoConta.valueOf(sc.next().toUpperCase());

			System.out.print("Deseja depositar algum valor na conta? (y/n) ");
			char resp = sc.next().charAt(0);
			double deposito;
			if (resp == 'y') {
				System.out.print("Informa o valor Inicial da conta: ");
				deposito = sc.nextDouble();
				
			} else {
				deposito = 0.0;
			}
			sc.nextLine();	
			conta = new Conta(numeroConta,titular, deposito, tipoConta);
			contas.add(conta);
			
			System.out.print("Informe a operação: (DEPOSITO - SAQUE - TRANSFERENCIA): ");			
			TipoTransacao opcaoTransacao = TipoTransacao.valueOf(sc.nextLine().toUpperCase()); 
			System.out.print("Informa o valor da operação: ");
			double valorOperacao = sc.nextDouble();
			
			if(opcaoTransacao.toString().equals("SAQUE")) {
				conta.sacar(valorOperacao);				
			}
			if(opcaoTransacao.toString().equals("DEPOSITO")) {
				conta.depositar(valorOperacao);			
			}
			if(opcaoTransacao.toString().equals("TRANSFERENCIA")) {
				System.out.print("Informe a conta que fará a transferência: ");
				int idContaDestino = sc.nextInt();
				
				Conta contaDestino = null;
				
				for(Conta c : contas) {
					if(c.getCc() == idContaDestino) {
						contaDestino = c;
						break;
					}
				}
				
				if(contaDestino != null) {
					conta.transferir(contaDestino, valorOperacao);
				}
				else {
					System.out.println("Conta de destino não encontrada");
				}				
			}	
			
			
			Transacao transacao = new Transacao(new Date(), valorOperacao, opcaoTransacao);
			
			conta.addTransacao(transacao); 
	}		
		for(Conta c : contas) {
			System.out.println(c);
		}		

		sc.close();

	}

}
