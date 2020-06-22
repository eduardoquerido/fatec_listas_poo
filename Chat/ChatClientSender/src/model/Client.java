package model;

import java.io.PrintWriter;
import java.net.Socket;

import com.google.gson.Gson;

public class Client implements Runnable {
	// String ip = "172.16.2.224";
	int porta = 1234;
	Mensagem mensagem;
	private Socket socketCliente;

	public Client(String ip, Mensagem mensagem) throws Exception {
		System.out.println("Fazendo conexao");
		this.mensagem = mensagem;
		socketCliente = new Socket(ip, porta);
	}

	public void concetarEnviar() throws Exception {
		Gson g = new Gson();
		String json = g.toJson(mensagem);
		PrintWriter escritor = new PrintWriter(socketCliente.getOutputStream());
		System.out.println("Enviando...");
		escritor.write(json);
		escritor.close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			concetarEnviar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
