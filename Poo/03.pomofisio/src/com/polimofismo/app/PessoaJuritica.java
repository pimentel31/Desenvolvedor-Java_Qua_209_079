package com.polimofismo.app;

final public class PessoaJuritica extends Pessoa {
      //atributos 
     public String razaoSpcial;
     public String nomeFantasia;
     public String cnpj;

    public PessoaJuritica(String razaoSpcial, String nomeFantasia, String cnpj, String email, String telefone, String endereco) {
        super(email, telefone, endereco);
        this.razaoSpcial = razaoSpcial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }
public String cumprimentar(){
    return "ola, samos da empresa" + this.nomeFantasia + ", de razão social" + this.razaoSpcial + "cujo CNPJ é " + this.cnpj + ", Nosso e-mail é " + this.razaoSpcial + ", nosso telefone de contato é " + this.telefone + " e nosso endereço é " + this.endereco + ".";

}
   

}
