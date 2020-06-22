package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;

import com.google.gson.Gson;

public class Server {
	private ListaMensagem listaMensagem = new ListaMensagem();
	private ServerSocket socketServidor;
	
	public Server() throws IOException{
		System.out.println("Iniciando servidor cliente");
		socketServidor = new ServerSocket(1235);
	}
	public void iniciar() throws Exception{
		
		while(true) {
			Gson g = new Gson();
			Cifra c;
			Socket socketEscuta = socketServidor.accept();
			InputStreamReader streamReader = new InputStreamReader(socketEscuta.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);
			String textoEnviado = reader.readLine();
			
			System.out.println("Client chat");
			
			this.listaMensagem = g.fromJson(textoEnviado, ListaMensagem.class);
			System.out.println("=============================================");
			for(Mensagem m : this.listaMensagem.getListaMensagem()) {
				c = new Cifra(m);
				System.out.println(m.nome+": "+c.getMensagem());
			}
			
			
			reader.close();
		}
	}
}
