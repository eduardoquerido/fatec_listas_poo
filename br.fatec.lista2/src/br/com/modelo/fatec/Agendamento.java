package br.com.modelo.fatec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Agendamento implements Serializable{
	
	protected Cliente cliente;
	protected String data;
	protected Estado estado;
	protected Veiculo veiculo;
	protected List<Servico> listaServicos = new ArrayList<Servico>();
	
	public Agendamento(Cliente cliente, String data, Estado estado, Veiculo veiculo ,List<Servico> listaServicos) {
		super();
		this.cliente = cliente;
		this.data = data;
		this.estado = estado;
		this.veiculo = veiculo;
		this.listaServicos = listaServicos;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	public List<Servico> getListaServicos() {
		return listaServicos;
	}

	public void setListaServicos(List<Servico> listaServicos) {
		this.listaServicos = listaServicos;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
