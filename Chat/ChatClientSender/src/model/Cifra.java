package model;

public class Cifra {
	 private String cifrada = new String();
	 private String mensagem;
	 private int cifra;
	 private String alfabeto[] = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","z"};
	 
	 
	public Cifra(int cifra, String mensagem) {
		super();
		this.cifra = cifra;
		this.mensagem = mensagem;
	}
	
	public void setCifrada() {
		for(int i = 0; i< this.mensagem.length();i++) {
			if((this.mensagem.charAt(i)+"").equals(" ")) {
				 cifrada+=" ";
			 }
			else {
				for(int k=0;k< this.alfabeto.length;k++) {
					 if((this.mensagem.charAt(i)+"").equals(this.alfabeto[k])) {
						 if((this.cifra + k)>23) {
							 cifrada+=this.alfabeto[(this.cifra+k)-23];
						 }
						 else {
							 cifrada+=this.alfabeto[this.cifra+k];
						 }

					 }
				}
			}
			
		}
	}
	
	public String getCifrada() {
		return this.cifrada;
	}
	
	
	 
}
