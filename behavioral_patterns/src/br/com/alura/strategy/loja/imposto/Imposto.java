package br.com.alura.strategy.loja.imposto;

import br.com.alura.strategy.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}