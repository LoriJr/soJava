package model.services;

public class BoletoBancario implements Pagamento{

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Taxa do boleto bancário R$: " + valor * 0.025);
		
	}

	@Override
	public double calcularTaxa(double valor) {
		return valor += valor * 0.025;
	}

}
