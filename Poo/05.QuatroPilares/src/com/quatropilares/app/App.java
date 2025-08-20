package com.quatropilares.app;

import java.util.Scanner;

import com.quatropilares.model.PessoaFisica;
import com.quatropilares.model.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null,null,null,null,null,null);
        PessoaJuridica empresa = new PessoaJuridica(null,null,null,null,null,null);


        //input do usuário
        System.out.println("Informe os dados do usuário:\n");
        System.out.println("Informe o nome:");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe o CPF:");
        usuario.setCpf(leia.nextLine());
        System.out.println("Informe o data de nascimento:");
        usuario.setDataNascimento(leia.nextLine());
        System.out.println("Informe o E-mail:");
         usuario.setEmail(leia.nextLine());
        System.out.println("Informe o telefone:");
         usuario.setTelefone(leia.nextLine());
        System.out.println("Informe o endereço:");
        usuario.setEndereco(leia.nextLine());

        //input da empresa
        System.out.println("Informe os dados da empresa:\n");
        System.out.println("Informe a razão social:");
        empresa.setRazaoSocial(leia.nextLine());
        System.out.println("Informe o nome da empresa:");
        empresa.setNomeFantasia(leia.nextLine());
        System.out.println("Informe o cnpj:");
        empresa.setCnpj(leia.nextLine());
        System.out.println("Informe o E-mail da empresa:");
        empresa.setEmail(leia.nextLine());
        System.out.println("Informe o telefone da empresa:");
        empresa.setTelefone(leia.nextLine());
        System.out.println("Informe o endereço da empresa:");
        empresa.setEndereco(leia.nextLine());

        //output do usuário
        System.out.println("\nInformações do usuario.\n");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Data de nascimento: " + usuario.getDataNascimento());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Telefone: " + usuario.getTelefone());
        System.out.println("Endereço: " + usuario.getEndereco());

        //output da empresa
        System.out.println("Informações da empresa.\n");
        System.out.println("Razão social: " + empresa.getRazaoSocial());
        System.out.println("Nome da empresa: " + empresa.getNomeFantasia());
        System.out.println("Cnpj: " + empresa.getCnpj());
        System.out.println("E-mail da empresa: " + empresa.getEmail());
        System.out.println("Telefone da empresa: " + empresa.getTelefone());
        System.out.println("Endereço da empresa: " + empresa.getEndereco());


        leia.close();
    }
}
