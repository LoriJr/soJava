package model.entities;

public class Invoice {
	
	private Double basePayment;
	private Double tax;
	
	public Invoice() {		
	}

	public Invoice(Double basePayment, Double tax) {
		super();
		this.basePayment = basePayment;
		this.tax = tax;
	}

	public Double getBasePayment() {
		return basePayment;
	}

	public void setBasePayment(Double basePayment) {
		this.basePayment = basePayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public double getTotalPayment() {
		return getBasePayment() + getTax();
	}

}
