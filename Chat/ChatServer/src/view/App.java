package view;

import java.io.IOException;

import model.Client;
import model.Mensagem;
import model.Server;

public class App {

	public static void main(String[] args) throws Exception {
		Server server = new Server();
		server.iniciar();
//		Mensagem mensagem = new Mensagem("marcio","mensageeeee","3");
//		Client client = new Client("172.16.4.210", mensagem);

	}

}
