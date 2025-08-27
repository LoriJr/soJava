package model.entities;

public class Produto {
	
	private String name;
	private Double price;
	private Integer quantity;
	
	public Produto() {		
	}

	public Produto(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double valorTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Produto: ");
		sb.append(name);
		sb.append(" R$ - ");
		sb.append(price);
		sb.append(" Qtd: ");
		sb.append(quantity);
		sb.append(" Total: ");
		sb.append(valorTotal());
		
		return sb.toString();
	}
	
	

}
