package com.polimofismo.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // intancias
        Scanner leia = new Scanner(System.in);
        Pessoafisica usuario = new Pessoafisica(null, null, null, null, null, null);
        PessoaJuritica empresa = new PessoaJuritica(null, null, null, null, null, null);

        //input do usuario
        System.out.println("DADOS DO USUARIO:");
             System.out.println("Informe o nome do usuario: ");
        usuario.nome = leia.nextLine();
            System.out.println("Informe o CPF do usuario: ");
        usuario.cpf = leia.nextLine();
             System.out.println("Informe a data de nascimento do usuario");
        usuario.dataNacimento = leia.nextLine();
             System.out.println("Informe o e-mail");
        usuario.email = leia.nextLine();
             System.out.println("Informe o telefone do usuario: ");
        usuario.telefone = leia.nextLine();
             System.out.println("Informe o endereço do usuario: ");
        usuario.telefone = leia.nextLine();


        //imput da empresa
        System.out.println("DADOS DA EMPRESA:");
             System.out.println("Informe a razão social da empresa: ");
        empresa.razaoSpcial = leia.nextLine();
            System.out.println("Informe o nome da empresa: ");
        empresa.nomeFantasia = leia.nextLine();
             System.out.println("Informe o CNPJ da empresa");
        empresa.cnpj = leia.nextLine();
             System.out.println("Informe o e-mail da empresa");
        empresa.email = leia.nextLine();
             System.out.println("Informe o telefone da empresa: ");
        empresa.telefone = leia.nextLine();
             System.out.println("Informe o endereço da empresa: ");
        usuario.endereco = leia.nextLine();


        // executar os metodos dos objetos
        System.out.println(usuario.cumprimentar());
        System.out.println(empresa.cumprimentar());
        

        leia.close();
      
    }
}
