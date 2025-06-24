package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String path = "C:\\in.txt"; //no arquivo deve conter nomes ou palavras
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			Collections.sort(list); // a classe Collections serve para usar o método sort que irá ordenar a lista
			for (String s : list) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}