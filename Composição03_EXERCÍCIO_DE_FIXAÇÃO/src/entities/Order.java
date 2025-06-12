package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> orderItem = new ArrayList<>();
	
	public Order() {		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
		
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
	
	public void addItem(OrderItem item) {
		orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}
	
	public double total() {
		double totalBucket=0;
		for(OrderItem c : orderItem) {			
			totalBucket +=c.subTotal();
		}
		return totalBucket;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment)  + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client.getName() + "(" + client.getBirthDate() + ")" + " - " + client.getEmail() + "\n");
		sb.append("Order items:\n");
		for(OrderItem c: orderItem) {
					sb.append(c.getProduct().getName()
					+ ", $" + String.format("%.2f", c.getProduct().getPrice())
					+ " Quantity: "
					+ c.getQuantity()
					+ " Subtotal: "
					+ String.format("%.2f",c.subTotal()) + "\n");
		}
		sb.append("Total price: " + String.format("%.2f",total()));
		
		return sb.toString();
		
	}	
	
}
