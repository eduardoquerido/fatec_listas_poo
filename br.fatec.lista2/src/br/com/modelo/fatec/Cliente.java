package br.com.modelo.fatec;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cliente implements Serializable{
	private String nome;
	private String Telefone;
	private String endereco;
	private String cpf;
	private Veiculo veiculo;
	
	public Cliente(String nome, String telefone, String endereco, String cpf) {
		super();
		this.nome = nome;
		this.Telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		this.Telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
