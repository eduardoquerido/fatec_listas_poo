package br.com.modelo.fatec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Caixa implements Serializable{
	protected List<Entrada> entradas = new ArrayList<Entrada>();


	public List<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(Entrada entrada) {
		this.entradas.add(entrada);
	}
	
	
}
