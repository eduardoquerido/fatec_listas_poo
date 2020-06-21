package models;

import java.io.Serializable;

public class Telefone implements Serializable{
	protected String tel;

	public Telefone(String texto) {
		tel = texto;
	}

	public String getTelefone() {
		return tel;
	}

	public void setTelefone(String tel) {
		// tratamento
		this.tel = tel;
	}

    @Override
    public String toString() { 
        return String.format(tel); 
    } 

}