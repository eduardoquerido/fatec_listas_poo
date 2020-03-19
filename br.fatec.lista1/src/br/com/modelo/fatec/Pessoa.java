package br.com.modelo.fatec;

public class Pessoa {
	private String nome;
	private String ddd;
	private String telefone;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	private String servicoProduto;
	private String genero;
	
	

	
	public Pessoa(String nome, String telefone, String ddd, int diaNascimento, int mesNascimento, int anoNascimento, String servicoProduto, String genero) {
		this.nome = nome;
		this.telefone = telefone;
		this.ddd = ddd;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
		this.servicoProduto = servicoProduto;
		this.genero = genero;
		
	}
	@Override
	public String toString() {
		String info = "Nome: "+nome +"\nTelefone: "+"("+ddd+")"+telefone.substring(0, 5)+"-"+telefone.substring(5, 9)
				+ "\nData de Nascimento: "+diaNascimento+"/"+mesNascimento+"/"+anoNascimento
				+ "\nGênero: "+genero 
				+ "\nServiço/Pruduto Consumido: "+servicoProduto+"\n";
		return info;
	}
}
