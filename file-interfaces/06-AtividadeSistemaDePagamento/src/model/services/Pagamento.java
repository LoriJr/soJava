package model.services;

public interface Pagamento {
	
	void processarPagamento(double valor);
	double calcularTaxa(double valor);

}
