package models;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;


@SuppressWarnings("serial")
public class Controle implements Serializable {
	public Scanner scanner;

	public Controle() {
		scanner = new Scanner(System.in);
	}

	public int opcao() {
		int op = scanner.nextInt();
		return op;
	}

	public String texto() {
		String t = scanner.nextLine();
		return t;
	}
	
	public Cadastro carregar() throws Exception {
		FileInputStream entrada = new FileInputStream("cadastros_petshop.txt");
		ObjectInputStream leitor = new ObjectInputStream(entrada);
		Object ob = leitor.readObject();
		Cadastro cad = (Cadastro) ob;
		leitor.close();
		return cad;
	}
	
	public void salvar(Cadastro cad) throws IOException {
		FileOutputStream saida = new FileOutputStream("cadastros_petshop.txt");
		ObjectOutputStream escritor = new ObjectOutputStream(saida);
		escritor.writeObject(cad);
		escritor.close();
	}
	

	@Override
	protected void finalize() throws Throwable {
		scanner.close();
	}
}

