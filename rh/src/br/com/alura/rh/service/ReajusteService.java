package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.validation.ValidacaoReajuste;

public class ReajusteService {

	private List<ValidacaoReajuste> validacoes;

	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}
    
    public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(v -> v.validar(funcionario, aumento));

		var salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
}
