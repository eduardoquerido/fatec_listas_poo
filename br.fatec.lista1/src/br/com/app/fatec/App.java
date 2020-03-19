package br.com.app.fatec;



import java.util.ArrayList;
import java.util.List;

import br.com.modelo.fatec.Pessoa;
import br.com.negocio.fatec.AsciiArt;
import br.com.negocio.fatec.Controle;
import br.com.negocio.fatec.Menu;

public class App {
	public static void main(String[] args) {
		AsciiArt.printAsciiArt("");
		Menu menu = new Menu();
		int op = 1000;
		List<Pessoa> pessoa = new ArrayList<Pessoa>();
		while (op != 0) {
			menu.imprimirMenu();
			Controle ctl = new Controle();
			op = ctl.opcao();
			
			switch (op) {
			case 0:
				System.out.println("teste");
				break;
			case 1:
				String nome = ctl.texto();
				String telefone = ctl.texto();
				String datanascimento = ctl.texto();
				String genero = ctl.texto();
				Pessoa x = new Pessoa(nome, telefone, datanascimento, genero);
				pessoa.add(x);
				break;
			case 2:
				for (Pessoa pessoa2 : pessoa) {
					System.out.println(pessoa2);
				}				
				break;

			}
		}

	}
}







