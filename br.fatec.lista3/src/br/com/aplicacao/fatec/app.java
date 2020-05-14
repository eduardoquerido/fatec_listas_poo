package br.com.aplicacao.fatec;

import java.io.IOException;

import br.com.modelo.fatec.Cadastro;
import br.com.modelo.fatec.Caixa;
import br.com.modelo.fatec.Entrada;
import br.com.modelo.fatec.Usuario;
import br.com.negocio.fatec.Controle;
import br.com.negocio.fatec.Menu;

public class app {

	public static void main(String[] args) throws IOException {
		String login;
		String pass;
		Menu menu = new Menu();
		Usuario usuario;
		String nome;
		int opc;
		Controle ctrl = new Controle();
		Entrada entrada;
		Cadastro sessao;
		Cadastro novoCadastro;
		double valor;
		menu.menuInicial();
		try {
			usuario = ctrl.carregar();
		} catch (Exception e) {
			menu.primeiroAcesso();
			usuario = new Usuario();
		}
		while(true) {
			
			if(usuario.getCadastros().size()==0) {
				
				novoCadastro = new Cadastro();
				novoCadastro.setCadastro();
				usuario.inserirCadastro(novoCadastro);
				Caixa caixa = new Caixa();
				usuario.setCaixa(caixa);
			}
			System.out.println("Login");
			ctrl = new Controle();
			login = ctrl.texto();
			System.out.println("Senha");
			ctrl = new Controle();
			pass = ctrl.texto();
			sessao = usuario.validacao(login, pass);
		while(sessao != null) {
			System.out.println("Menu usuario: "+ sessao.getNome());
			menu.menuOpc();
			ctrl = new Controle();
			opc = ctrl.opcao();
			if(opc == 1) {
				// Salario
				entrada = new Entrada();
				System.out.println("Valor do salario");
				ctrl = new Controle();
				valor = ctrl.valor();
				entrada.Salario(valor, sessao);
				usuario.getCaixa().setEntradas(entrada);
			}
			if(opc == 2) {
				// Investimento
				entrada = new Entrada();
				System.out.println("Valor do investimento");
				ctrl = new Controle();
				valor = ctrl.valor();
				entrada.Investimento(valor, sessao);
				usuario.getCaixa().setEntradas(entrada);
			}
			if(opc == 3) {
				// Receita
				entrada = new Entrada();
				System.out.println("Valor do receita");
				ctrl = new Controle();
				valor = ctrl.valor();
				entrada.Receita(valor, sessao);
				usuario.getCaixa().setEntradas(entrada);
			}
			if(opc == 4) {
				// Despesas
				entrada = new Entrada();
				System.out.println("Nome da despesa");
				ctrl = new Controle();
				nome = ctrl.texto();
				System.out.println("Valor da despesa");
				ctrl = new Controle();
				valor = ctrl.opcao();
				entrada.despesas(nome, valor, sessao);
				usuario.getCaixa().setEntradas(entrada);
			}
			if(opc == 5) {
				//relatorio mensal
				usuario.relatorio();
			}
			if(opc == 6) {
				//relatorio semanal
				usuario.relatorioSemana();
			}
			if(opc == 7) {
				novoCadastro = new Cadastro();
				novoCadastro.setCadastro();
				usuario.inserirCadastro(novoCadastro);
			}
			if(opc == 0) {
				sessao = null;
				continue;
			}
		}
		ctrl.salvar(usuario);
		}
	}

}
