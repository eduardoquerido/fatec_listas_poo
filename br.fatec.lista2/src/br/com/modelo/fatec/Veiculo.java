package br.com.modelo.fatec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Veiculo implements Serializable{
	protected String placa;
	protected String modelo;
	protected String fabricacao;
	protected String valorCompra;
	public List<Agendamento> listaAgentamento = new ArrayList<Agendamento>();
	public Veiculo(String placa, String modelo, String fabricacao, String valorCompra) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.fabricacao = fabricacao;
		this.valorCompra = valorCompra;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricacao() {
		return fabricacao;
	}
	public void setFabricacao(String fabricacao) {
		this.fabricacao = fabricacao;
	}
	public String getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(String valorCompra) {
		this.valorCompra = valorCompra;
	}
	
}
