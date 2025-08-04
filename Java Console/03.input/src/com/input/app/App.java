package com.input.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Intáncia do objeto de entrada de dados
       Scanner leia = new Scanner(System.in);

       // declaração de variáveis
       String nome;
       String email;
       int idade;

       // input (Entrada de dados)
       System.out.println("Informe seu nome: ");
       nome = leia.nextLine();
       System.out.println("Informe sua idade: ");
       idade = leia.nextInt();

       // limpeza de buffer
       leia.nextLine();

       System.out.println("Informe seu email: ");
       email = leia.nextLine();

       //output (saida de dados)
       System.out.println("nome: " + nome + ".");
       System.out.println("idade: " + idade + ".");
       System.out.println("email: " + email + ".");

       // fecha o objeto
       leia.close();

    }
}
