package br.com.aplicacao.fatec;

import java.io.IOException;

import br.com.modelo.fatec.Agenda;
import br.com.negocio.fatec.Controle;
import br.com.negocio.fatec.Menu;

public class Aplicacao {
	public static void main(String[] args) throws IOException {
		Controle ctrl = new Controle();
		Menu menu = new Menu();
		Agenda ag;
		try {
			ag = ctrl.carregar();
		} catch (Exception e) {
			ag = new Agenda();
		}
		int opc = 100;
		while(opc!=0) {
			menu.menu();
			opc = ctrl.opcao();
			if(opc==1) {
				ag.adicionarServico();
			}
			if(opc == 2) {
				ag.cadastroCliente();
			}
			if(opc==3) {
				ag.inserir();
			}
			if(opc==4) {
				ag.mostrarAgenda();
			}
			if(opc == 5) {
				ag.mostrarServicos();
			}
			if(opc == 6) {
				ag.mudarEstado();
			}
			if(opc == 7) {
				ag.mudarData();
			}
			if(opc == 8) {
				ag.relatorioPorCliente();
			}
		}
		ctrl.salvar(ag);
		
		
		
	}
}
