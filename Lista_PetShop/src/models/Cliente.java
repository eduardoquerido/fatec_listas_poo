package models;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Cliente implements Serializable, Comparable<Cliente> {
	private String nome;
	private String CPF;
	private String Endereco;
	protected Telefone tel;
    public List<Animal>animais = new ArrayList<Animal>();
    
	public Cliente(String nome, String CPF, String endereco, String tel) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.Endereco = endereco;
		this.tel = new Telefone(tel);
	}

	public void adicionarAnimal(Animal animal) {
		if (animais.size() < 5) {
			this.animais.add(animal);
		}
		else {
			System.out.println("Não é possível cadastrar mais animais.");
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public Telefone getTelefone() {
		return tel;
	}

	public void setTelefone(Telefone tel) {
		this.tel = tel;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public void inserirAnimais() {
		if (animais.size() < 5) {
			System.out.println("Informações do Animal\n");
			Controle controle = new Controle();
			System.out.println("Nome do Animal: ");
			String nome = controle.texto();
			System.out.println("Raça do Animal: ");
			String raca = controle.texto();
			System.out.println("Gênero do Animal: ");
			String genero = controle.texto();
			System.out.println("Idade do Animal: ");
			String idade = controle.texto();
			Animal animal = new Animal(raca, nome, genero, idade);
			this.animais.add(animal);
		}
		else {
			System.out.println("Não é possível cadastrar mais animais para esse cliente.");
		}
	}
	
	@Override
	public int compareTo(Cliente o) {
		return nome.compareTo(o.nome);
	}
	
}
