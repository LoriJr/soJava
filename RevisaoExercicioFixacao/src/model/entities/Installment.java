package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate date;
	private double amount;
	public Installment(LocalDate date, double amount) {
		super();
		this.date = date;
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getamountt() {
		return amount;
	}
	public void setamount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return date.format(dtf) + " - " + String.format("%.2f", amount );
	}
	
	

}
