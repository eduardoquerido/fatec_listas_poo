package br.com.modelo.fatec;

public class Pessoa {
	private String nome;
	private String telefone;
	private String datanascimento;
	private String genero;
	

	
	public Pessoa(String nome, String telefone, String datanascimento, String genero) {
		this.nome = nome;
		this.telefone = telefone;
		this.datanascimento = datanascimento; 
		this.genero = genero;
		
	}

	@Override
	public String toString() {
		String info = ""+nome;
		return info;
	}
}
