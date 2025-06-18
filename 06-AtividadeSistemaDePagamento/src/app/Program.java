package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.OrdemPedido;
import model.entities.Produto;
import model.enums.TipoPagamento;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Produto> list = new ArrayList<>();
		Produto product = new Produto();
		
		System.out.println("SISTEMA DE PAGAMENTO");
		
		while(true) {
			System.out.print("Produto: ");
			String produto = sc.nextLine().toLowerCase();
			
			if(produto.equalsIgnoreCase("sair")) {
				break;
			}
			
			System.out.print("Valor: ");
			double valor = sc.nextDouble();
			System.out.print("Quantitdade: ");
			int quantidade = sc.nextInt();
			
			product = new Produto(produto, valor, quantidade);
			sc.nextLine();
				
			list.add(product);
		}
		
		System.out.println();
		System.out.print("Forma de pagamento: ");
		System.out.println();
		System.out.println("1 - Boleto Bancário");
		System.out.println("2 - Cartão de Crédito");
		System.out.println("3 - Pix");
		
		int opcao = sc.nextInt();
		String formaPag = "";
		
		if(opcao == 1) {formaPag = "BOLETO_BANCARIO";}
		if(opcao == 2) {formaPag = "CARTAO_CREDITO";}
		if(opcao == 3) {formaPag = "PIX";}
		
		
		OrdemPedido op = new OrdemPedido(1208, LocalDate.now(), TipoPagamento.valueOf(formaPag));
		op.adicionarPedido(product);
				
		System.out.println("Ordem de Pagamento");
		System.out.println("Nº: " + op.getOrderID());
		System.out.println("Data: " + op.getDate());
				
		for(Produto x: list) {
			System.out.println(x); 
		}
		
		System.out.println("Total: " + op.calcularTotal());
		System.err.println("Forma de Pagamento: " + op.getTipoPagamento());
		op.processarPagamento();
		System.out.println("Valor Total " + op.calcularComTaxa());
		
				
		sc.close();

	}

}
