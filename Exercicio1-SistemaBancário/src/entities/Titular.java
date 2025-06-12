package entities;

public class Titular {
	
	private String titularNome;
	private String titularCpf;
	
	public Titular() {		
	}

	public Titular(String titularNome, String titularCpf) {
		super();
		this.titularNome = titularNome;
		this.titularCpf = titularCpf;
	}

	public String getTitularNome() {
		return titularNome;
	}

	public void setTitularNome(String titularNome) {
		this.titularNome = titularNome;
	}

	public String getTitularCpf() {
		return titularCpf;
	}
	
	public String aplicarMascaraCpf(String cpf) {
		if (cpf == null || cpf.length() != 11 || !cpf.matches("\\d+")) {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos numéricos.");
        }
		
		return cpf.substring(0, 3) + "."
				+ cpf.substring(3, 6) + "."
				+ cpf.substring(6, 9) + "-"
				+ cpf.substring(9);
		
	}
	
	public String toString() {
		return titularNome + " - " + titularCpf;
	}
	

}
