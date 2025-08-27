package model.entities;

import model.services.Conectavel;

public class Impressora implements Conectavel{

	@Override
	public void conectar() {
		System.out.println("Impressora conectada com sucesso");		
	}

}
