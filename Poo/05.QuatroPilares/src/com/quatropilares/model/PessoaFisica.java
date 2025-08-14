package com.quatropilares.model;

public class PessoaFisica extends Pessoa {
    private String nome;
    private String dataNacimento;
    private String cpf;

    public PessoaFisica(String nome, String dataNacimento, String cpf, String email, String telefone, String endereco) {
        super(email, telefone, endereco);
        this.nome = nome;
        this.dataNacimento = dataNacimento;
        this.cpf = cpf;

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNacimento() {
        return this.dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
