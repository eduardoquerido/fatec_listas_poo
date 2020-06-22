package model;

public class Mensagem {
	public String nome;
	public String mensagem;
	public int cifra;
	
//	public Mensagem(String nome, String mensagem, String cifra) {
//		super();
//		this.nome = nome;
//		this.mensagem = mensagem;
//		this.cifra = cifra;
//	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public int getCifra() {
		return cifra;
	}
	public void setCifra(int cifra) {
		this.cifra = cifra;
	}
	
	
}
