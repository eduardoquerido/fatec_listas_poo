package br.com.modelo.fatec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.negocio.fatec.Controle;

@SuppressWarnings("serial")
public class Usuario implements Serializable{ 
	protected Caixa caixa;
	public List<Cadastro> cadastros = new ArrayList<Cadastro>();
	
	@SuppressWarnings("deprecation")
	public void relatorio() {
		Controle ctrl = new Controle();
		double total = 0;
		System.out.println("Entre com o mes do relatorio (1 a 12)");
		int mes = ctrl.opcao();
		System.out.println("Relatorio referente ao mes " + mes);
		for(Entrada entrada : this.caixa.getEntradas()) {
			if(entrada.getData().getMonth() == mes-1) {
				total = total + entrada.valor;
				System.out.println("Descricao :"+entrada.nome);
				System.out.println("Valor: "+entrada.valor);
				System.out.println("Autor: "+entrada.cadastro.nome);
			}
		}
		System.out.println("Total: " + total);
	}
	
	@SuppressWarnings("deprecation")
	public void relatorioSemana() {
		Controle ctrl = new Controle();
		double total = 0;
		System.out.println("Entre com o mes do relatorio (1 a 12)");
		int mes = ctrl.opcao();
		System.out.println("Entre com a semana dentro do mes a ser pesquisado (1 a 4)");
		int semana = ctrl.opcao();
		System.out.println("Relatorio semana "+semana+" mes " + mes);
		for(Entrada entrada : this.caixa.getEntradas()) {
			if(entrada.getData().getMonth() == mes-1) {
				if(entrada.getData().getDay()<= (semana*7)) {
					total = total + entrada.valor;
					System.out.println("Descricao :"+entrada.nome);
					System.out.println("Valor: "+entrada.valor);
					System.out.println("Autor: "+entrada.cadastro.nome);
				}
				
			}
		}
		System.out.println("Total: " + total);
	}
	
	
	
	public void inserirCadastro(Cadastro cadastro) {
		this.cadastros.add(cadastro);
	}
	public Caixa getCaixa() {
		return caixa;
	}
	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
	public List<Cadastro> getCadastros() {
		return cadastros;
	}
	public void setCadastros(List<Cadastro> cadastros) {
		this.cadastros = cadastros;
	}
	public Cadastro validacao(String login, String pass) {
		for(Cadastro cadastro: cadastros) {
			if(cadastro.getLogin().contentEquals(login)) {
				if(cadastro.getPass().contentEquals(pass)) {
					return cadastro;
				}
				else {
					System.out.println("senha errada");
				}
			}
			else {
				System.out.println("Login nao encontrado");
			}
		}
		return null;
	}
	
	
	
}
