package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner leia = new Scanner(System.in);

         
        String nome;
        int peso, opcao;
        double altura,result ;
        
          // faca...enquanto
        do {
            // menu
            System.out.println("1 - registrar nova entrada.");
            System.out.println("2 - sair do programa.");
            System.out.println("informe a opção desejada:");
             opcao= leia.nextInt();
             
             if(opcao ==1){
                leia.nextInt();
                System.out.println("informe o nome: ");
                nome = leia.nextLine();
                System.out.println("informe seu peso: ");
                peso = leia.nextInt();
                System.out.println("informe a altura ");
                altura = leia.nextDouble();
             }

             //calculando IMC
             result = peso/(altura*altura);


                // verifica IMC
                if (peso >= 16)


             }

             

         
         


 leia.close();



            }
}
