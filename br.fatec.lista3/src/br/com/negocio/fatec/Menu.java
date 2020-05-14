package br.com.negocio.fatec;

public class Menu {

	public void menuInicial() {
		System.out.println("Bem vindo ao sistemas FINTEC!");
	}
	
	public void menuOpc() {
		System.out.println("Selecione a opcao do menu:");
		System.out.println("1 - Entrar com salário");
		System.out.println("2 - Entrar com Investimento");
		System.out.println("3 - Entrar com receita");
		System.out.println("4 - Entrar com despesas");
		System.out.println("5 - Relatorio mensal");
		System.out.println("6 - Relatorio semana dentro do mes");
		System.out.println("99 - Cadastrar novo usuario");
		System.out.println("0 - LogOff");
	}
	public void primeiroAcesso() {
		System.out.println("Primeiro acesso: ");
		System.out.println("Criar usuario administrador");
	}
}
