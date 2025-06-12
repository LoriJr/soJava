package entities;

import entities.enums.TypeRoom;

public class Room {
	
	private int roomNumber;
	private double roomPricePerNight;
	TypeRoom typeRoom;
	
	public Room() {		
	}

	public Room(int roomNumber, double roomPricePerNight, TypeRoom typeRoom) {
		super();
		this.roomNumber = roomNumber;
		this.roomPricePerNight = roomPricePerNight;
		this.typeRoom = typeRoom;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public double getRoomPricePerNight() {
		return roomPricePerNight;
	}	

	public TypeRoom getTypeRoom() {
		return typeRoom;
	}

	public void setTypeRoom(TypeRoom typeRoom) {
		this.typeRoom = typeRoom;
	}
	
	
}
