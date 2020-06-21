package app;

import models.Controle;
import models.Menu;
import models.Cadastro;


import java.io.IOException;


public class App {

	public static void main(String[] args) {

		Cadastro cad = new Cadastro();
		Controle controle = new Controle();
		Menu menu = new Menu();
		try {
			cad = controle.carregar();
		} catch (Exception e) {
			cad = new Cadastro();
		}
		menu.inicio();
		int opcao = 100;
		while(opcao != 0) {
			menu.menu();
			Controle ctrl = new Controle();
			opcao = ctrl.opcao();
			if(opcao == 1) {
				cad.inserirProfissional();
			}
			if(opcao == 2) {
				cad.listaProfissional();
			}
			if(opcao == 3) {
				cad.inserirCliente();				
			}
			if(opcao == 4) {
				cad.listaCliente();				
			}
			if(opcao == 5) {
				cad.adicionarAnimal();
			}
			if(opcao == 6) {
				cad.listarPorAnimal();
			}
			if(opcao == 7) {
				cad.racaMaisComum();	
			}
			if(opcao == 8) {
				cad.generoMaisComum();	
			}
		}
		
		try {
			controle.salvar(cad);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}