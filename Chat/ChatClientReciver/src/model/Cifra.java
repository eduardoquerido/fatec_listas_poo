package model;

public class Cifra {
	private String cifrada = new String();
	private String alfabeto[] = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","z"};
	private String mensagem;
	private int cifra;
	public Cifra(Mensagem m) {
		super();
		this.mensagem = m.mensagem;
		this.cifra = m.cifra*-1;
	}
	public String getMensagem() {
		for(int i = 0; i< this.mensagem.length();i++) {
			 if((this.mensagem.charAt(i)+"").equals(" ")) {
				 cifrada+=" ";
			 }
			 else {
				 for(int k=0;k< this.alfabeto.length;k++) {
					 if((this.mensagem.charAt(i)+"").equals(this.alfabeto[k])) {
						 if((this.cifra + k)>=23) {
							 cifrada+=this.alfabeto[(this.cifra+k)-23];
						 }
						 else {
							 cifrada+=this.alfabeto[this.cifra+k];
						 }

					 }
				} 
			 }
			
		}
		
		return cifrada;
	}
	
}
