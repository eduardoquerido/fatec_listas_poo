package br.com.modelo.fatec;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Estado implements Serializable{
	protected String atual;

	public Estado(String atual) {
		super();
		this.atual = atual;
	}

	public String getAtual() {
		return atual;
	}

	public void setAtual(String atual) {
		this.atual = atual;
	}
	
}
