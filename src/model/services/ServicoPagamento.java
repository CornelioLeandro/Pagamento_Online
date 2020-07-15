package model.services;

public class ServicoPagamento implements ServicoPagamentoOnline {

	private static final double porcentagem_pagamento = 0.02;
	private static final double porcentagem_parcelas = 0.01; // esse valor pode ser colocado direto no metodo

	@Override
	public double porcentagemPagamento(double valor) {
		return valor * porcentagem_pagamento;
	}

	@Override
	public double porcentagemParcelas(double valor , int parcelas) {
		return valor * porcentagem_parcelas * parcelas;
	}
}
