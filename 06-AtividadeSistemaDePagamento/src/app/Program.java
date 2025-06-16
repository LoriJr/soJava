package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.OrdemPedido;
import model.entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		Produto p1 = new Produto("TV SAMSUNG", 2500.00);
		Produto p2 = new Produto("CELULAR APPLE", 500.00);
		
				
		//LocalDateTime ldt = LocalDateTime.parse("25/05/2025", fmt);
		
		OrdemPedido op = new OrdemPedido(1208, null);
		
		
		
		System.out.println();
		
		sc.close();

	}

}
