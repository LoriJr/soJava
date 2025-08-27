package entities;

import java.util.Date;

import entities.enums.StatusReserve;

public class Reserve {
	
	private int codReverse;
	Client client;
	Room room;
	Date dateCheckin;
	Date dateCheckout;
	StatusReserve statusReserve;
	
	public Reserve() {		
	}

	public Reserve(int codReverse, Client client, Room room, Date dateCheckin, Date dateCheckout,
			StatusReserve statusReserve) {
		super();
		this.codReverse = codReverse;
		this.client = client;
		this.room = room;
		this.dateCheckin = dateCheckin;
		this.dateCheckout = dateCheckout;
		this.statusReserve = statusReserve;
	}

	public int getCodReverse() {
		return codReverse;
	}

	
	public Client getClient() {
		return client;
	}

	
	public Room getRoom() {
		return room;
	}

	
	public Date getDateCheckin() {
		return dateCheckin;
	}

	
	public Date getDateCheckout() {
		return dateCheckout;
	}

	
	public StatusReserve getStatusReserve() {
		return statusReserve;
	}

		
	

}
