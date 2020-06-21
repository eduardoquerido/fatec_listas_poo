package models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Atendimento implements Serializable {
	private Profissional profissional;
	private Cliente cliente;
	private Animal animal;
	
	public Atendimento(Profissional profissional, Cliente cliente, Animal animal) {
		super();
		this.profissional = profissional;
		this.cliente = cliente;
		this.animal = animal;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}
