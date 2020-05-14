package br.com.negocio.fatec;

public class Menu {

	public void menuInicial() {
		System.out.println("Bem vindo ao sistema Financeiro");
	}
	
	public void menuOpc() {
		System.out.println("Selecione a opcao do menu:");
		System.out.println("1 - Cadastrar salário");
		System.out.println("2 - Cadastrar Investimento");
		System.out.println("3 - Cadastrar receita");
		System.out.println("4 - Cadastrar despesas");
		System.out.println("5 - Emitir Relatorio mensal");
		System.out.println("6 - Emitir relatorio semanal");
		System.out.println("7 - Cadastrar novo usuario");
		System.out.println("0 - Sair");
	}
	public void primeiroAcesso() {
		System.out.println("Criar usuario administrador (Primeiro acesso)");
	}
}
