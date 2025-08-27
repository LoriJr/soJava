package app;

import model.entities.Impressora;
import model.entities.Scanner;
import model.services.Conectavel;

public class Program {

	public static void main(String[] args) {
		
		Conectavel[] dispositivos = new Conectavel[2];
		dispositivos[0] = new Impressora();
		dispositivos[1] = new Scanner();
		
		for(Conectavel x: dispositivos) {
			x.conectar();
		}

	}

}
