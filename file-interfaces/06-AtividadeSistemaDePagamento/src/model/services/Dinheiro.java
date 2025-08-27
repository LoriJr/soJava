package model.services;

public class Dinheiro implements Pagamento{

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagamento em dinheiro");
		
	}

	@Override
	public double calcularTaxa(double valor) {
		return valor;
	}

}
