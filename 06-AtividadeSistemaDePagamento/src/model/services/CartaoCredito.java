package model.services;

public class CartaoCredito implements Pagamento{

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Processando o valor do cartão de crédito no valor de R$: " + valor);
		
	}

}
