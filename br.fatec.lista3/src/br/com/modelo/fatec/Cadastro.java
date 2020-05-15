package br.com.modelo.fatec;

import java.io.Serializable;

import br.com.negocio.fatec.Controle;

@SuppressWarnings("serial")
public class Cadastro implements Serializable{
	protected String nome;
	protected String telefone;
	protected String endereco;
	protected String email;
	protected String pass;
	protected String login;
	
	
	public void setCadastro() {
		
		// Cadastrar
		
		Controle ctrl = new Controle();
		System.out.println("Nome: ");
		ctrl = new Controle();
		this.nome = ctrl.texto();
		System.out.println("Telefone: ");
		ctrl = new Controle();
		this.telefone = ctrl.texto();
		System.out.println("Endereco: ");
		ctrl = new Controle();
		this.endereco = ctrl.texto();
		System.out.println("Email:");
		ctrl = new Controle();
		this.email = ctrl.texto();
		System.out.println("Login: ");
		ctrl = new Controle();
		this.login = ctrl.texto();
		System.out.println("Senha: ");
		ctrl = new Controle();
		this.pass = ctrl.texto();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	

}
