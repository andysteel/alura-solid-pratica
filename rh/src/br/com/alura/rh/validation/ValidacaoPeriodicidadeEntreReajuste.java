package br.com.alura.rh.validation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajuste implements ValidacaoReajuste {
    
    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        var dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        var dataAtual = LocalDate.now();
        long mesesDesdeUtilmoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);

        if(mesesDesdeUtilmoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre reajustes deve ser maior que 6 meses.");
        }
    }

}
