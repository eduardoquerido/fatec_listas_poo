package models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Profissional implements Serializable {
	public String nome;
	public String cpf;
	public String endereco;
	protected Telefone tel;
	
	public Profissional(String nome, String cpf, String endereco, String tel) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.tel = new Telefone(tel);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return tel;
	}

	public void setTelefone(Telefone tel) {
		this.tel = tel;
	}

	public void add(Profissional profissional) {
		// TODO Auto-generated method stub
		
	}
	
}