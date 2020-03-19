package br.com.app.fatec;



import java.util.ArrayList;
import java.util.List;

import br.com.modelo.fatec.Pessoa;
import br.com.negocio.fatec.AsciiArt;
import br.com.negocio.fatec.Controle;
import br.com.negocio.fatec.Menu;

public class App {
	public static void main(String[] args) {
		AsciiArt.printAsciiArt("");
		Menu menu = new Menu();
		int op = 1000;
		List<Pessoa> pessoa = new ArrayList<Pessoa>();
		while (op != 0) {
			menu.imprimirMenu();
			Controle ctl = new Controle();
			op = ctl.opcao();
			
			switch (op) {
			case 0:
				break;
			case 1:
				System.out.println("Informe seu nome: ");
				String nome = ctl.texto();
				System.out.println("Informe o DDD(sem o zero): ");
				String ddd = ctl.texto();
				System.out.println("Informe o telefone(9 dígitos): ");
				String telefone = ctl.texto();
				System.out.println("Informe o dia de Nascimento: ");
				int diaNascimento = ctl.textoInt();
				System.out.println("Informe o mês de Nascimento(número): ");
				int mesNascimento = ctl.textoInt();
				System.out.println("Informe o ano de Nascimento: ");
				int anoNascimento = ctl.textoInt();
				System.out.println("Informe seu gênero(Masculino, Feminino ou Outros: ");
				String genero = ctl.texto();
				System.out.println("Informe o produto ou serviço utilizado: ");
				String servicoProduto = ctl.texto();
				Pessoa x = new Pessoa(nome, telefone, ddd, diaNascimento, mesNascimento, anoNascimento, servicoProduto, genero);
				pessoa.add(x);
				break;
			case 2:
				for (Pessoa pessoa2 : pessoa) {
					System.out.println(pessoa2);
				}				
				break;

			}
		}

	}
}







