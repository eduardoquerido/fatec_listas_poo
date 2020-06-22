package view;

import java.io.IOException;

import controller.Controller;
import model.Cifra;
import model.Client;
import model.Mensagem;

public class App {

	public static void main(String[] args) throws Exception {
		Mensagem mensagem;
		Client client;
		Cifra c;
		String m;
		int cifra;
		int saida = 99;
		Controller ctrl = new Controller();
		System.out.println("Entre com o IP: ");
		ctrl = new Controller();
		String ip = ctrl.texto();
		System.out.println("Entre com seu nickName");
		ctrl = new Controller();
		String nome = ctrl.texto();
		mensagem = new Mensagem();
		mensagem.setCifra(0);
		mensagem.setMensagem("entrou na sala");
		mensagem.setNome(nome);
		client = new Client(ip, mensagem);
		client.concetarEnviar();
		
		while(saida!=0) {
			System.out.println("Entre com a mensagem");
			ctrl = new Controller();
			m = ctrl.texto();
			System.out.println("Entre com a cifra de codificacao");
			ctrl = new Controller();
			cifra = ctrl.opcao();
			c = new Cifra(cifra,m);
			c.setCifrada();
			mensagem = new Mensagem();
			mensagem.setCifra(cifra);
			mensagem.setMensagem(c.getCifrada());
			mensagem.setNome(nome);
			client = new Client(ip, mensagem);
			client.concetarEnviar();
			System.out.println("Para enviar mais uma mensagem digite 1 para sair 0");
			ctrl = new Controller();
			saida = ctrl.opcao();
		}
		mensagem = new Mensagem();
		mensagem.setCifra(0);
		mensagem.setMensagem("saiu da sala");
		mensagem.setNome(nome);
		client = new Client(ip, mensagem);
		client.concetarEnviar();

	}

}
