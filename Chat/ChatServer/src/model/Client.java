package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

import com.google.gson.Gson;

public class Client implements Runnable {
	String ip = "172.16.2.178";
	ArrayList<String> ips = new ArrayList<String>();
	private int porta = 1235;
	private ListaMensagem mensagens;
	private Socket socketCliente;

	public Client(ArrayList<String> ips, ListaMensagem mensagens){
		System.out.println("Fazendo conexao");
		this.mensagens = mensagens;
		this.ips = ips;
	}

	public void concetarEnviar(){
		for(String ip : ips) {
			try {
				System.out.println(ip);
				this.socketCliente = new Socket(ip, this.porta);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				this.ips.remove(ip);
			}
			Gson g = new Gson();
			String json = g.toJson(this.mensagens);
			PrintWriter escritor;
			try {
				escritor = new PrintWriter(socketCliente.getOutputStream());
				System.out.println("Enviando...");
				escritor.write(json);
				escritor.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
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
