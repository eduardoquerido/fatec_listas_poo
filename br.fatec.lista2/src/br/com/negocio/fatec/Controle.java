package br.com.negocio.fatec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import br.com.modelo.fatec.Agenda;
import br.com.modelo.fatec.Agendamento;

public class Controle {
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
	

	public Agenda carregar() throws Exception {
		FileInputStream entrada = new FileInputStream("F:\\FATEC EAD\\POO\\Lista 2\\POO-java\\lista2\\src\\br\\com\\negocio\\fatec\\agendamento.txt");
		ObjectInputStream leitor = new ObjectInputStream(entrada);
		Object ob = leitor.readObject();
		Agenda ag = (Agenda) ob;
		leitor.close();
		return ag;
	}
	
	public void salvar(Agenda ag) throws IOException {
		FileOutputStream saida = new FileOutputStream("F:\\FATEC EAD\\POO\\Lista 2\\POO-java\\lista2\\src\\br\\com\\negocio\\fatec\\agendamento.txt");
		ObjectOutputStream escritor = new ObjectOutputStream(saida);
		escritor.writeObject(ag);
		escritor.close();
	}
	
	@Override
	protected void finalize() throws Throwable {
		scanner.close();
	}
}