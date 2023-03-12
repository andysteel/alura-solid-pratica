package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributavel {
    
    private BigDecimal valor;
    private LocalDate data;

    /**
     * @param valor BigDecimal
     * @param data LocalDate
     */
    public Promocao(BigDecimal valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }

    @Override
    public BigDecimal valor() {
        return this.valor;
    }

    @Override
    public LocalDate data() {
        return this.data;
    }

    @Override
    public BigDecimal valorImpostoDeRenda() {
        return this.valor.multiply(new BigDecimal("0.1"));
    }

    
}
