package br.com.negocio.fatec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import br.com.modelo.fatec.Usuario;


public class Controle {
	public Scanner scanner;

	public Controle() {
		scanner = new Scanner(System.in);
	}

	public int opcao() {
		int op = scanner.nextInt();
		return op;
	}
	public double valor() {
		double valor = scanner.nextDouble();
		return valor;
	}

	public String texto() {
		String t = scanner.nextLine();
		return t;
	}
	
	public Usuario carregar() throws Exception {
		FileInputStream entrada = new FileInputStream("C:\\Users\\Marcio\\Desktop\\finntech.txt");
		ObjectInputStream leitor = new ObjectInputStream(entrada);
		Object ob = leitor.readObject();
		Usuario clientesLista = (Usuario) ob;
		leitor.close();
		return clientesLista;
	}
	
	public void salvar(Usuario clientesLista) throws IOException {
		FileOutputStream saida = new FileOutputStream("C:\\Users\\Marcio\\Desktop\\finntech.txt");
		ObjectOutputStream escritor = new ObjectOutputStream(saida);
		escritor.writeObject(clientesLista);
		escritor.close();
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		scanner.close();
	}
}