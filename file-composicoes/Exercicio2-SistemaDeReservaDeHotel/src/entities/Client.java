package entities;

public class Client {
	
	private int id;
	private String name;
	private String cpf;
	
	Reserve reserve;
	
	public Client() {		
	}

	public Client(int id, String name, String cpf, Reserve reserve) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.reserve = reserve;
	}
	
	
	public Reserve getReserve() {
		return reserve;
	}

	public void setReserve(Reserve reserve) {
		this.reserve = reserve;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}
	
	
	

}
