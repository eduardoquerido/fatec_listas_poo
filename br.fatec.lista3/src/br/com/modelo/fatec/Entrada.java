package br.com.modelo.fatec;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Entrada implements Serializable{
	protected String nome;
	protected double valor;
	protected Date data;
	protected Cadastro cadastro;
	public void getEntrada(String nome, double valor, Cadastro cadastro) {
		this.data = new Date();
		this.nome = nome;
		this.valor = valor;
		this.cadastro = cadastro;
	}
	
	public void Salario(double valor, Cadastro cadastro) {
		getEntrada("Salario",valor, cadastro);
	}
	public void Receita(double valor, Cadastro cadastro) {
		getEntrada("Receita",valor,cadastro);
	}
	public void Investimento(double valor, Cadastro cadastro) {
		getEntrada("Investimento",valor, cadastro);
	}
	public void despesas(String nome,double valor, Cadastro cadastro) {
		getEntrada(nome,valor * -1, cadastro);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	
}
