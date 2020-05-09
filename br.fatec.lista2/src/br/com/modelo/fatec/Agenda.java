package br.com.modelo.fatec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.negocio.fatec.Controle;

@SuppressWarnings("serial")
public class Agenda implements Serializable{
	
	public List<Agendamento> agenda = new ArrayList<Agendamento>();
	public List<Servico> listaServicos = new ArrayList<Servico>();
	public List<Cliente> listaClientes = new ArrayList<Cliente>();
	
	public void adicionarServico() {
		Controle ctrl = new Controle();
		System.out.println("Nome do servico: ");
		String nome = ctrl.texto();
		System.out.println("Valor do servico: ");
		String valor = ctrl.texto();
		Servico servico = new Servico(nome, valor);
		listaServicos.add(servico);
	}
	
	public void mostrarServicos() {
		int i = 0;
		for (Servico servico : listaServicos) {
			System.out.println("ID: "+i);
			System.out.println("Nome do servico: " + servico.getNomeServico());
			System.out.println("Valor do servico: "+ servico.getValor());
			i = i+1;
		}
	}
	
	
	public List<Servico> lista() {
		List<Servico> listaServicos = new ArrayList<Servico>();
		int i = 1;
		Controle ctrl = new Controle();
		while(i == 1) {
			mostrarServicos();
			System.out.println("Insira um servico pelo ID: ");
			listaServicos.add(servico());
			System.out.println("1 - para inserir mais um servico:");
			System.out.println("0 - para sair");
			i = ctrl.opcao();
		}
		return listaServicos;
	}
	
	public Servico servico() {
		Controle ctrl = new Controle();
		System.out.println("Entra com o ID do servico: ");
		int i = ctrl.opcao();
		return listaServicos.get(i);
	}
	
	
	public void cadastroCliente() {
		Controle ctrl = new Controle();
		System.out.println("Informações do Cliente");
		System.out.println("Nome do cliente: ");
		String nome = ctrl.texto();
		System.out.println("Telefone: ");
		String tel = ctrl.texto();
		System.out.println("Endereco: ");
		String end = ctrl.texto();
		System.out.println("CPF: ");
		String cpf = ctrl.texto();
		Cliente cliente = new Cliente(nome, tel, end, cpf);
		listaClientes.add(cliente);
	}
	public Veiculo getVeiculo() {
		Controle ctrl = new Controle();
		System.out.println("Informações do Veiculo");
		System.out.println("Placa: ");
		ctrl = new Controle();
		String placa = ctrl.texto();
		System.out.println("Modelo: ");
		ctrl = new Controle();
		String modelo = ctrl.texto();
		System.out.println("Ano: ");
		ctrl = new Controle();
		String ano = ctrl.texto();
		System.out.println("Valor: ");
		ctrl = new Controle();
		String valor = ctrl.texto();
		Veiculo veiculo = new Veiculo(placa, modelo, ano, valor);
		return veiculo;
		
	}
	
	
	public void mostrarClientes() {
		int i = 0;
		for(Cliente c : listaClientes) {
			System.out.println("ID: "+i);
			System.out.println("Nome: " + c.getNome());
			System.out.println("CPF: " + c.getCpf());
			i = i+1;
		}
	}

	public Agendamento getInfo() {
		Controle ctrl = new Controle();
		System.out.println("Selecione o Cliente pelo ID: ");
		mostrarClientes();
		int opc = ctrl.opcao();
		Cliente cliente = listaClientes.get(opc);
		System.out.println("Estado do agendamento:");
		ctrl = new Controle();
		String e = ctrl.texto();
		System.out.println("Data do agendamento: ");
		ctrl = new Controle();
		String data = ctrl.texto();
		Estado estado = new Estado(e);
		Veiculo veiculo = getVeiculo();
		Agendamento ag = new Agendamento(cliente, data, estado, veiculo ,lista());
		veiculo.listaAgentamento.add(ag);
		return ag;
	}
	
	public void inserir() {
		System.out.println("Entrar com o Agentamento");
		agenda.add(getInfo());
	}
	
	public void mostrarAgenda() {
		System.out.println("Agenda Completa :");
		for(Agendamento ag : agenda) {
			System.out.println(ag.getCliente().getNome());
			System.out.println("Servicos: ");
			for(Servico s : ag.getListaServicos()) {
				System.out.println(s.getNomeServico());
			}
			System.out.println("Data: " + ag.getData());
			System.out.println("Estado: " + ag.getEstado().getAtual());
		}
	}
	
	public void relatorioPorCliente() {
		Controle ctrl = new Controle();
		mostrarClientes();
		System.out.println("Relatório:");
		System.out.println("Entre com o ID do cliente: ");
		int id = ctrl.opcao();
		Agendamento ag = agenda.get(id);
			System.out.println("Veiculo: " + ag.getVeiculo().getModelo());
			System.out.println("Placa: " + ag.getVeiculo().getPlaca());
			System.out.println("Servicos: ");
			for(Servico sv : ag.getListaServicos()) {
				System.out.println("Servico: "+ sv.getNomeServico());
				System.out.println("Valor: " + sv.getValor());
				}
			
	}
	
	public void mudarEstado() {
		Controle ctrl = new Controle();
		mostrarClientes();
		System.out.println("Entre com o ID do cliente: ");
		int id = ctrl.opcao();
		Agendamento ag = agenda.get(id);
		System.out.println("Estado atual: " + ag.estado.getAtual());
		System.out.println("Mudar estado para: ");
		ctrl = new Controle();
		String estado = ctrl.texto();
		ag.estado.setAtual(estado);
	}
	
	public void mudarData() {
		Controle ctrl = new Controle();
		mostrarClientes();
		System.out.println("Entre com o Id do cliente: ");
		int id = ctrl.opcao();
		Agendamento ag = agenda.get(id);
		System.out.println("Data atual do agendamento: " + ag.getData());
		System.out.println("Mudar data para: ");
		ctrl = new Controle();
		String data = ctrl.texto();
		ag.setData(data);
	}

}
