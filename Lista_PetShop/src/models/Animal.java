package models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Animal implements Serializable
{
	public String raca;
	public String nome;
	public String genero;
	public String idade;
 
	public Animal(String raca, String nome, String genero, String idade) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.genero = genero;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public  String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public void add(Animal animal) {
		// TODO Auto-generated method stub
		
	}
}