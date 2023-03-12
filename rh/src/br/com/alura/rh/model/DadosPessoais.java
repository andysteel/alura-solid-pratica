package br.com.alura.rh.model;

import java.math.BigDecimal;

public class DadosPessoais {
    
    private String nome;
	private String cpf;
	private Cargo cargo;
	private BigDecimal salario;
    
    /**
     * @param nome String
     * @param cpf String
     * @param cargo Cargo
     * @param salario BigDecimal
     */
    public DadosPessoais(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }
    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }
    /**
     * @param cargo the cargo to set
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    /**
     * @return the salario
     */
    public BigDecimal getSalario() {
        return salario;
    }
    /**
     * @param salario the salario to set
     */
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    
}
