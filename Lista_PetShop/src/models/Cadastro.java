package models;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


@SuppressWarnings("serial")
public class Cadastro implements Serializable {
	public List<Profissional> profissionais = new ArrayList<Profissional>();
	public List<Cliente> clientes = new ArrayList<Cliente>();
	public List<Animal> animais = new ArrayList<Animal>();
	
	public void listaProfissional() {
		int i = 0;
		for (Profissional profissional : profissionais) {
			System.out.println("Profissional:" +"["+i+"]");
			System.out.println("nome: " + profissional.getNome());
			System.out.println("CPF: " + profissional.getCPF());
			System.out.println("Endereço: " + profissional.getEndereco());
			System.out.println("Telefone: " + profissional.getTelefone());
			System.out.println();		
			i = i + 1;
		}
	}
	
	public void inserirProfissional() {

		System.out.println("Por favor, informe o nome do profissional:");
		Controle controle = new Controle();
		System.out.println("Nome: ");
		String nome = controle.texto();
		System.out.println("CPF: ");
		String cpf = controle.texto();
		System.out.println("Endereço: ");
		String endereco = controle.texto();
		System.out.println("Telefone: ");
		String telefone = controle.texto();
		
		Profissional profissional = new Profissional(nome, cpf, endereco, telefone);
		
		profissionais.add(profissional);
	}
	
	public void listaCliente() {
		int i = 0;
		for (Cliente cliente : clientes) {
			System.out.println("Cliente:" +"["+i+"]");
			System.out.println("nome: " + cliente.getNome());
			System.out.println("CPF: " + cliente.getCPF());
			System.out.println("Endereço: " + cliente.getEndereco());
			System.out.println("Telefone: " + cliente.getTelefone());
					
			i = i + 1;
		}
	}
	
	public void inserirCliente() {

		System.out.println("Por favor, digite as informações do Cliente:");
		Controle controle = new Controle();
		System.out.println("Nome: ");
		String nome = controle.texto();
		System.out.println("CPF: ");
		String cpf = controle.texto();
		System.out.println("Endereço: ");
		String endereco = controle.texto();
		System.out.println("Telefone: ");
		String telefone = controle.texto();
		
		Cliente cliente = new Cliente(nome, cpf, endereco, telefone);
		clientes.add(cliente);
	}

	public void adicionarAnimal() {
		int id;
		Controle controle = new Controle();
		System.out.println("Entre com o ID do cliente");
		id = controle.opcao();
		clientes.get(id).inserirAnimais();
	}
	
	public void listarAnimal() {
		int i = 0;
		for (Animal animal : animais) {
			System.out.println("Indice:" + i);
			System.out.println("Raça: " + animal.getRaca());
			System.out.println("Idade: " + animal.getIdade() + " genero: " + animal.getGenero());
			i = i + 1;
		}
	}
	
	public void listarPorAnimal() {
		
		Collections.sort(clientes);
		for (Cliente cliente: clientes) {
			System.out.println("\n======================");
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("CPF: " + cliente.getCPF());
			System.out.println("Telefone: " + cliente.getTelefone().getTelefone());
			System.out.println("\n++++++++++++++++++++++++");
			System.out.println("\nLista de Animais de " + cliente.getNome()+":");
			int i = 0;
			if (!cliente.animais.isEmpty()) {
				for(Animal animal :cliente.animais) {
					System.out.println("\nID do Animal: "+"["+ i+"]");
					System.out.println("Nome do animal: "+animal.getNome());
					System.out.println("Raça do animal: " +animal.getRaca());
					System.out.println("Gênero do animal: " +animal.getGenero());
					System.out.println("Idade do animal: " +animal.getIdade());
					i = i+1;
				}
			}
		}
	
	}
	
	public void racaMaisComum(){
		Map<String, Double> animaisDicionario = new HashMap<String, Double>();
		for (Cliente cliente: clientes) {
			if (!cliente.animais.isEmpty()) {
				for(Animal animal:cliente.animais) {
					if(animaisDicionario.get(animal.getRaca()) == null) {
						animaisDicionario.put(animal.getRaca(), (double) 1);
					}
					
					animaisDicionario.put(animal.getRaca(), animaisDicionario.get(animal.getRaca()) + 1);
				}
			}
		}
		Double maxValueInMap=(Collections.max(animaisDicionario.values()));
		for (Entry<String, Double> entry : animaisDicionario.entrySet()) { 
            if (entry.getValue()==maxValueInMap) {
                System.out.println("A raça mais comum no PetShop Horizon hoje é: ");
            	System.out.println(entry.getKey());
            }
        }
	}
	
	public void generoMaisComum(){
		Map<String, Double> animaisDicionario = new HashMap<String, Double>();
		for (Cliente cliente: clientes) {
			if (!cliente.animais.isEmpty()) {
				for(Animal animal:cliente.animais) {
					if(animaisDicionario.get(animal.getGenero()) == null) {
						animaisDicionario.put(animal.getGenero(), (double) 1);
					}
					
					animaisDicionario.put(animal.getGenero(), animaisDicionario.get(animal.getGenero()) + 1);
				}
			}
		}
		Double maxValueInMap=(Collections.max(animaisDicionario.values()));
		for (Entry<String, Double> entry : animaisDicionario.entrySet()) { 
            if (entry.getValue()==maxValueInMap) {
                System.out.println("O gênero mais comum no PetShop Horizon hoje é: ");
            	System.out.println(entry.getKey());
            }
        }
	}
}