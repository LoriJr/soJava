package model.services;

public class BoletoBancario implements Pagamento{

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Processando pagamento no boleto bancário no valor de R$: " + valor);
		
	}

}
