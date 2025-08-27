package model.entities;

import model.services.Conectavel;

public class Scanner implements Conectavel{

	@Override
	public void conectar() {
		System.out.println("Scanner conectado com sucesso");
	}

}
