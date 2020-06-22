package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListaContatos {
	public Map<String, String> ContatosDC = new HashMap<String, String>();
	
	public void addContato(String ip, String nome) {
		if(!ContatosDC.containsValue(nome)) {
			ContatosDC.put(nome,ip);	
		}
		
	}
}
