package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private int numero_contrato;
	private Date data;
	private Double valor_total;
	
	private List<Prestacao> prestacoes = new ArrayList<>();

	public Contrato(int numero_contrato, Date data, Double valor_total) {
		super();
		this.numero_contrato = numero_contrato;
		this.data = data;
		this.valor_total = valor_total;
	}

	public int getNumero_contrato() {
		return numero_contrato;
	}

	public void setNumero_contrato(int numero_contrato) {
		this.numero_contrato = numero_contrato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValor_total() {
		return valor_total;
	}

	public void setValor_total(Double valor_total) {
		this.valor_total = valor_total;
	}
	
	public List<Prestacao> getPrestacoes(){
		return prestacoes;
	}
	
	public void adicionaPrestacao(Prestacao prestacao) {
		prestacoes.add(prestacao);
	}
	
	public void removePrestacao(Prestacao prestacao) {
		prestacoes.remove(prestacao);
	}
}
