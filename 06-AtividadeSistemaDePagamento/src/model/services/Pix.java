package model.services;

public class Pix implements Pagamento{

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Processando pagamento no pix no valor de R$: " + valor);
		
	}

}
