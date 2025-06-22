package model.entities;

import java.time.LocalDate;

public class Installment {
	
	private LocalDate date;
	private double amoun;
	public Installment(LocalDate date, double amoun) {
		super();
		this.date = date;
		this.amoun = amoun;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getAmoun() {
		return amoun;
	}
	public void setAmoun(double amoun) {
		this.amoun = amoun;
	}
	
	

}
