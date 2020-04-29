package br.com.app.fatec;

import java.io.IOException;

import br.com.modelo.fatec.Agenda;
import br.com.negocio.fatec.Controle;
import br.com.negocio.fatec.Menu;

public class App {
	public static void main(String[] args) throws IOException{
		Agenda agenda = new Agenda();
		Controle controle = new Controle();
		Menu menu = new Menu();
		try {
			agenda = controle.carregar();
		} catch (Exception e) {
			agenda = new Agenda();
		}
		menu.menuAgenda();
		int opcao = 100;
		while(opcao != 0) {
			menu.menu();
			Controle ctrl = new Controle();
			opcao = ctrl.opcao();
			if(opcao == 1) {
				agenda.inserirContato();
			}
			if(opcao == 2) {
				agenda.listarContatos();
			}
			if(opcao == 3) {
				agenda.listarContatos();
				agenda.editarContato();
			}
			if(opcao == 4) {
				agenda.listarContatos();
				agenda.excluirContato();
			}
			if(opcao == 5) {
				agenda.listarOrdemAlfabetica();
			}
			if(opcao == 6) {
				agenda.listarPorGenero();
			}
			if(opcao == 7) {
				agenda.adicionarProduto();
			}
			if(opcao == 8) {
				agenda.listarPorProduto();
			}
			if(opcao == 9) {
				System.out.println("Escolha um tipo de relatorio");
				menu.menu2();
				opcao = ctrl.opcao();
				if(opcao == 1) {
					agenda.idadeMedia();
				}
				if(opcao == 2) {
					agenda.idadeMediaGenero();
				}
				if(opcao == 3) {
					agenda.produtoMaisVendido();
				}
				if(opcao == 4) {
					agenda.produtoMaisVendidoPorGenero();
				}
				
			}
		}
		try {
			controle.salvar(agenda);
		} catch (IOException e) {
			//Levanta erro em caso de erro no salvamento da agenda
			e.printStackTrace();
			System.out.println("Nao foi possivel salvar sua agenda");
		}
		
	}
}