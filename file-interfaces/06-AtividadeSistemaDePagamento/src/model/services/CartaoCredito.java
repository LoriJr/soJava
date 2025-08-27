package model.services;

public class CartaoCredito implements Pagamento{

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Taxa do cartão de crédito R$: " + valor * 0.05);
		
	}

	@Override
	public double calcularTaxa(double valor) {
		return valor += valor * 0.05;
	}

}
