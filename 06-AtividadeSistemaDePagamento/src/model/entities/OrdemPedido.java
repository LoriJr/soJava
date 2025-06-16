package model.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrdemPedido {

	private Integer orderID;
	private LocalDateTime date;
	
	private List<Produto> produto = new ArrayList<>();
	
	public OrdemPedido() {		
	}

	public OrdemPedido(Integer orderID, LocalDateTime date) {
		this.orderID = orderID;
		this.date = date;		
	}

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public double calcularTotal() {
		double valorOrdem=0;
		for(Produto x: produto) {
			valorOrdem +=x.getPrice();
		}
		return valorOrdem;		
	}	
	
}
