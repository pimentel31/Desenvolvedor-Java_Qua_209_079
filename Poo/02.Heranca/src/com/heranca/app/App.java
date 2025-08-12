package com.heranca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // intancia a classe pessoafisica
        Scanner leia = new Scanner(System.in);
        PessoasFisica usuario = new PessoasFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        // definindo valores dos atributos dos usuarios
        System.out.println("Informe o nome do usuario");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o cpf do usuario");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o email do usuario");
        usuario.email = leia.nextLine();
        System.out.println("Informe o telefone do usuario");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe o endereco do usuario");
        usuario.endereco = leia.nextLine();

        // defibindo valores dos atributos da empresa

        System.out.println("Informe o razao social do empresa");
        empresa.razaoSocial = leia.nextLine();
        System.out.println("Informe o nome fantasia do empresa");
        empresa.nomeFantasia = leia.nextLine();
        System.out.println("Informe o email do empresa");
        empresa.email = leia.nextLine();
        System.out.println("Informe o telefone do empresa");
        empresa.telefone = leia.nextLine();
        System.out.println("Informe o cnpj do empresa");
        empresa.cnpj = leia.nextLine();
        System.out.println("Informe o endereco do empresa");
        empresa.endereco = leia.nextLine();

        // output
        System.out.println("nome do usuario: " + usuario.nome);
        System.out.println("CPF do usuario: " + usuario.cpf);
        System.out.println("E-mail do usuario: " + usuario.email);
        System.out.println("telefone do usuario " + usuario.telefone);
        System.out.println("endereço do usurario " + usuario.endereco);
        System.out.println("Razao social " + empresa.razaoSocial);
        System.out.println("Nome Fantasia " + empresa.nomeFantasia);
        System.out.println("CNPJ da empresa " + empresa.cnpj);
        System.out.println("E-mail da empresa " + empresa.email);
        System.out.println("Endereço da empresa " + empresa.endereco);
       
       
        leia.close();

    }
}
