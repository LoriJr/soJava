package model.entiites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Installment {
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
    private LocalDate dueDate;
    private Double amount;
     
	public Installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
     
    public double numeroParcelas(double amount, double parc) {
    	return amount / parc;
    }

	@Override
	public String toString() {
		return dueDate.format(dtf) + " - " + String.format("%.2f", amount);
	} 

    
    
}
