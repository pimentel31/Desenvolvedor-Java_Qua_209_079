package com.polimofismo.app;

final public class Pessoafisica extends Pessoa {
     //atributos 
     public String nome;
     public String cpf;
     public String dataNacimento;

    public Pessoafisica(String nome, String cpf, String dataNacimento, String email, String telefone, String endereco) {
        super(email, telefone, endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNacimento = dataNacimento;
    }

    public String cumprimentar(){
        return "Olá meu nome é " + this.nome + ", nasci no dia" + this.dataNacimento + ", meu CPF é " + this.cpf + ", moro no endereço " + this.endereco + "meu telefone é " + this.telefone + "e meu e-mail é"
        + this.email + ".";
    }

}
