package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Prestacao;

public class ServicoContrato {

	private ServicoPagamentoOnline onlinePagamento;
	
	public ServicoContrato(ServicoPagamentoOnline onlinePagamento) {
		this.onlinePagamento = onlinePagamento;
	}
	
	public void processaContrato(Contrato contrato, int parcelas) {
		double parcelas_basicas = contrato.getValor_total() / parcelas; // valores da parcelas
		for(int i = 1; i <= parcelas; i++) {
			Date data = adicionaMes(contrato.getData(), i);// estou adicinando os meses seguinde até o final da ultima parcela
			double parcelaAtualizada = parcelas_basicas + onlinePagamento.porcentagemParcelas(parcelas_basicas, i);
			double parcelaCheia = parcelaAtualizada + onlinePagamento.porcentagemPagamento(parcelaAtualizada);
			contrato.adicionaPrestacao(new Prestacao(data, parcelaCheia));
		}
	}
	
	public Date adicionaMes(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
