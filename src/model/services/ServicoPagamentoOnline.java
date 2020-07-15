package model.services;

public interface ServicoPagamentoOnline {

	double porcentagemPagamento(double valor);

	double porcentagemParcelas(double valor, int parcelas);
}
