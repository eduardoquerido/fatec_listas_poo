package br.com.modelo.fatec;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Servico implements Serializable{
	protected String nomeServico;
	protected String valor;
	public Servico(String nomeServico, String valor) {
		super();
		this.nomeServico = nomeServico;
		this.valor = valor;
	}
	public String getNomeServico() {
		return nomeServico;
	}
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
}
