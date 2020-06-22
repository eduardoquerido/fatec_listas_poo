package model;

import java.util.ArrayList;

public class ListaMensagem {
	private ArrayList<Mensagem> listaMensagem = new ArrayList<Mensagem>();
	
	public void addMensagem(Mensagem mensagem) {
		this.listaMensagem.add(mensagem);
	}

	public ArrayList<Mensagem> getListaMensagem() {
		return listaMensagem;
	}

	public void setListaMensagem(ArrayList<Mensagem> listaMensagem) {
		this.listaMensagem = listaMensagem;
	}
	
}
