package br.com.negocio.fatec;

public class Menu {
	public void boasVindas() {
		System.out.println("Bem vindo a melhor agenda do mundo!");
	}
	public void menu() {
		System.out.println("### Menu ###");
		System.out.println("1 - Inserir contato");
		System.out.println("2 - Listar contatos");
		System.out.println("3 - Editar contato");
		System.out.println("4 - Excluir contato");
		System.out.println("5 - Listar contatos ordem alfabetica");
		System.out.println("6 - Listar por genero");
		System.out.println("7 - Adicionar produto");
		System.out.println("8 - Listar Clientes com Produtos");
		System.out.println("9 - Relatorios");
		System.out.println("0 - Sair");
	}
	
	public void menu2() {
		System.out.println("1 - Relatorio Idade media");
		System.out.println("2 - Relatorio Idade media por genero");
		System.out.println("3 - Relatorio produto mais consumido");
		System.out.println("4 - Relatorio produto mais consumido por genero");
	}
}