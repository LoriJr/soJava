package model.services;

public class Pix implements Pagamento{

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Taxa do pix R$: " + valor * 0.01);		
	}
	
	@Override
	public double calcularTaxa(double valor) {
		return valor += valor * 0.01;
	}

}
