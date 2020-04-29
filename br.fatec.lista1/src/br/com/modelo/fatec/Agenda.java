package br.com.modelo.fatec;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import br.com.negocio.fatec.Controle;

@SuppressWarnings("serial")
public class Agenda implements Serializable {
	public List<Contato> contatos = new ArrayList<Contato>();

	public void listarContatos() {
		int i = 0;
		for (Contato contato : contatos) {
			System.out.println("\n======================");
			System.out.println("Contato [" + i + "]");
			System.out.println("Nome: " + contato.getNome() + "\nTelefone: " + contato.getTel().getTel());
			System.out.println("\nData: " + contato.getDataNascimento().getDt() + "\nGênero: " + contato.getGenero());
			i = i + 1;
		}
	}

	public void inserirContato() {
		System.out.println("Por favor, digite as informações do contato:");
		Controle controle = new Controle();
		System.out.println("Nome: ");
		String nome = controle.texto();
		System.out.println("Telefone: ");
		String tel = controle.texto();
		System.out.println("Data de Nasciemnto: ");
		String data = controle.texto();
		System.out.println("Gênero: ");
		String genero = controle.texto();
		Contato controle2 = new Contato(nome, tel, data, genero);
		
		contatos.add(controle2);
	}
	
	public void editarContato() {
		int id;
		Controle controle = new Controle();
		System.out.println("Entre com o indice do contato a ser editado");
		id = controle.opcao();
		System.out.println("Nome: ");
		controle = new Controle();
		String nome = controle.texto();
		System.out.println("Tel: ");
		controle = new Controle();
		String tel = controle.texto();
		System.out.println("Data nasciemnto: ");
		controle = new Controle();
		String data = controle.texto();
		System.out.println("Genero: ");
		controle = new Controle();
		String genero = controle.texto();
		Contato controle2 = new Contato(nome, tel, data, genero);
		contatos.set(id,controle2);
		
	}
	
	public void excluirContato() {
		int id;
		Controle controle = new Controle();
		System.out.println("Entre com o ID do contato que será deletado");
		id = controle.opcao();
		contatos.remove(id);
	}
	
	public void listarOrdemAlfabetica() {
		
		Collections.sort(contatos);
		for (Contato contato : contatos) {
			System.out.println("\n======================");
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Telefone: " + contato.getTel().getTel());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getDt());
			System.out.println("Gênero: " + contato.getGenero());
			System.out.println("\n");
		}
	
	}
	
	public void listarPorGenero() {
		Controle controle = new Controle();
		System.out.println("Entre com o gênero a ser listado");
		String genero = controle.texto();
		Collections.sort(contatos);
		for (Contato contato : contatos) {
		if(contato.getGenero().equals(genero)) {
			System.out.println("\n======================");
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Telefone: " + contato.getTel().getTel());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getDt());
			System.out.println("Gênero: " + contato.getGenero());
			System.out.println("\n");
		}
		}
	}
	
	public void adicionarProduto() {
		int id;
		Controle controle = new Controle();
		System.out.println("Entre com o ID do contato");
		id = controle.opcao();
		contatos.get(id).inserirProduto();
	}
	
	public void idadeMedia() {
		int idade = 0;
		int i=0;
		for (Contato contato : contatos) {
			i = i+1;
			idade = idade + contato.getDataNascimento().getIdade();
		}
		System.out.println("Média de idade dos clientes: " + idade + " anos");
	}
	
	
	public void idadeMediaGenero() {
		int idade = 0;
		int i=0;
		Controle controle = new Controle();
		System.out.println("Qual gênero deseja calcular a média de idades?\n Ex: [Masculino / Feminino / Outros]");
		String genero = controle.texto();
		Collections.sort(contatos);
		for (Contato contato : contatos) {
		if(contato.getGenero().equals(genero)) {
			i = i+1;
			idade = idade + contato.getDataNascimento().getIdade();
		}
		}
		System.out.println("Média de idade dos clientes ["+ genero +"]: "+ idade+" anos");
	}
	
	
	public void listarPorProdutos() {
		
		Collections.sort(contatos);
		for (Contato contato : contatos) {
			System.out.println("\n======================");
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Telefone: " + contato.getTel().getTel());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getDt());
			System.out.println("Gênero: " + contato.getGenero());
			System.out.println("\n++++++++++++++++++++++++");
			System.out.println("\nLista de Produtos de " + contato.getNome()+":");
			int i = 0;
			if (!contato.produtos.isEmpty()) {
				for(Produto prod :contato.produtos) {
					i = i+1;
					System.out.println("\nID do Produto/Serviço: "+"["+ i+"]");
					System.out.println("Nome do Produto/Serviço: "+prod.getProduto());
					System.out.println("Valor do Produto/Serviço: " +"R$"+prod.getValor());
				}
			}
		}
	
	}
	
	public void produtoMaisVendido() throws IOException {
		Map<String, Double> produtosDicionario = new HashMap<String, Double>();
		for (Contato contato : contatos) {
			if (!contato.produtos.isEmpty()) {
				for(Produto prod :contato.produtos) {
					if(produtosDicionario.get(prod.getProduto()) == null) {
						produtosDicionario.put(prod.getProduto(), (double) 1);
					}
					
					produtosDicionario.put(prod.getProduto(), produtosDicionario.get(prod.getProduto()) + 1);
				}
			}
		}
		Double maxValueInMap=(Collections.max(produtosDicionario.values()));
		for (Entry<String, Double> entry : produtosDicionario.entrySet()) { 
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());
            }
        }
	}
	
	public void produtoMaisVendidoPorGenero() throws IOException {
		Controle ctrl = new Controle();
		System.out.println("Entre com o genero a ser listado");
		String genero = ctrl.texto();
		Collections.sort(contatos);
		Map<String, Double> produtosDicionario = new HashMap<String, Double>();
		for (Contato contato : contatos) {
			if(contato.getGenero().equals(genero)) {
			if (!contato.produtos.isEmpty()) {
				for(Produto prod :contato.produtos) {
					if(produtosDicionario.get(prod.getProduto()) == null) {
						produtosDicionario.put(prod.getProduto(), (double) 1);
					}
					
					produtosDicionario.put(prod.getProduto(), produtosDicionario.get(prod.getProduto()) + 1);
				}
			}
		}
		}
		Double maxValueInMap=(Collections.max(produtosDicionario.values()));
		for (Entry<String, Double> entry : produtosDicionario.entrySet()) { 
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());
            }
        }
	}
	
}