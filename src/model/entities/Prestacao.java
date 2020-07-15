package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date pData;
	private Double valor;

	public Prestacao(Date pData, Double valor) {
		this.pData = pData;
		this.valor = valor;
	}

	public Date getpData() {
		return pData;
	}

	public void setpData(Date pData) {
		this.pData = pData;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return sdf.format(pData) + " - " + String.format("%.2f", valor);
	}
}
