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
	private ArrayList<String> ips = new ArrayList<String>();
	public Client cliente;
	
	public Server() throws IOException{
		System.out.println("Iniciando servidor");
		socketServidor = new ServerSocket(1234);
	}
	public void iniciar() throws Exception{
		
		int soma = 0;
		while(true) {
			Gson g = new Gson();
			Socket socketEscuta = socketServidor.accept();
			String ip = socketEscuta.getRemoteSocketAddress().toString();
			ip = ip.replaceFirst("/", "");
			ip = ip.substring(0, ip.indexOf(":"));
			if(!ips.contains(ip)) {
				ips.add(ip);
			}
			InputStreamReader streamReader = new InputStreamReader(socketEscuta.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);
			String textoEnviado = reader.readLine();
			
			System.out.println(textoEnviado);
			
			Mensagem mensagem = g.fromJson(textoEnviado, Mensagem.class);
			listaMensagem.addMensagem(mensagem);
			System.out.println(mensagem.getMensagem());
			
			
			reader.close();
			cliente = new Client(ips, listaMensagem);
			cliente.concetarEnviar();
		}
	}
}
