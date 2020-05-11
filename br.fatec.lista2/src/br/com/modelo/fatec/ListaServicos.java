package br.com.modelo.fatec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.negocio.fatec.Controle;

@SuppressWarnings("serial")
public class ListaServicos implements Serializable{
	public List<Servico> listaServicos = new ArrayList<Servico>();
	
	public void inserir() {
		Controle ctrl = new Controle();
		System.out.println("Nome do servico: ");
		String nome = ctrl.texto();
		System.out.println("Valor do servico: ");
		String valor = ctrl.texto();
		Servico servico = new Servico(nome, valor);
		listaServicos.add(servico);
	}
	
	public void listar() {
		int i = 0;
		for (Servico servico : listaServicos) {
			System.out.println("ID: "+i);
			System.out.println("Nome do servico: " + servico.getNomeServico());
			System.out.println("Valor do servico: "+ servico.getValor());
			i = i+1;
		}
	}
}
