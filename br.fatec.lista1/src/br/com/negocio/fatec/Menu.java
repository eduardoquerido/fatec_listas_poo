package br.com.negocio.fatec;

public class Menu {
	public void menuAgenda() {
		System.out.println("Bem Vindo a sua agenda de Contatos");
	}
	public void menu() {
		System.out.println("+++++++++ Menu +++++++++");
		System.out.println("1 - Inserir contato");
		System.out.println("2 - Listar contatos");
		System.out.println("3 - Editar contato");
		System.out.println("4 - Excluir contato");
		System.out.println("5 - Listar contatos ordem alfabética");
		System.out.println("6 - Listar por Gênero");
		System.out.println("7 - Adicionar novo Produto");
		System.out.println("8 - Listar clientes com seus Produtos");
		System.out.println("9 - Relatórios");
		System.out.println("0 - Sair");
	}
	
	public void menu2() {
		System.out.println("1 - Média de idade dos clientes");
		System.out.println("2 - Média de idade dos cliente por gênero");
		System.out.println("3 - Qual produto mais consumido");
		System.out.println("4 - Qual produto mais consumido por gênero");
	}
}