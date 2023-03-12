package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {
    
    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
        this.empresa = empresa;
    }

    /**
     * @return the dadosPessoais
     */
    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    /**
     * @param dadosPessoais the dadosPessoais to set
     */
    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
}
